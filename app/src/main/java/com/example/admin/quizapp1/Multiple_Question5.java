package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Multiple_Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple__question5);
    }
    public void onClickkey(View view) {

        Intent i = new Intent (Multiple_Question5.this,Score_Activity.class);
        startActivity(i);



    }
    public void onClickrwd(View view) {

        Intent i = new Intent (Multiple_Question5.this,Score_Activity.class);
        startActivity(i);

    }
    public void onClickjmc(View view) {

        Intent i = new Intent (Multiple_Question5.this,Score_Activity.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);




    }
    public void back(View view)
    {
        Intent intent = new Intent(this,Multiple_Question4.class);
        startActivity(intent);
    }
    public void onClickbck(View view)
    {
        Intent intent = new Intent(Multiple_Question5.this,Multiple_Question4.class);
        startActivity(intent);
    }
    public void  next(View view)
    {
        Intent intent = new Intent(Multiple_Question5.this,Score_Activity.class);
    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Multiple_Question5.this, Score_Activity.class);
        startActivity(intent);
    }
}
