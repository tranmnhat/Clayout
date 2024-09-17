package com.example.clayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText inpEmail, inpUN,inpPW,inpCPW;
    private TextView TVR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        TextView btn = findViewById(R.id.alreadyHaveAccount);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });
        inpEmail = findViewById(R.id.inputEmail);
        inpUN = findViewById(R.id.inputUsername);
        inpPW = findViewById(R.id.inputPassword);
        inpCPW= findViewById(R.id.inputConfirmPassword);
        TVR=findViewById(R.id.textView2);
        TextView btn_reg = findViewById(R.id.btnRegister);
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = inpEmail.getText().toString();
                String UName = inpUN.getText().toString();
                String PW = inpPW.getText().toString();
                String CPW = inpCPW.getText().toString();
                TVR.setText("Email: " + email + "\nUserName: " + UName + "\nPassword: " + PW + "\nConfirm Password: " + CPW);
            }
            });


        }
    }
