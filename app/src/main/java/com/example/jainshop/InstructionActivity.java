package com.example.jainshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class InstructionActivity extends AppCompatActivity {

private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);


        button2 = (Button)findViewById(R.id.button);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startnewActivity();

            }
        });

    }

     public void startnewActivity(){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
        finish();
     }
    }

