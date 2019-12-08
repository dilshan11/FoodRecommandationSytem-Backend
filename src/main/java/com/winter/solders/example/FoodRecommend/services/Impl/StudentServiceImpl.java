package com.winter.solders.example.FoodRecommend.services.Impl;

import com.winter.solders.example.FoodRecommend.Dto.StudentsDto;
import com.winter.solders.example.FoodRecommend.Entity.StudentsEntity;
import com.winter.solders.example.FoodRecommend.Repositery.StudentRepositery;
import com.winter.solders.example.FoodRecommend.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepositery studentRepositery;

    @Override
    public String registerStudent(StudentsDto studentsDto) {
       StudentsEntity studentsEntity=new StudentsEntity(studentsDto.getStuname(),studentsDto.getStuage(),studentsDto.getStuheight(),studentsDto.getStuweight(),studentsDto.getGender(),studentsDto.getEmail(),studentsDto.getPassword(),studentsDto.getActivelevel());
       try {
           if (studentRepositery.findByEmail(studentsEntity.getEmail()).size() > 0) {
               return "email already register";
           }
           studentRepositery.save(studentsEntity);
           return "successfull";
       }catch (Exception e){
           return "try again";
       }
    }

    @Override
    public StudentsEntity logging_Students(StudentsDto studentsDto) {
         List<StudentsEntity> studentsEntities =studentRepositery.findByEmail(studentsDto.getEmail());
         try {
             if (studentsEntities.size() == 0) {
                 return null;
             }
             if (studentsEntities.size() == 1) {

                 if (studentsEntities.get(0).getPassword().equals(studentsDto.getPassword())) {

                     return studentsEntities.get(0);
                 } else {
                     return null;
                 }
             }
         }catch (Exception e) {
             return null;
         }
         return null;
    }
}
