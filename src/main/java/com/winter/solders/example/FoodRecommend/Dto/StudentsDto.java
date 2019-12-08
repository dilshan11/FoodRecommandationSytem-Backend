package com.winter.solders.example.FoodRecommend.Dto;

public class StudentsDto {
    int studentId;
    String stuname;
    int stuage;
    float stuheight;
    float stuweight;
    int gender;
    String email;
    String password;
    int activelevel;
    public StudentsDto() {
    }

    public StudentsDto(String stuname, int stuage, float stuheight, float stuweight, int gender, String email, String password, int activelevel) {
        this.stuname = stuname;
        this.stuage = stuage;
        this.stuheight = stuheight;
        this.stuweight = stuweight;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.activelevel = activelevel;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public int getStuage() {
        return stuage;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }

    public float getStuheight() {
        return stuheight;
    }

    public void setStuheight(float stuheight) {
        this.stuheight = stuheight;
    }

    public float getStuweight() {
        return stuweight;
    }

    public void setStuweight(float stuweight) {
        this.stuweight = stuweight;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActivelevel() {
        return activelevel;
    }

    public void setActivelevel(int activelevel) {
        this.activelevel = activelevel;
    }

    @Override
    public String toString() {
        return "StudentsDto{" +
                "studentId=" + studentId +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                ", stuheight=" + stuheight +
                ", stuweight=" + stuweight +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", activelevel=" + activelevel +
                '}';
    }
}
