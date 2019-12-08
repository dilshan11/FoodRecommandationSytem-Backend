package com.winter.solders.example.FoodRecommend.controller;

import com.winter.solders.example.FoodRecommend.Dto.FoodProvidersDto;
import com.winter.solders.example.FoodRecommend.Dto.MealDetailsDto;
import com.winter.solders.example.FoodRecommend.Entity.FoodProvidersEntity;
import com.winter.solders.example.FoodRecommend.Entity.MealDetailsEntity;
import com.winter.solders.example.FoodRecommend.services.FoodProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("foodprovide")
public class FoodProvidersController {

    @Autowired
    FoodProviderService foodProviderService;


    @PostMapping("Register")
    public String getRegister(@RequestBody FoodProvidersDto foodProvidersDto){
       return foodProviderService.registerFoodproviders(foodProvidersDto);
    }

    @PostMapping("logging")
    public FoodProvidersEntity getlogging(@RequestBody FoodProvidersDto foodProvidersDto){
        System.out.println(foodProvidersDto);
        return foodProviderService.logfoodproviders(foodProvidersDto);
    }
    @PostMapping("MealDetails")
    public  String storemealdetails(@RequestBody MealDetailsDto mealDetailsDto){
        foodProviderService.saveMealDetail(mealDetailsDto);
        return "success";
    }

    @GetMapping("foodDetails/{f_id}/{p_id}")
    public List<MealDetailsDto> getalldetails(@PathVariable("f_id")int id,@PathVariable("p_id") int p_id){
       return foodProviderService.getallmeal(id,p_id);
    }


}
