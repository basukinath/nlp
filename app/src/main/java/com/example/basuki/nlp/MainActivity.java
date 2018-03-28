package com.example.basuki.nlp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printHello(View view){
        Toast.makeText(getApplicationContext(),"Not Available ",Toast.LENGTH_LONG).show();
    }

    public void gotosignup(View view) {

        Intent i = new Intent(MainActivity.this,signup.class);
        startActivity(i);

    }
}
