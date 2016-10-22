package com.example.baihuay;

/**
 * Created by Prachaya on 22/10/2559.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

public class huay extends AppCompatActivity {
    private String[] mDigits = {"0","1","2","3","4","5","6","7","8","9"};
    public Random mRandom = new Random();

    public String getRandomTwoDigits() {
        int randomIndex1 = mRandom.nextInt(mDigits.length);
        int randomIndex2 = mRandom.nextInt(mDigits.length);
        String randomDigits1 = mDigits[randomIndex1];
        String randomDigits2 = mDigits[randomIndex2];

        String digitstwo = randomDigits1+randomDigits2;

        return digitstwo;
    }

    public String getRandomThreeDigits() {
        int randomIndex1 = mRandom.nextInt(mDigits.length);
        int randomIndex2 = mRandom.nextInt(mDigits.length);
        int randomIndex3 = mRandom.nextInt(mDigits.length);
        String randomDigits1 = mDigits[randomIndex1];
        String randomDigits2 = mDigits[randomIndex2];
        String randomDigits3 = mDigits[randomIndex3];

        String digitsthree = randomDigits1+randomDigits2+randomDigits3;

        return digitsthree;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huay);


        Intent intent = getIntent();
        String textView = intent.getStringExtra("text");
        String digit = intent.getStringExtra("digit");

        TextView titleTextView = (TextView) findViewById(R.id.textView);
        titleTextView.setText(textView);

        TextView NameTextView1 = (TextView) findViewById(R.id.digits);
        NameTextView1.setText(digit);



    }
}
