package com.example.text_clock_exemplu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextClock tClock;
    private TextView tView;
    private Button btn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tClock=(TextClock) findViewById(R.id.textClock1);
        tView=(TextView) findViewById(R.id.textview1);
        btn =(Button) findViewById(R.id.btnGet);
        btn.setOnClickListener(view -> tView.setText("Este roa: " + tClock.getText()));
    }
}