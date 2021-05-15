package com.example.java_6hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        initView();
        initListener();
    }



    public void initView(){
        editText = findViewById(R.id.et_number);
        button = findViewById(R.id.btn2);
    }

    private void initListener(){
        button.setOnClickListener(v -> {
          Intent intent = new Intent();
          intent.putExtra("number", editText.getText().toString());
          setResult(RESULT_OK, intent);
          finish();
        }
        );
    }

}