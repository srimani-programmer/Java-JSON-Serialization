package com.admin.customer;

public class Customer {
    private String name;
    private String mobileNumber;
    private int age;
    private String gender;
    private Address address;

    public Customer(String name, String mobileNumber, int age, String gender, Address address) {
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
