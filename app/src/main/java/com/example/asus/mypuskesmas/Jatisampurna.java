package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jatisampurna extends AppCompatActivity {

    private Button btJatisampurna;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jatisampurna);

        btJatisampurna = (Button) findViewById(R.id.btnJatiSampurna);

        btJatisampurna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas/@-6.3533255,106.917549,17z/data=!3m1!4b1!4m5!3m4!1s0x2e699336c05e98f1:0xd4c936a320134a34!8m2!3d-6.3533308!4d106.9197377");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

    }
}
