package com.example.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "limit_rand";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view) {
        Toast myToast = Toast.makeText(this, "Soy un Simple Toast Notification!!!", Toast.LENGTH_SHORT);
        myToast.show();
    }


    public void countMe(View view) {
        TextView txtCounter = view.getRootView().findViewById(R.id.txtCounter);
        String count_str = txtCounter.getText().toString();
        Integer count = Integer.parseInt(count_str);
        count++;
        txtCounter.setText(count.toString());
    }


    public void randomMe(View view) {
        Intent randomIntent = new Intent(this, SecondActivity.class);

        TextView txtCounter = view.getRootView().findViewById(R.id.txtCounter);
        String count_str = txtCounter.getText().toString();
        Integer count = Integer.parseInt(count_str);
        randomIntent.putExtra(TOTAL_COUNT, count);
        startActivity(randomIntent);
    }
}
