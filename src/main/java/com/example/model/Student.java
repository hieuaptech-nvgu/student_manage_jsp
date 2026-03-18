package com.example.model;
import java.time.LocalDate;

public class Student extends User{
    private double gpa;
    private String className;

    public Student(int id, int identificationCode, String name, String gender, String email,
            LocalDate dateOfBirth, String address,
            double gpa, String className) {

        super(id, identificationCode, name, gender, email, dateOfBirth, address);
        this.gpa = gpa;
        this.className = className;
    }

    public double getGpa(){
        return this.gpa;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(
                "Student[gpa=%.2f, className=%s]%n",
                gpa, className);
    }
}
