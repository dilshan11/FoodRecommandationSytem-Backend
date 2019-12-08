package com.winter.solders.example.FoodRecommend.Dto;

public class FoodProvidersDto {
    int providerId;
    String shName;
    String shaddress;
    String shemail;
    String shownerName;
    String shpassword;
    int shtel;

    public FoodProvidersDto() {
    }

    public FoodProvidersDto(String shName, String shaddress, String shemail, String shownerName, String shpassword, int shtel) {
        this.shName = shName;
        this.shaddress = shaddress;
        this.shemail = shemail;
        this.shownerName = shownerName;
        this.shpassword = shpassword;
        this.shtel = shtel;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getShName() {
        return shName;
    }

    public void setShName(String shName) {
        this.shName = shName;
    }

    public String getShaddress() {
        return shaddress;
    }

    public void setShaddress(String shaddress) {
        this.shaddress = shaddress;
    }

    public String getShemail() {
        return shemail;
    }

    public void setShemail(String shemail) {
        this.shemail = shemail;
    }

    public String getShownerName() {
        return shownerName;
    }

    public void setShownerName(String shownerName) {
        this.shownerName = shownerName;
    }

    public String getShpassword() {
        return shpassword;
    }

    public void setShpassword(String shpassword) {
        this.shpassword = shpassword;
    }

    public int getShtel() {
        return shtel;
    }

    public void setShtel(int shtel) {
        this.shtel = shtel;
    }

    @Override
    public String toString() {
        return "FoodProvidersDto{" +
                "providerId=" + providerId +
                ", shName='" + shName + '\'' +
                ", shaddress='" + shaddress + '\'' +
                ", shemail='" + shemail + '\'' +
                ", shownerName='" + shownerName + '\'' +
                ", shpassword='" + shpassword + '\'' +
                ", shtel=" + shtel +
                '}';
    }
}
