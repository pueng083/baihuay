package com.example.baihuay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    huay show = new huay();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button randombuttun2 = (Button) findViewById(R.id.random_2);
        randombuttun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, huay.class);
                intent.putExtra("text", "เลขท้าย 2 ตัว");
                intent.putExtra("digit", show.getRandomTwoDigits());
                startActivity(intent);
            }
        });


        Button randombuttun3 = (Button) findViewById(R.id.random_3);
        randombuttun3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, huay.class);
                intent.putExtra("text", "เลขท้าย 3 ตัว");
                intent.putExtra("digit",show.getRandomThreeDigits());
                startActivity(intent);
            }
        });



    }
}
