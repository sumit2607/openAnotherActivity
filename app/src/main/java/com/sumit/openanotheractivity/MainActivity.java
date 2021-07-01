package com.sumit.openanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button mBtnClick;
   private EditText mBtnEditText;
   String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        mBtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                st = mBtnEditText.getText().toString();
                intent.putExtra("keyname", st);
                startActivity(intent);
                finish();

            }
        });


    }

    private void initViews() {
        //    mEtUserName = findViewById(R.id.etUsername);
        mBtnClick = findViewById(R.id.mBtnClick);
        mBtnEditText = findViewById(R.id.mBtnEditText);



    }
}