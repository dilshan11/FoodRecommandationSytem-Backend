package com.winter.solders.example.FoodRecommend.Repositery;

import com.winter.solders.example.FoodRecommend.Entity.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositery extends JpaRepository<StudentsEntity,Integer> {

    public List<StudentsEntity> findByEmail(String email);
}
