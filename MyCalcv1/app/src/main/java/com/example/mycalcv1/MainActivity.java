package com.example.mycalcv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText et1,et2;

    private Spinner spi1;

    private TextView resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2 );
        spi1=(Spinner)findViewById(R.id.spinner1);
        resul=(TextView)findViewById(R.id.result);

        String[] opciones ={"Add","Substract","Multiply","Divide"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item, opciones);
        spi1.setAdapter(adapter);
    }

public void oper (View View) {

    int n1, n2;
    int sum, rest, multi, div;
    String selec;

    n1 = Integer.parseInt(et1.getText().toString());
    n2 = Integer.parseInt(et2.getText().toString());
    selec = spi1.getSelectedItem().toString();

    if (selec.equals("Add")) {
        sum = n1 + n2;
        resul.setText(sum);
    } else {
        if (selec.equals("Substract")) {
            rest = n1 - n2;
            resul.setText(rest);
        } else {
            if (selec.equals("Multiply")) {
                multi = n1 * n2;
                resul.setText(multi);
            } else {
                if (selec.equals("Divide")) {
                    div = n1 / n2;
                    resul.setText(div);
                }

            }

        }


    }
}

}


