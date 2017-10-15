package com.example.daffa.kisah25nabi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button nnuh = (Button) findViewById(R.id.nbnuh);
        Button nibrahim = (Button) findViewById(R.id.nbibrahim);
        Button nmusa = (Button) findViewById(R.id.nbmusa);
        Button nisa = (Button) findViewById(R.id.nbisa);
        Button nmuhammad = (Button) findViewById(R.id.nbmuhammad);
        Button biod = (Button) findViewById(R.id.mybio);
        Button apps = (Button) findViewById(R.id.thisapp);

        nnuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuhx = new Intent(getApplicationContext(), nabi_nuh.class);
                startActivity(nuhx);
            }
        });

        nibrahim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ibrahimx = new Intent(getApplicationContext(), nabi_ibrahim.class);
                startActivity(ibrahimx);
            }
        });

        nmusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musax = new Intent(getApplicationContext(), nabi_musa.class);
                startActivity(musax);
            }
        });

        nisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent isax = new Intent(getApplicationContext(), nabi_isa.class);
                startActivity(isax);
            }
        });

        nmuhammad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent muhammadx = new Intent(getApplicationContext(), nabi_muhammad.class);
                startActivity(muhammadx);
            }
        });

        biod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent biox = new Intent(getApplicationContext(), biodata.class);
                startActivity(biox);
            }
        });

        apps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abtaps = new Intent(getApplicationContext(), about.class);
                startActivity(abtaps);
            }
        });
    }

    public void exit(View view) {
        AlertDialog.Builder alrt = new AlertDialog.Builder(this);
        alrt
                .setMessage("Do You Want To Exit?")
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alrtdial = alrt.create();
        alrtdial.show();
    }
}
