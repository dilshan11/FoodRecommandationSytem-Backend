package com.winter.solders.example.FoodRecommend.controller;

import com.winter.solders.example.FoodRecommend.Dto.StudentsDto;
import com.winter.solders.example.FoodRecommend.Entity.StudentsEntity;
import com.winter.solders.example.FoodRecommend.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("Register")
    public String test(@RequestBody StudentsDto studentsDto){
        System.out.println(studentsDto);
        return studentService.registerStudent(studentsDto);
    }

    @PostMapping("logging")
    public StudentsEntity makeLogging(@RequestBody StudentsDto studentsDto){
       return studentService.logging_Students(studentsDto);

    }


}
