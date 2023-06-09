package com.example.userstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage.getInstance().loadData(MainActivity.this);
    }
    public void onClickAddUser(View v) {
        Intent intent = new Intent(MainActivity.this,AddUserActivity.class);
        startActivity(intent);
    }

    public void onClickListUsers(View v) {
        Intent intent = new Intent(MainActivity.this,ListUsersActivity.class);
        startActivity(intent);
    }
}