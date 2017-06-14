package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void multiple(View view) {
        Intent intent = new Intent(this, Multiple_Question1.class);

        startActivity(intent);
    }

    public void OnClickmtp(View view) {

        Intent i = new Intent(this, Multiple_Question1.class);
        startActivity(i);

    }
    public void true_false(View view) {
        Intent intent = new Intent(this, True_False_Question1.class);

        startActivity(intent);
    }
    public void OnClicktf(View view) {

        Intent i = new Intent(this, True_False_Question1

                .class);
        startActivity(i);
    }

    public void logo_quiz(View view) {
        Intent intent = new Intent(this, Image_Question1.class);

        startActivity(intent);
    }
    public void OnClickqz(View view) {

        Intent i = new Intent(this, Image_Question1.class);
        startActivity(i);
    }


}




