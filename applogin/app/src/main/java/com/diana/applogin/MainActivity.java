package com.diana.applogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;



public class MainActivity extends AppCompatActivity {


    private TextInputLayout usuario;
    private TextInputLayout pasw;
    private Button btnsi;
    private Button btnup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario =usuario.findViewById(R.id.inputuser);
        pasw = pasw.findViewById(R.id.inputpass);
        btnsi=btnsi.findViewById(R.id.btnsingin);
        btnup=btnup.findViewById(R.id.btnsingup);

        btnsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }




    public void asingup(View view){

        Intent reg = new Intent (this, appsingup.class);
        startActivity(reg);

    }
    public void listu(View view){

        Intent listus = new Intent (this, ListUser.class);
        startActivity(listus);

    }


}