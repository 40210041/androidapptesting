package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send_message(View view)
    {
        EditText edt_1 = findViewById(R.id.edt_1);
        Intent intent = new Intent(this, display_msg.class);

        String msg = edt_1.getText().toString();
        intent.putExtra("sent_string", msg);
        startActivity(intent);
    }

}
