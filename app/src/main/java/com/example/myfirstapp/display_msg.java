package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class display_msg extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_msg);

        TextView txt = findViewById(R.id.txt_1);
        Intent intent = getIntent();

        String message = intent.getStringExtra("sent_string");
        txt.setText(message);

    }
}
