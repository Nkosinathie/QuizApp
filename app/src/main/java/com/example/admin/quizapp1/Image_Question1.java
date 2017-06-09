package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Image_Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image__question1);
    }
    public void OnClickdroid(View view) {

        Intent i = new Intent (Image_Question1.this,Image_Question2.class);
        startActivity(i);


    }
    public void OnClickdma(View view) {

        Intent i = new Intent (Image_Question1.this,Image_Question2.class);
        startActivity(i);

    }
    public void OnClickrob(View view) {

        Intent i = new Intent (Image_Question1.this,Image_Question2.class);
        startActivity(i);

    }
    public void  next(View view)
    {
        Intent intent = new Intent(Image_Question1.this,Image_Question2.class);

    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Image_Question1.this, Image_Question2.class);
        startActivity(intent);
    }



}
