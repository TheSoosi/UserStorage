package com.example.userstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class AddUserActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText surname;
    private EditText email;
    private RadioGroup degreeProgram;
    private Context context;
    private CheckBox kandi;
    private CheckBox di;
    private CheckBox doc;
    private CheckBox swim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstName = findViewById(R.id.editFirstName);
        surname = findViewById(R.id.editSurname);
        email = findViewById(R.id.editEmail);
        degreeProgram = findViewById(R.id.degreeProgram);
        kandi = findViewById(R.id.cbKandi);
        di = findViewById(R.id.cbDI);
        doc = findViewById(R.id.cbDoc);
        swim = findViewById(R.id.cbSwim);
        context = this;
    }

    public void onClickAdd(View v) {
        int selectedId = degreeProgram.getCheckedRadioButtonId();
        RadioButton selectedRadio = findViewById(selectedId);
        ArrayList<String> degrees = new ArrayList<>();

        if (kandi.isChecked()) {
            degrees.add(kandi.getText().toString());
        }
        if (di.isChecked()) {
            degrees.add(di.getText().toString());
        }
        if (doc.isChecked()) {
            degrees.add(doc.getText().toString());
        }
        if (swim.isChecked()) {
            degrees.add(swim.getText().toString());
        }

        User user = new User(firstName.getText().toString(), surname.getText().toString(), email.getText().toString(), selectedRadio.getText().toString(), degrees);

        UserStorage storage = UserStorage.getInstance();
        storage.addUser(user);
        storage.saveData(context);

        onBackPressed();
    }

}