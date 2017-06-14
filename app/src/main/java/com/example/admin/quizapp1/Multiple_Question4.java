package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.admin.quizapp1.MainActivity.score;

public class Multiple_Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple__question4);
    }
    public void onClicksng(View view) {

        Intent i = new Intent (Multiple_Question4.this,Multiple_Question5.class);
        startActivity(i);



    }
    public void onClickjkt(View view) {

        Intent i = new Intent (Multiple_Question4.this,Multiple_Question5.class);
        startActivity(i);

    }
    public void onClickptr(View view) {

        Intent i = new Intent (Multiple_Question4.this,Multiple_Question5.class);
        startActivity(i);


        score = score +1;
        i.putExtra("score", score);
        startActivity(i);


    }
    public void back(View view)
    {
        Intent intent = new Intent(this,Multiple_Question3.class);
        startActivity(intent);
    }
    public void onClickbck(View view)
    {
        Intent intent = new Intent(Multiple_Question4.this,Multiple_Question3.class);
        startActivity(intent);
    }
    public void  next(View view)
    {
        Intent intent = new Intent(Multiple_Question4.this,Multiple_Question5.class);
    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Multiple_Question4.this, Multiple_Question5.class);
        startActivity(intent);
    }
}
