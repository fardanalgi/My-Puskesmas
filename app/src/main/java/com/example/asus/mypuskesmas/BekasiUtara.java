package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BekasiUtara extends AppCompatActivity {

    public Button btSeroja, btPejuang, btMargamulya, btTelukPucung, btKalibataTengah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bekasi_utara);

        btSeroja = (Button) findViewById(R.id.btnSeroja);
        btPejuang = (Button) findViewById(R.id.btnPejuang);
        btMargamulya = (Button) findViewById(R.id.btnMargaMulya);
        btTelukPucung = (Button) findViewById(R.id.btnTelukPucung);
        btKalibataTengah = (Button) findViewById(R.id.btnKaliabangTengah);

        btSeroja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Seroja+%22+Edelweis+%22/@-6.2115598,106.9874667,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698bf6039d5dfb:0x7946107ae8fcc2f9!8m2!3d-6.2115651!4d106.9896554");
                Intent i = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(i);
            }
        });

        btPejuang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Pejuang/@-6.198633,106.9911134,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698bef0ec7524b:0xf52c1359b8eed790!8m2!3d-6.1986383!4d106.9933021");
                Intent i = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(i);
            }
        });

        btMargamulya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Marga+Mulya/@-6.2300414,107.0026523,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698c1fabb7e83b:0xe80d78e20d42b51b!8m2!3d-6.2300467!4d107.004841");
                Intent i = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(i);
            }
        });

        btTelukPucung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Gulf+PHC+Pucung/@-6.2186336,107.02819,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698ec82a4a2401:0x1311e9f0624f9cdd!8m2!3d-6.2186389!4d107.0303787");
                Intent i = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(i);
            }
        });

        btKalibataTengah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Kaliabang+Tengah/@-6.175669,106.9980855,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698bd6710dd673:0x1f9a4354eb72b384!8m2!3d-6.1756743!4d107.0002742");
                Intent i = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(i);
            }
        });
    }
}
