package com.example.userstorage;

import android.content.Context;
import android.widget.Toast;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserStorage {

    private static final String FILE_NAME = "users.data";

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

    public void saveData(Context context) {
        try {
            ObjectOutputStream writer = new ObjectOutputStream(context.openFileOutput(FILE_NAME, Context.MODE_PRIVATE));
            writer.writeObject(list);
            writer.close();

        } catch (IOException e) {
            Toast.makeText(context, "Cannot save data :(", Toast.LENGTH_SHORT).show();
        }

    }

    public void loadData(Context context) {
        try {
            ObjectInputStream loader = new ObjectInputStream(context.openFileInput(FILE_NAME));
            list = (ArrayList<User>) loader.readObject();
            loader.close();

        } catch (IOException e) {
            Toast.makeText(context, "Cannot load data :(", Toast.LENGTH_SHORT).show();
        } catch (ClassNotFoundException e) {
            Toast.makeText(context, "Cannot load data :(", Toast.LENGTH_SHORT).show();
        }
    }


    public ArrayList<User> getUsers() {
        sortByLastName();
        return list;
    }

    private void sortByLastName () {
        list.sort((u1, u2) -> u1.getSurname().compareToIgnoreCase(u2.getSurname()));

    }

}
