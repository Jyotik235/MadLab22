package com.example.alertdialogue_201b342;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_jk)
                .setTitle("Be Alert")
                .setMessage("Follow Social Ditancing")
                .setNeutralButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"hello ",Toast.LENGTH_LONG).show();
                    }
                }).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}