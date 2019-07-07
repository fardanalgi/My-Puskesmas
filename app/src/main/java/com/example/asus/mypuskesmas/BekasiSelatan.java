package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BekasiSelatan extends AppCompatActivity {

    private Button btRawatembaga, btPerumnasDua, btMargaJaya, btPekayonJaya, btJakamulya, btJakasetia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bekasi_selatan);

        btRawatembaga = (Button) findViewById(R.id.btnRawaTembaga);
        btPerumnasDua = (Button) findViewById(R.id.btnPerumnasDua);
        btMargaJaya = (Button) findViewById(R.id.btnMargaJaya);
        btPekayonJaya = (Button) findViewById(R.id.btnPekayonJaya);
        btJakamulya = (Button) findViewById(R.id.btnJakaMulya);
        btJakasetia = (Button) findViewById(R.id.btnJakaSetia);

        btRawatembaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Rawa+Tembaga/@-6.2336333,106.9784002,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698c41d26470f1:0x9217c42ec46a222e!8m2!3d-6.2336333!4d106.9805889");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btPerumnasDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Perumnas+2/@-6.2430978,106.9873913,17z/data=!4m5!3m4!1s0x2e698c36d484011f:0xc6cf179c10509eae!8m2!3d-6.2458174!4d106.9891401");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btMargaJaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Marga+Jaya/@-6.2373959,106.9920766,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698c3caa936f75:0x4673d94f5008b114!8m2!3d-6.2373959!4d106.9942653");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btPekayonJaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Pekayon+Jaya/@-6.2665706,106.9769213,17z/data=!4m5!3m4!1s0x2e698dbb39a56475:0x915908432264ea8b!8m2!3d-6.2668905!4d106.974679");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btJakamulya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Public+health+Jaka+Mulya/@-6.2806366,106.9600281,15z/data=!4m5!3m4!1s0x2e698d9a4ebfe081:0x31cd541f8f356ef5!8m2!3d-6.2806366!4d106.9687828");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btJakasetia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/UPTD+Puskesmas+Jakasetia/@-6.2761105,106.9760012,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698d943335c4b7:0xd43d570bd94fa7ee!8m2!3d-6.2761105!4d106.9781899");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

    }
}
