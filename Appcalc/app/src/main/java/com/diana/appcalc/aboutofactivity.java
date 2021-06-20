package com.diana.appcalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class aboutofactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutofactivity);
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_calc,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        // Handle item selection
        switch (item.getItemId()) {

            case R.id.exit:
                Toast.makeText(this, "seleccionaste exit", Toast.LENGTH_SHORT).show();
                Intent ex = new Intent (this, MainActivity.class);
                startActivity(ex);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}