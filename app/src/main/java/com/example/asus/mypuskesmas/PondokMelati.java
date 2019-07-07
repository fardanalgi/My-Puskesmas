package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PondokMelati extends AppCompatActivity {

    public Button btJatiWarna, btJatiRahayu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pondok_melati);

        btJatiWarna = (Button) findViewById(R.id.btnJatiWarna);
        btJatiRahayu = (Button) findViewById(R.id.btnJatiRahayu);

        btJatiWarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Jati+Warna/@-6.3055269,106.9301248,17z/data=!3m1!4b1!4m5!3m4!1s0x2e6992a33ab7d5ab:0x82a97f3a59abc393!8m2!3d-6.3055322!4d106.9323135");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btJatiRahayu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+jatirahayu/@-6.2958807,106.9239284,17z/data=!3m1!4b1!4m5!3m4!1s0x2e6992a794c57927:0x9e4cf52454ba1142!8m2!3d-6.295886!4d106.9261171");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

    }
}
