package com.example.userstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AddUserActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText surname;
    private EditText email;
    private RadioGroup degreeProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstName = findViewById(R.id.editFirstName);
        surname = findViewById(R.id.editSurname);
        email = findViewById(R.id.editEmail);
        degreeProgram = findViewById(R.id.degreeProgram);
    }

    public void onClickAdd(View v) {
        int selectedId = degreeProgram.getCheckedRadioButtonId();
        RadioButton selectedRadio = findViewById(selectedId);
        User user = new User(firstName.getText().toString(), surname.getText().toString(), email.getText().toString(), selectedRadio.getText().toString());

        UserStorage storage = UserStorage.getInstance();
        storage.addUser(user);

        onBackPressed();
    }
}