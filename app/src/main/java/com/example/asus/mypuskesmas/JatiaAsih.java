package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JatiaAsih extends AppCompatActivity {

    private Button btJatiasih, btJatiluhur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jatia_asih);

        btJatiluhur = (Button) findViewById(R.id.btnJatiluhur);
        btJatiasih = (Button) findViewById(R.id.btnJatiAsih);

        btJatiluhur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/puskesmas+jatiluhur/@-6.3199846,106.947483,17z/data=!3m1!4b1!4m5!3m4!1s0x2e6992f228c69baf:0xdabedf2bb4a30f03!8m2!3d-6.3199899!4d106.9496717");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btJatiasih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Jatiasih/@-6.2930855,106.9625245,17z/data=!3m1!4b1!4m5!3m4!1s0x2e699278af9d4307:0xacc9928d8db6b2ee!8m2!3d-6.2930908!4d106.9647132");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

    }
}
