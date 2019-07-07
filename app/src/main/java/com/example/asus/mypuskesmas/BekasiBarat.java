package com.example.asus.mypuskesmas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BekasiBarat extends AppCompatActivity {

    private Button btnKranji, btnBintara, btnBintaraJaya, btnKotaBaru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bekasi_barat);

        btnKranji = (Button) findViewById(R.id.btnKranji);
        btnBintara = (Button) findViewById(R.id.btnBintara);
        btnBintaraJaya = (Button) findViewById(R.id.btnBintaraJaya);
        btnKotaBaru = (Button) findViewById(R.id.btnKotaBaru);

        btnKranji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Kranji+Bekasi+Barat/@-6.2259665,106.9682446,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698c65906b96b5:0x1913ec58b8294e08!8m2!3d-6.2259718!4d106.9704333");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btnBintara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/search/puskesmas+bintara/@-6.2259182,106.9529237,14z/data=!3m1!4b1");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btnBintaraJaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Bintara+Jaya/@-6.2393213,106.9447927,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698bf5773de897:0x26659c73b727db0!8m2!3d-6.2393266!4d106.9469814");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });

        btnKotaBaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puskesmas+Kota+Baru/@-6.2143986,106.9594023,15z/data=!4m5!3m4!1s0x2e698c78f7a10571:0x34d40bdfc33eaca7!8m2!3d-6.214404!4d106.968157");
                Intent i = new Intent(Intent.ACTION_VIEW,uriUrl);
                startActivity(i);
            }
        });
    }
}
