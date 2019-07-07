package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mSejarah, mPeta, mDaftar, mBantuan, mAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSejarah = (Button) findViewById(R.id.btnSejarah);
        mDaftar = (Button) findViewById(R.id.btnList);
        mBantuan = (Button) findViewById(R.id.btnBantuan);
        mAbout = (Button) findViewById(R.id.btnAbout);

        mSejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Sejarah.class);
                startActivity(i);
            }
        });


        mDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Daftar.class);
                startActivity(i);
            }
        });

        mBantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Bantuan.class);
                startActivity(i);
            }
        });

        mAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,About.class);
                startActivity(i);
            }
        });
    }
}
