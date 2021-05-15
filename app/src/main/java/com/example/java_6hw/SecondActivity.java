package com.example.java_6hw;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.net.URI;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    ImageButton btn1, btn_imgb2, btn_browser;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.tv_number);

        btn1 = findViewById(R.id.btn1);
        btn_imgb2 = findViewById(R.id.btn_imgb2);
        btn_browser = findViewById(R.id.btn_browser);
        btn_next = findViewById(R.id.btn_next);

        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 100);
        });

        btn_imgb2.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
            startActivityForResult(intent, 200);

        });
        btn_browser.setOnClickListener(v ->
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
            startActivity(intent);
        });
        btn_next.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivityForResult(intent,300);
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 300 && resultCode == RESULT_OK && data != null){
            textView.setText(data.getStringExtra("number"));

        }

    }
}