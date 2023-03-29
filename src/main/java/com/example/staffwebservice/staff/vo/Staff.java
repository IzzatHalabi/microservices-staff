package com.example.staffwebservice.staff.vo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Staff {
    
    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;

    private String staffNo = "";
    private String staffName = "";
    private int gender = GENDER_MALE;

    @JsonCreator
    public Staff(@JsonProperty("staffNo") String staffno, 
                 @JsonProperty("staffName") String staffName,
                 @JsonProperty("gender") int gender) {
                    
        this.staffNo = staffno != null ? staffno : "";
        this.staffName = staffName != null ? staffName : "";
        this.gender = gender;
    }

    public Staff(String staffno, String staffName) {
        this.staffNo = staffno;
        this.staffName = staffName;
    }

    public Staff(){}

    public String getStaffNo() {
        return staffNo;
    }
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }
    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }

}