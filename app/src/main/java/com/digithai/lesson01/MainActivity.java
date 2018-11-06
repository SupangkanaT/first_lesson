package com.digithai.lesson01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int countVarialbe = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Toast.makeText(getApplicationContext(), "ON CREATE", Toast.LENGTH_SHORT).show();

        Button myButton, changeButton, resetButton;

        myButton = findViewById(R.id.test_button);

        final TextView first = findViewById(R.id.first_tv);
        final TextView second = findViewById(R.id.second_tv);

//        second.setText(R.string.text_second);

        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View myvariable) {
                countVarialbe++;
//                ((Button)myvariable).setText("TEST");
                String myMessge = "Hey you click it #"+countVarialbe;
                Toast.makeText(getApplicationContext(), myMessge, Toast.LENGTH_SHORT).show();

                String string_first = getString(R.string.text_first);
                String string_second = getString(R.string.text_second);

                if (first.getText() == string_first){
                    first.setText(string_second);
                    second.setText(string_first);
                } else {
                    first.setText(string_first);
                    second.setText(string_second);
                }
            }
        });

        first.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View myvariable) {
                ((TextView)myvariable).setText("wow");
            }
        });

        final ImageView imageView = findViewById(R.id.my_image);
        changeButton = findViewById(R.id.change_btn);
        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.ice_bear);
            }
        });

        resetButton = findViewById(R.id.reset_btn);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.chi);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        //Toast.makeText(getApplicationContext(), "back from pause", Toast.LENGTH_SHORT).show();

    }



}
