package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Multiple_Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple__question3);
    }
    public void onClickrdj(View view) {

        Intent i = new Intent (Multiple_Question3.this,Multiple_Question4.class);
        startActivity(i);



    }
    public void onClickmtv(View view) {

        Intent i = new Intent (Multiple_Question3.this,Multiple_Question4.class);
        startActivity(i);

    }
    public void onClicksp(View view) {

        Intent i = new Intent (Multiple_Question3.this,Multiple_Question4.class);
        startActivity(i);

    }
    public void back(View view)
    {
        Intent intent = new Intent(this,Multiple_Question2.class);
        startActivity(intent);
    }
    public void onClickbck(View view)
    {
        Intent intent = new Intent(Multiple_Question3.this,Multiple_Question2.class);
        startActivity(intent);
    }
    public void  next(View view)
    {
        Intent intent = new Intent(Multiple_Question3.this,Multiple_Question4.class);
    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Multiple_Question3.this, Multiple_Question4.class);
        startActivity(intent);
    }

}
