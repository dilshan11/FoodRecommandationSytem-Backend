package com.winter.solders.example.FoodRecommend.Repositery;

import com.winter.solders.example.FoodRecommend.Entity.MealDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MealDetailsRepositery extends JpaRepository<MealDetailsEntity,Integer> {

    @Query(value = "select * from meal_entity where food_provider_id=? and meal=?",nativeQuery = true)
    public List<MealDetailsEntity> findfood_mealrelated(Integer food_provider_id,Integer meal);
}
