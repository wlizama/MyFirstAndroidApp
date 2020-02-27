package com.example.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "limit_rand";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    public void showRandomNumber() {
        TextView txtRandom = (TextView)findViewById(R.id.txtRandom);
        TextView txtHead = (TextView)findViewById(R.id.txtMsg);

        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        Random random = new Random();
        int randomInt = 0;
        if (count>0) {
            randomInt = random.nextInt(count);
        }

        txtHead.setText(getString(R.string.head_str, count));
        txtRandom.setText(Integer.toString(randomInt));
    }
}
