package com.ravindra.UserManagementSystem.models;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class User {

    @NotNull(message = "User_Id must not be null...")
    private String user_id;

    @NotEmpty(message = "UserId must not be empty...")
    private String name;

    @NotBlank(message = "User name should not be blank...")
    @Size(min = 10,message = "UserName should be greater than size 10...")
    private String user_name;


    @Pattern(regexp = "^\\d{2}\\d{10}$",message = "Must be of 10 digit followed by 2 digit country code.")
    private String mobile_no;

    @Email(message = "It must follow proper format abc@xyz.com ...")
    @NotNull(message = "It must not be null...")
    private String email;

    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message = "Date of birth must be in the format YYYY-MM-DD ...")
    private String dob;

    @NotNull(message = "date can not be null!!")
    private LocalDate date = LocalDate.now();

    @NotNull(message = "time can not be null!!")
    private LocalTime time = LocalTime.now();

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }
}
