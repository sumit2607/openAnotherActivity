package com.sumit.openanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView mBtnTextview;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mBtnTextview = findViewById(R.id.mBtnTextview);
        st = getIntent().getStringExtra("keyname");
mBtnTextview.setText(st);
    }
}