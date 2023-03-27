package com.example.userstorage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UserListAdapter extends ArrayAdapter<User> {

    private ArrayList<User> users;
    private Activity context;

    public UserListAdapter(Activity context, ArrayList<User> users) {
        super(context, R.layout.user_list, users);

        this.users = users;
        this.context = context;
    }

    public View getView(int position, View view, ViewGroup parent) {
        View rowView = context.getLayoutInflater().inflate(R.layout.user_list, null, true);

        TextView name = rowView.findViewById(R.id.name);
        TextView email = rowView.findViewById(R.id.email);
        TextView degreeProgram = rowView.findViewById(R.id.degreeProgram);

        User user = users.get(position);
        name.setText(user.getFirstname() + " " + user.getSurname());
        email.setText(user.getEmail());
        degreeProgram.setText(user.getDegreeProgram());

        return rowView;
    }


}
