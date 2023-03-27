package com.example.userstorage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserStorage {
    private static UserStorage instance = null;

    private ArrayList<User> list;

    private UserStorage() {
        list = new ArrayList<>();
    }

    public static UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }

        return instance;
    }

    public void addUser(User user) {
        list.add(user);
    }

    public ArrayList<User> getUsers() {
        return list;
    }
}
