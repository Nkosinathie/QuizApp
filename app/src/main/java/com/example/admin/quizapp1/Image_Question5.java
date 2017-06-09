package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Image_Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image__question5);
    }

    public void OnClickapp(View view) {

        Intent i = new Intent (Image_Question5.this,MainActivity.class);
        startActivity(i);


    }
    public void OnClickgoog(View view) {

        Intent i = new Intent (Image_Question5.this,MainActivity.class);
        startActivity(i);

    }
    public void OnClickwindo(View view) {

        Intent i = new Intent (Image_Question5.this,MainActivity.class);
        startActivity(i);

    }
    public void  next(View view)
    {
        Intent intent = new Intent(Image_Question5.this,MainActivity.class);

    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Image_Question5.this, MainActivity.class);
        startActivity(intent);
    }


}
