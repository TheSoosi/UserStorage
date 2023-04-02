package com.example.userstorage;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String firstname;
    private String surname;
    private String email;
    private String degreeProgram;

    private ArrayList<String> degrees = new ArrayList<>();

    public User(String firstname,String surname, String email, String degreeProgram, ArrayList<String> degrees) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.degreeProgram = degreeProgram;
        if (degrees != null) {
            this.degrees = degrees;
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public ArrayList<String> getDegrees() {
        return degrees;
    }

}