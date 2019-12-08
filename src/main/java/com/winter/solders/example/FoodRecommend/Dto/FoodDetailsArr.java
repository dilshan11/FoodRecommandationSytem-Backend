package com.winter.solders.example.FoodRecommend.Dto;

import java.util.Arrays;

public class FoodDetailsArr {
    FoodDetails [] cfarr;

    public FoodDetails[] getCfarr() {
        return cfarr;
    }

    public void setCfarr(FoodDetails[] cfarr) {
        this.cfarr = cfarr;
    }

    @Override
    public String toString() {
        return "FoodDetailsArr{" +
                "cfarr=" + Arrays.toString(cfarr) +
                '}';
    }
}
