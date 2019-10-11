package com.example.android_tugaske_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLinear, btnRelative;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);

        btnLinear.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlertDialog.Builder pesan = new AlertDialog.Builder(MainActivity.this);
               pesan.setTitle("Alert Dialog");
               pesan.setMessage("Ini Alert Dialog");
               pesan.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(MainActivity.this, "Anda Memilih OK", Toast.LENGTH_SHORT).show();
                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(pindah);
                   }
               });
               pesan.setNegativeButton("NO", null);
               pesan.show();
            }
        });
        btnRelative.setOnclikListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder pesan = new AlertDialog.Builder(MainActivity.this);
                pesan.setTitle("Alert Dialog");
                pesan.setMessage("Ini Alert Dialog");
                pesan.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Anda Memilih OK", Toast.LENGTH_SHORT).show();
                        Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(pindah);
                    }
                });
                pesan.setNegativeButton("No", null);
                pesan.show();
            }
        });

    }
}
