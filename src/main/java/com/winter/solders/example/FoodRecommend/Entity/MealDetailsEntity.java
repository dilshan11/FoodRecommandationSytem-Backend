package com.winter.solders.example.FoodRecommend.Entity;

import com.winter.solders.example.FoodRecommend.Dto.FoodDetails;

import javax.persistence.*;

@Entity
@Table(name = "MealEntity")
public class MealDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mealId")
    int mealId;

    @Column(name = "camount")
    float camount;

    @Column(name = "meal")
    int meal;

    @Column(name = "foodarr")
    String foodarr;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foodProvider_ID")
    FoodProvidersEntity foodProvidersEntity;

    public MealDetailsEntity() {
    }

    public MealDetailsEntity(float camount, int meal, String foodarr, FoodProvidersEntity foodProvidersEntity) {
        this.camount = camount;
        this.meal = meal;
        this.foodarr = foodarr;
        this.foodProvidersEntity = foodProvidersEntity;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public float getCamount() {
        return camount;
    }

    public void setCamount(float camount) {
        this.camount = camount;
    }

    public String getFoodarr() {
        return foodarr;
    }

    public void setFoodarr(String foodarr) {
        this.foodarr = foodarr;
    }

    public FoodProvidersEntity getFoodProvidersEntity() {
        return foodProvidersEntity;
    }

    public void setFoodProvidersEntity(FoodProvidersEntity foodProvidersEntity) {
        this.foodProvidersEntity = foodProvidersEntity;
    }

    public int getMeal() {
        return meal;
    }

    public void setMeal(int meal) {
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "MealDetailsEntity{" +
                "mealId=" + mealId +
                ", camount=" + camount +
                ", foodarr='" + foodarr + '\'' +
                ", foodProvidersEntity=" + foodProvidersEntity +
                '}';
    }
}
