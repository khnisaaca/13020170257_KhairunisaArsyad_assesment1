package com.example.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    LinearLayout btnlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //btnlayout=findViewById(R.id.Btn_pindah0);
        btnlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
            }
        });
    }
}
