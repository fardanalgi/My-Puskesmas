package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RawaLumbu extends AppCompatActivity {

    private Button btBojongRawalumbu, btBojongMenteng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rawa_lumbu);

        btBojongRawalumbu = (Button) findViewById(R.id.btnBojongRawalumbu);
        btBojongMenteng = (Button) findViewById(R.id.btnBojongMenteng);

        btBojongRawalumbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Pusat+Kesehatan+Masyarakat+Bojong+Rawalumbu/@-6.2775905,106.9966965,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698de69c396a2f:0x8e0c957cd03ee927!8m2!3d-6.2775958!4d106.9988852");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btBojongMenteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Bojong+Menteng/@-6.3002605,106.9935436,17z/data=!3m1!4b1!4m5!3m4!1s0x2e699205904acc93:0xf2545823ece63a8a!8m2!3d-6.3002658!4d106.9957323");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });
    }
}
