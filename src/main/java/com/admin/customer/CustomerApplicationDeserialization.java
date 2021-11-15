package com.admin.customer;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomerApplicationDeserialization {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/srimanikanta/Documents/Development/Serialization/src/main/java/com/admin/customer/CustomerData.json");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String content = bufferedReader.readLine();

        while (content != null){
            stringBuilder.append(content);
            content = bufferedReader.readLine();
        }
        // Deserializing the JSON String to Java Object
        Gson gson = new Gson();
        Customer customer = gson.fromJson(stringBuilder.toString(), Customer.class);
        System.out.println(customer);
    }
}
