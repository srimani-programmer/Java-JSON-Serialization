package com.admin.customer;

import com.google.gson.annotations.SerializedName;

public class CustomerBean {

    @SerializedName("customer_name")
    private String name;
    @SerializedName("customer_mobileNumber")
    private String mobileNumber;
    @SerializedName("customer_age")
    private int age;
    @SerializedName("customer_gender")
    private String gender;
    @SerializedName("customer_address")
    private Address address;

    public CustomerBean(String name, String mobileNumber, int age, String gender, Address address) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String toString(){
        return "Customer Name: " + this.name + "\n" +
                "Customer Mobile Number: " + this.mobileNumber + "\n" +
                "Customer Age: " + this.age + "\n" +
                "Customer Gender: " + this.gender + "\n" +
                "Customer Address: " + this.address.toString();

    }
}
