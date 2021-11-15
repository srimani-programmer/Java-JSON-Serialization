package com.admin.student;

import com.google.gson.Gson;

import java.io.*;

public class JSONDeserializationApplication {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Gson gson = new Gson();
        FileReader fileReader = new FileReader("/Users/srimanikanta/Documents/Development/Serialization/src/main/java/com/admin/student/StudentDetails.json");
        BufferedReader bufferedInputStream = new BufferedReader(fileReader);
        StringBuilder jsonData = new StringBuilder();
        String content = bufferedInputStream.readLine();

        while (content != null ){
            jsonData.append(content);
            content = bufferedInputStream.readLine();
        }

        // Deserializing the Java String to Object
        Student student = gson.fromJson(jsonData.toString(), Student.class);
        System.out.println(student.toString());

    }
}
