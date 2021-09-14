package com.example.chap02_ex02;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 010-8201-7555"));
        startActivity(intent);

    }
}