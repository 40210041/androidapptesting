package com.example.myfirstapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    Button btnfrag1, btnfrag2, btnfrag3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up the buttons
        btnfrag1 = findViewById(R.id.btn_1);
        btnfrag2 = findViewById(R.id.btn_2);
        btnfrag3 = findViewById(R.id.btn_3);


        btnfrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfragment(new show_frag());
            }
        });

        btnfrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfragment(new showfrag2());
            }
        });

        btnfrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfragment(new showfrag3());
            }
        });
    }





    public void send_message(View view)
    {
        EditText edt_1 = findViewById(R.id.edt_1);
        Intent intent = new Intent(this, display_msg.class);

        String msg = edt_1.getText().toString();
        intent.putExtra("sent_string", msg);
        startActivity(intent);
    }




    private void loadfragment(Fragment frag)
    {
        //set up a fragment manager
        FragmentManager frag_manager = getSupportFragmentManager();

        //create a frag transaction to swap the fragments, then commit to save the changes
        FragmentTransaction frag_transaction = frag_manager.beginTransaction();
        frag_transaction.replace(R.id.frag_container, frag);
        frag_transaction.commit(); //save the changes
    }

}
