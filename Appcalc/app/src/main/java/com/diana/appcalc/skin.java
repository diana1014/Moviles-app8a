package com.diana.appcalc;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.Toast;

public class skin extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar sbrred = null;

    private SeekBar sbrgreen = null;

    private SeekBar sbrblue = null;

    private SeekBar sbralpha = null;

    private View vie_colors = null;

private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);

        sbrred = findViewById(R.id.sbr_red);
        sbrgreen = findViewById(R.id.sbr_green);
        sbrblue = findViewById(R.id.sbr_blue);
        sbralpha = findViewById(R.id.sbr_alpha);
        vie_colors = findViewById(R.id.viewcolor);

        sbrred.setOnSeekBarChangeListener(this);
        sbrgreen.setOnSeekBarChangeListener(this);
        sbrblue.setOnSeekBarChangeListener(this);
        sbralpha.setOnSeekBarChangeListener(this);

    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        int red = sbrred.getProgress();
        int green = sbrgreen.getProgress();
        int blue = sbrblue.getProgress();
        int alpha = sbralpha.getProgress();

        int color = Color.argb(alpha, red, green, blue);

        vie_colors.setBackgroundColor(color);


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_calc, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        // Handle item selection
        switch (item.getItemId()) {

            case R.id.exit:
                Toast.makeText(this, "seleccionaste exit", Toast.LENGTH_SHORT).show();
                Intent exy = new Intent(this, MainActivity.class);
                startActivity(exy);
                return true;
            case R.id.ic_yellow:
                Toast.makeText(this, "seleccionaste yellow", Toast.LENGTH_SHORT).show();
                sbrred.setProgress(255);
                sbrgreen.setProgress(255);
                sbrblue.setProgress(0);
                sbralpha.setProgress(255);
                break;
            case R.id.ic_red:
                Toast.makeText(this, "seleccionaste red", Toast.LENGTH_SHORT).show();
                sbrred.setProgress(255);
                sbrgreen.setProgress(0);
                sbrblue.setProgress(0);
                sbralpha.setProgress(255);
                break;
            case R.id.ic_green:
                Toast.makeText(this, "seleccionaste green", Toast.LENGTH_SHORT).show();
                sbrred.setProgress(0);
                sbrgreen.setProgress(255);
                sbrblue.setProgress(0);
                sbralpha.setProgress(255);
                break;
            case R.id.ic_blue:
                Toast.makeText(this, "seleccionaste blue", Toast.LENGTH_SHORT).show();
                sbrred.setProgress(0);
                sbrgreen.setProgress(0);
                sbrblue.setProgress(255);
                sbralpha.setProgress(255);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return false;
    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return super.onContextItemSelected(item);
    }


}