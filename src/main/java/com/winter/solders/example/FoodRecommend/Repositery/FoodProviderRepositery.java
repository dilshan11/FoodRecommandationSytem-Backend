package com.winter.solders.example.FoodRecommend.Repositery;

import com.winter.solders.example.FoodRecommend.Entity.FoodProvidersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface FoodProviderRepositery  extends JpaRepository<FoodProvidersEntity,Integer> {

    public List<FoodProvidersEntity> findByShemail(String email);
}
