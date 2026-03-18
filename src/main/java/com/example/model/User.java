package com.example.model;

import java.time.LocalDate;

public abstract class User {
    private int id;
    private int identificationCode;
    private String name;
    private String gender;
    private String email;
    private LocalDate dateOfbirth;
    private String address;

    public User(int id, int identificationCode, String name, String gender, String email, LocalDate dateOfBirth, String address){
        this.id = id;
        this.identificationCode = identificationCode;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.dateOfbirth = dateOfBirth;
        this.address = address;
    }

    public void displayInfo() {
        System.out.printf(
                "User[id=%d, code=%d, name=%s, email=%s, dob=%s, address=%s]%n",
                id, identificationCode, name, gender, email, dateOfbirth, address);
    }
}
