package com.digithai.lesson01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int countVarialbe = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Toast.makeText(getApplicationContext(), "ON CREATE", Toast.LENGTH_SHORT).show();

        Button myButton;
        myButton = findViewById(R.id.test_button);
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View myvariable) {
                countVarialbe++;
                ((Button)myvariable).setText("TEST");
                String myMessge = "Hey you click it #"+countVarialbe;
                Toast.makeText(getApplicationContext(), myMessge, Toast.LENGTH_SHORT).show();

            }


        });

        TextView first = findViewById(R.id.first_tv);
        TextView second = findViewById(R.id.second_tv);

        first.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View myvariable) {
                ((TextView)myvariable).setText("wow");

            }


        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        //Toast.makeText(getApplicationContext(), "back from pause", Toast.LENGTH_SHORT).show();

    }



}
