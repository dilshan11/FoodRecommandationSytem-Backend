package com.winter.solders.example.FoodRecommend.services.Impl;

//import com.google.gson.Gson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.winter.solders.example.FoodRecommend.Dto.FoodDetails;
import com.winter.solders.example.FoodRecommend.Dto.FoodDetailsArr;
import com.winter.solders.example.FoodRecommend.Dto.FoodProvidersDto;
import com.winter.solders.example.FoodRecommend.Dto.MealDetailsDto;
import com.winter.solders.example.FoodRecommend.Entity.FoodProvidersEntity;
import com.winter.solders.example.FoodRecommend.Entity.MealDetailsEntity;
import com.winter.solders.example.FoodRecommend.Repositery.FoodProviderRepositery;
import com.winter.solders.example.FoodRecommend.Repositery.MealDetailsRepositery;
import com.winter.solders.example.FoodRecommend.services.FoodProviderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FoodProviderServiceImpl implements FoodProviderService {

    @Autowired
    FoodProviderRepositery foodProviderRepositery;

    @Autowired
    MealDetailsRepositery mealDetailsRepositery;
    @Override
    public String registerFoodproviders(FoodProvidersDto foodProvidersDto) {
        FoodProvidersEntity foodProvidersEntity=new FoodProvidersEntity(foodProvidersDto.getShName(),foodProvidersDto.getShaddress(),foodProvidersDto.getShemail(),foodProvidersDto.getShownerName(),foodProvidersDto.getShpassword(),foodProvidersDto.getShtel());
        System.out.println(foodProvidersEntity);
        try {
            if(foodProviderRepositery.findByShemail(foodProvidersEntity.getShemail()).size()>0){
                return "email already register";
            }
            foodProviderRepositery.save(foodProvidersEntity);
            return "successfull";
        }catch (Exception e){
            return "try again";
        }
    }

    @Override
    public FoodProvidersEntity logfoodproviders(FoodProvidersDto foodProvidersDto) {

        List<FoodProvidersEntity> foodProvidersEntities =foodProviderRepositery.findByShemail(foodProvidersDto.getShemail());

        try {
            if (foodProvidersEntities.size() == 0) {
                return null;
            }
            if (foodProvidersEntities.size() == 1) {

                if (foodProvidersEntities.get(0).getShpassword().equals(foodProvidersDto.getShpassword())) {

                    return foodProvidersEntities.get(0);
                } else {

                    return null;
                }
            }
        }catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public String saveMealDetail(MealDetailsDto mealDetailsDto) {
        FoodProvidersEntity foodProvidersEntity=foodProviderRepositery.findById(mealDetailsDto.getProvideId()).get();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = mapper.writeValueAsString(mealDetailsDto.getCfarr());
            MealDetailsEntity mealDetailsEntity=new MealDetailsEntity(mealDetailsDto.getCamount(),mealDetailsDto.getMeal(),jsonString,foodProvidersEntity);
            mealDetailsRepositery.save(mealDetailsEntity);
            return "successful";
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @Override
    public List<MealDetailsDto> getallmeal(int id, int pid) {

    try {
        System.out.println(id+" "+pid);
        ObjectMapper mapper = new ObjectMapper();
        List<MealDetailsEntity> mealDetailsEntityList = mealDetailsRepositery.findfood_mealrelated(pid, id);
        List<MealDetailsDto> mealDetailsDtoList = new ArrayList<>();
        for (MealDetailsEntity mealDetailsEntity : mealDetailsEntityList) {

            String foodarrstri = mealDetailsEntity.getFoodarr();
            System.out.println(foodarrstri);


             FoodDetails[] foodDetails=mapper.readValue(mealDetailsEntity.getFoodarr(),FoodDetails[].class);


           MealDetailsDto mealDetailsDto = new MealDetailsDto(mealDetailsEntity.getFoodProvidersEntity().getProviderId(), mealDetailsEntity.getMeal(), mealDetailsEntity.getCamount(),foodDetails);
           mealDetailsDto.setMealId(mealDetailsEntity.getMealId());
           mealDetailsDtoList.add(mealDetailsDto);
        }
        return mealDetailsDtoList;
    }catch (Exception e){
        System.out.println(e);
    }
//        System.out.println(mealDetailsEntityList.get(0));
        return null;
    }


}
