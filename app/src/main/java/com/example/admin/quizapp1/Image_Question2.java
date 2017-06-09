package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Image_Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image__question2);

    }
    public void OnClickfcz(View view) {

        Intent i = new Intent (Image_Question2.this,Image_Question3.class);
        startActivity(i);

    }
    public void OnClickmxt(View view) {

        Intent i = new Intent (Image_Question2.this,Image_Question3.class);
        startActivity(i);

    }
    public void OnClicktwi(View view) {

        Intent i = new Intent (Image_Question2.this,Image_Question3.class);
        startActivity(i);

    }
    public void  next(View view)
    {
        Intent intent = new Intent(Image_Question2.this,Image_Question3.class);

    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Image_Question2.this, Image_Question3.class);
        startActivity(intent);
    }


}
