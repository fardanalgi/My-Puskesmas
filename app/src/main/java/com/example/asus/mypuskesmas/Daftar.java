package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Daftar extends AppCompatActivity {

    private Button btBekasiUtara, btBekasiBarat, btBekasiTimur, btBekasiSelatan, btPondokGede, btPondokMelati, btRawalumbu, btJatiasih, btJatisampurna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);

        btBekasiUtara = (Button) findViewById(R.id.btnBekasiUtara);
        btBekasiBarat = (Button) findViewById(R.id.btnBekasiBarat);
        btBekasiTimur = (Button) findViewById(R.id.btnBekasiTimur);
        btBekasiSelatan = (Button) findViewById(R.id.btnBekasiSelatan);
        btPondokGede = (Button) findViewById(R.id.btnPondokGede);
        btPondokMelati = (Button) findViewById(R.id.btnPondokMelati);
        btRawalumbu = (Button) findViewById(R.id.btnRawalumbu);
        btJatiasih = (Button) findViewById(R.id.btnJatiasih);
        btJatisampurna = (Button) findViewById(R.id.btnJatisampurna);

        btBekasiUtara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this,BekasiUtara.class);
                startActivity(i);
            }
        });

        btBekasiBarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this,BekasiBarat.class);
                startActivity(i);
            }
        });

        btBekasiTimur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this,BekasiTimur.class);
                startActivity(i);
            }
        });

        btBekasiSelatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this,BekasiSelatan.class);
                startActivity(i);
            }
        });

        btPondokGede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this,Pondokgede.class);
                startActivity(i);
            }
        });

        btPondokMelati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this,PondokMelati.class);
                startActivity(i);
            }
        });

        btRawalumbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this,RawaLumbu.class);
                startActivity(i);
            }
        });

        btJatiasih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this,JatiaAsih.class);
                startActivity(i);
            }
        });

        btJatisampurna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this,Jatisampurna.class);
                startActivity(i);
            }
        });
    }
}
