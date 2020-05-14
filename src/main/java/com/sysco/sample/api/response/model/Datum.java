
package com.sysco.sample.api.response.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Datum {

    @SerializedName("employee_age")
    private String mEmployeeAge;
    @SerializedName("employee_name")
    private String mEmployeeName;
    @SerializedName("employee_salary")
    private String mEmployeeSalary;
    @SerializedName("id")
    private String mId;
    @SerializedName("profile_image")
    private String mProfileImage;

    public String getEmployeeAge() {
        return mEmployeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        mEmployeeAge = employeeAge;
    }

    public String getEmployeeName() {
        return mEmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        mEmployeeName = employeeName;
    }

    public String getEmployeeSalary() {
        return mEmployeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        mEmployeeSalary = employeeSalary;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getProfileImage() {
        return mProfileImage;
    }

    public void setProfileImage(String profileImage) {
        mProfileImage = profileImage;
    }

}
