package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BekasiTimur extends AppCompatActivity {

    private Button btPengasinan, btKarangKitri, btArenJaya, btDurenJaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bekasi_timur);

        btPengasinan = (Button) findViewById(R.id.btnPengasinan);
        btKarangKitri = (Button) findViewById(R.id.btnKarangKitri);
        btArenJaya = (Button) findViewById(R.id.btnArenJaya);
        btDurenJaya = (Button) findViewById(R.id.btnDurenJaya);

        btPengasinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/UPTD+Puskesmas+Pengasinan/@-6.2778459,107.0078786,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698e0b971c2309:0x6256d2e9e73970b7!8m2!3d-6.2778512!4d107.0100673");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btKarangKitri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/PHC+Karang+Kitri/@-6.2577617,107.0089183,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698e79380228cd:0xad3a03dcbeaf1fed!8m2!3d-6.257767!4d107.011107");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btArenJaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Aren+Jaya/@-6.2492822,107.0211445,15z/data=!4m5!3m4!1s0x2e698e8b26fb2f53:0xc23a6657fc874092!8m2!3d-6.2492879!4d107.029899");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btDurenJaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Duren+Jaya/@-6.2359398,107.0205638,17z/data=!4m5!3m4!1s0x2e698e9130888b45:0xfb4a3181f450f0da!8m2!3d-6.2359451!4d107.0227525");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });
    }
}
