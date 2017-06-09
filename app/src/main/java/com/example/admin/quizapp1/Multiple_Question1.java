package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Multiple_Question1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple__question1);
    }
    public void OnClickmxc(View view) {

        Intent i = new Intent (Multiple_Question1.this,Multiple_Question2.class);
        startActivity(i);



    }
    public void OnClickswd(View view) {

        Intent i = new Intent (Multiple_Question1.this,Multiple_Question2.class);
        startActivity(i);

    }
    public void OnClickity(View view) {

        Intent i = new Intent (Multiple_Question1.this,Multiple_Question2.class);
        startActivity(i);

    }
    public void back(View view)
    {
       Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void onClickbck(View view)
    {
        Intent intent = new Intent(Multiple_Question1.this,MainActivity.class);
        startActivity(intent);
    }
    public void  next(View view)
    {
        Intent intent = new Intent(Multiple_Question1.this,Multiple_Question2.class);
    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Multiple_Question1.this, Multiple_Question2.class);
        startActivity(intent);
    }



}
