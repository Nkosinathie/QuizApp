package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Multiple_Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple__question2);
    }
    public void onClickoxy(View view) {

        Intent i = new Intent (Multiple_Question2.this,Multiple_Question3.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);


    }
    public void onClickhny(View view) {

        Intent i = new Intent (Multiple_Question2.this,Multiple_Question3.class);
        startActivity(i);

    }
    public void onClickmlk(View view) {

        Intent i = new Intent (Multiple_Question2.this,Multiple_Question3.class);
        startActivity(i);

    }
    public void back(View view)
    {
        Intent intent = new Intent(this,Multiple_Question1.class);
        startActivity(intent);
    }
    public void onClickbck(View view)
    {
        Intent intent = new Intent(Multiple_Question2.this,Multiple_Question1.class);
        startActivity(intent);
    }
    public void  next(View view)
    {
        Intent intent = new Intent(Multiple_Question2.this,Multiple_Question3.class);
    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Multiple_Question2.this, Multiple_Question3.class);
        startActivity(intent);
    }

}
