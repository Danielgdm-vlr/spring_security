package com.gdm.spring_security.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("admin/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "John Doe"),
            new Student(2, "John Schmo"),
            new Student(3, "Anna Smith")
    );

    @GetMapping
    public List<Student> getStudents(){

        return STUDENTS;
    }

    @PostMapping
    public void registerStudent(@RequestBody Student student){

        System.out.println("register: " + student);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Integer id){

        System.out.println("delete: " + id);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student){

        System.out.println("update: " + student);
    }
}
