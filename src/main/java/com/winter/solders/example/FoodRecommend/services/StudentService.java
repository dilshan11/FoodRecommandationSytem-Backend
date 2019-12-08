package com.winter.solders.example.FoodRecommend.services;

import com.winter.solders.example.FoodRecommend.Dto.StudentsDto;
import com.winter.solders.example.FoodRecommend.Entity.StudentsEntity;

public interface StudentService {

    public String registerStudent(StudentsDto studentsDto);

    public StudentsEntity logging_Students(StudentsDto studentsDto);
}
