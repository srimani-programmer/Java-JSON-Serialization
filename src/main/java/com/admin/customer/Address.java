package com.admin.customer;

public class Address {
    private int doorNumber;
    private String streetName;
    private String locality;
    private String district;
    private String state;
    private String country;
    private int pincode;

    public Address(int doorNumber, String streetName, String locality, String district, String state, String country, int pincode) {
        this.doorNumber = doorNumber;
        this.streetName = streetName;
        this.locality = locality;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public String toString(){
        return this.doorNumber + " " + this.streetName + " " + this.locality + " " + this.district + " " + this.state + " " + this.country + " " + this.pincode;
    }
}
