package com.winter.solders.example.FoodRecommend.Dto;

public class FoodDetails {
    String fname;
    float fcalori;

    public FoodDetails() {
    }

    public FoodDetails(String fname, float fcalori) {
        this.fname = fname;
        this.fcalori = fcalori;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public float getFcalori() {
        return fcalori;
    }

    public void setFcalori(float fcalori) {
        this.fcalori = fcalori;
    }

    @Override
    public String toString() {
        return "FoodDetails{" +
                "fname='" + fname + '\'' +
                ", fcalori=" + fcalori +
                '}';
    }
}
