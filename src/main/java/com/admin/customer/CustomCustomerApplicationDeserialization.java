package com.admin.customer;

import com.google.gson.Gson;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomCustomerApplicationDeserialization {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/srimanikanta/Documents/Development/Serialization/src/main/java/com/admin/customer/CustomCustomerData.json");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String content = bufferedReader.readLine();

        while (content != null){
            stringBuilder.append(content);
            content = bufferedReader.readLine();
        }

        // Deserializing the JSON Data
        Gson gson = new Gson();
        CustomerBean bean = gson.fromJson(stringBuilder.toString(), CustomerBean.class);
        System.out.println(bean);

    }
}
