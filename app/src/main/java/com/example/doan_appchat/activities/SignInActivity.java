package com.example.doan_appchat.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doan_appchat.databinding.ActivitySignInBinding;


public class SignInActivity extends AppCompatActivity {
    private ActivitySignInBinding biding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = ActivitySignInBinding.inflate(getLayoutInflater());

        setContentView(biding.getRoot());
        setListener();
    }
    private void setListener(){
        biding.textCreateNewAccount.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class)));
    }

}