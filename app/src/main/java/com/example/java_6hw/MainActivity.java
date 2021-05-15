package com.example.java_6hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editEmail;
    EditText editPassword;
    Button btnSignIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      editEmail = findViewById(R.id.et_email);
        editPassword = findViewById(R.id.et_password);
        btnSignIn = findViewById(R.id.btn_sign_in);


       btnSignIn.setOnClickListener(v -> {
           if (editEmail.getText().toString().isEmpty() || editPassword.getText().toString().isEmpty()){
               Toast.makeText(this,"Заполните оба поля",Toast.LENGTH_SHORT).show();
           }else {
               Toast.makeText(this,"Добро пожаловать",Toast.LENGTH_SHORT).show();
               btnSignIn.setBackgroundColor(getResources().getColor(R.color.orange));
               Intent intent = new Intent(this, SecondActivity.class);
               startActivity(intent);
           }
       });
    }


}