package com.example.signup_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForgetPass extends AppCompatActivity {

    private Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);
        submitButton = findViewById(R.id.submitButtonId);
        setTitle("Forget Password");
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ForgetPass.this, "Please Check Your Email", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ForgetPass.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}