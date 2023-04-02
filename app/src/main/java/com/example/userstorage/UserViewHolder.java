package com.example.userstorage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    public TextView name, email, degreeProgram, degrees;
    public LinearLayout degreeLayout;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        email = itemView.findViewById(R.id.email);
        degreeProgram = itemView.findViewById(R.id.degreeProgram);
        degreeLayout = itemView.findViewById(R.id.degreeLayout);
        degrees = itemView.findViewById(R.id.degrees);
    }

}
