package com.admin.student;

import com.google.gson.Gson;

public class JSONSerializationApplication {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Creating the Student Object
        Student student = new Student("Jhon", "Doe", "jhondoe@test.com", "peter doe", "Catherine", 30, "9999999999", "8888888888");

        // Serializing the Java Object to JSON String
        String jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}
