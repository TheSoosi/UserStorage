package com.example.userstorage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private ArrayList<User> users;
    private Activity context;

    public UserListAdapter(ArrayList<User> users, Activity context) {
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);
        holder.name.setText(user.getFirstname() + " " + user.getSurname());
        holder.email.setText(user.getEmail());
        holder.degreeProgram.setText(user.getDegreeProgram());

        ArrayList<String> degrees = user.getDegrees();

        if (degrees.size() > 0) {
            String degreesText = "";

            for (String d: degrees) {
                degreesText += "- " + d + "\n";
            }

            degreesText = degreesText.trim();

            holder.degrees.setText(degreesText);
            holder.degreeLayout.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

}
