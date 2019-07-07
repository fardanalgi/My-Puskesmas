package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pondokgede extends AppCompatActivity {

    private Button btPondokGede, btJatiMakmur, btJatiBening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pondokgede);

        btPondokGede = (Button) findViewById(R.id.btnPondokGede);
        btJatiMakmur = (Button) findViewById(R.id.btnJatiMakmur);
        btJatiBening = (Button) findViewById(R.id.btnJatiBening);

        btPondokGede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/PHC+Pondok+Gede/@-6.2828246,106.9112534,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698d3ec58f8cd3:0x748f701457b09e5e!8m2!3d-6.2828246!4d106.9134421");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btJatiMakmur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/PUSKESMAS+Jati+Makmur/@-6.2752347,106.9231362,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698d380a7963c3:0xee99f785fb1b9125!8m2!3d-6.2752347!4d106.9253249");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btJatiBening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/PHC+UPTD+Jatibening/@-6.2618138,106.9539719,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698d06526b9e4d:0x3676655efbc38e5!8m2!3d-6.2618138!4d106.9561606");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });
    }
}
