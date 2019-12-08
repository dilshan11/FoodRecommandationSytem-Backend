package com.winter.solders.example.FoodRecommend.services;

import com.winter.solders.example.FoodRecommend.Dto.FoodProvidersDto;
import com.winter.solders.example.FoodRecommend.Dto.MealDetailsDto;
import com.winter.solders.example.FoodRecommend.Entity.FoodProvidersEntity;
import com.winter.solders.example.FoodRecommend.Entity.MealDetailsEntity;

import java.util.List;

public interface FoodProviderService {

    public String registerFoodproviders(FoodProvidersDto foodProvidersDto);

    public FoodProvidersEntity logfoodproviders(FoodProvidersDto foodProvidersDto);

    public String saveMealDetail(MealDetailsDto mealDetailsDto);

    public List<MealDetailsDto> getallmeal(int id,int pid);
}
