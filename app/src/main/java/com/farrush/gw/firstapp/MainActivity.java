package com.farrush.gw.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Data Type

    String FirstName = "Farras";
    String LastName = "Doko";

    //declare widget

    TextView txtWelcome;
    EditText etnama;
    EditText etsekolah;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("FullName : " + FirstName +LastName);

        //call id from textView
        txtWelcome = (TextView) findViewById(R.id.txtWelcome);
        etnama = (EditText) findViewById(R.id.etnama);
        etsekolah = (EditText) findViewById(R.id.etsekolah);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        //add action to btnSubmit if clicked
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //put value from frm etnama & etsekolah
                String nNama = etnama.getText().toString();
                String nSekolah = etsekolah.getText().toString();

                //show result to textView
                txtWelcome.setText("Hallo, " + nNama + nSekolah);

            }
        });
/*
        //show text to textView
        txtWelcome.setText("Hy, " + FirstName + LastName);
        */
    }
}
