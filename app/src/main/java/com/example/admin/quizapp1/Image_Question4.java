package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Image_Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image__question4);
    }
    public void OnClickma(View view) {

        Intent i = new Intent (Image_Question4.this,Image_Question5.class);
        startActivity(i);



    }
    public void OnClickgoo(View view) {

        Intent i = new Intent (Image_Question4.this,Image_Question5.class);
        startActivity(i);

    }
    public void OnClickwind(View view) {

        Intent i = new Intent (Image_Question4.this,Image_Question5.class);
        startActivity(i);

    }
    public void  next(View view)
    {
        Intent intent = new Intent(Image_Question4.this,Image_Question5.class);

    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Image_Question4.this, Image_Question5.class);
        startActivity(intent);
    }

}

