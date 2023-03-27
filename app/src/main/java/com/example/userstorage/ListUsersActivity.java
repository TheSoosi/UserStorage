package com.example.userstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListUsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);

        UserStorage storage = UserStorage.getInstance();

        UserListAdapter adapter = new UserListAdapter(this, storage.getUsers());

        ListView list = findViewById(R.id.userList);
        list.setAdapter(adapter);
    }
}