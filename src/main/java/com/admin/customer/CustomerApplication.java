package com.admin.customer;

import com.google.gson.Gson;

public class CustomerApplication {
    public static void main(String[] args) {
        // Creating the GSON Instance
        Gson gson = new Gson();

        Address address = new Address(121, "Main Street", "Gandhi Nagar", "New District", "Andhra Pradesh", "India", 600079);

        Customer customer = new Customer("Jhon Doe", "9999999999", 29, "Male", address);

        // JSON String by serializing the Java Object
        String jsonString = gson.toJson(customer);

        System.out.println(jsonString);


    }
}
