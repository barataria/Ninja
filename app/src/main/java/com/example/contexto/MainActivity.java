package com.example.contexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvAppContexto = new TextView (getApplicationContext());
        tvAppContexto.setText ("Contexto de la APP");
        tvAppContexto.setTextSize(30);


        TextView tvActivityContexto = new TextView (this);
        tvActivityContexto.setText ("Contexto de la APp");
        tvActivityContexto.setTextSize(30);

        LinearLayout miLayout = findViewById(R.id.layout);
        miLayout.addView(tvAppContexto);
        miLayout.addView(tvActivityContexto);


    }
}
