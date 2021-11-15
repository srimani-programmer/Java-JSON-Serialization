package com.admin.student;

public class Student {
    private String firstName;
    private String lastName;
    private String emailId;
    private String fatherName;
    private String motherName;
    private int age;
    private String studentMobileNumber;
    private String fatherMobileNumber;

    public Student(String firstName, String lastName, String emailId, String fatherName, String motherName, int age, String studentMobileNumber, String fatherMobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.age = age;
        this.studentMobileNumber = studentMobileNumber;
        this.fatherMobileNumber = fatherMobileNumber;
    }

    @Override
    public String toString(){
        return "FirstName: " + this.firstName + "\n" +
                "LastName: " + this.lastName + "\n" +
                "EmailId: " + this.emailId + "\n" +
                "Father Name: " + this.fatherName + "\n" +
                "Mother Name: " + this.motherName + "\n" +
                "Age: " + this.age + "\n" +
                "Student Mobile Number: " + this.studentMobileNumber + "\n" +
                "Father Mobile Number: " + this.fatherMobileNumber;
    }
}
