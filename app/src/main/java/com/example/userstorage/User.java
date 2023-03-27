package com.example.userstorage;

public class User {
    private String firstname;
    private String surname;
    private String email;
    private String degreeProgram;

    public User(String firstname,String surname, String email, String degreeProgram) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.degreeProgram = degreeProgram;
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
}