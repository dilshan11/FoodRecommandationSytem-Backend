package com.winter.solders.example.FoodRecommend.Dto;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MealDetailsDto {
    int mealId;
    int provideId;
    int meal;
    float camount;
    FoodDetails [] cfarr;

    public MealDetailsDto() {
    }

    public MealDetailsDto(int provideId, int meal, float camount, FoodDetails[] cfarr) {
        this.provideId = provideId;
        this.meal = meal;
        this.camount = camount;
        this.cfarr = cfarr;
    }

    public int getMeal() {
        return meal;
    }

    public void setMeal(int meal) {
        this.meal = meal;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getProvideId() {
        return provideId;
    }

    public void setProvideId(int provideId) {
        this.provideId = provideId;
    }

    public FoodDetails[] getCfarr() {
        return cfarr;
    }

    public void setCfarr(FoodDetails[] cfarr) {
        this.cfarr = cfarr;
    }

    public float getCamount() {
        return camount;
    }

    public void setCamount(float camount) {
        this.camount = camount;
    }

    @Override
    public String toString() {
        return "MealDetailsDto{" +
                "mealId=" + mealId +
                ", provideId=" + provideId +
                ", camount=" + camount +
                ", cfarr=" + Arrays.toString(cfarr) +
                '}';
    }
}
