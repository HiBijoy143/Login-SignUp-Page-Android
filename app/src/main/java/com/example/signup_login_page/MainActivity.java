package com.example.signup_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button loginButton, signUpButton;
    private TextView forgetPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.login_btn);
        signUpButton = findViewById(R.id.signup_btn);
        forgetPass= findViewById(R.id.forget_passID);

        loginButton.setOnClickListener(this);
        signUpButton.setOnClickListener(this);
        forgetPass.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.login_btn)
        {
            Toast.makeText(this, "Login Succesfull", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, HomePage.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.signup_btn)
        {
            Toast.makeText(this, "Go to Signup", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SignUp.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.forget_passID)
        {
            Intent intent = new Intent(MainActivity.this, ForgetPass.class);
            startActivity(intent);

        }
    }
}