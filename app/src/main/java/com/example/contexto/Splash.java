package com.example.contexto;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    private Handler esperar = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        esperar.postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                catch  (Exception ignored) {
                    ignored.printStackTrace();
                }
            }
        }, 1000);


    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
    }

