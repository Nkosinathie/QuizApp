package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Image_Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image__question3);
    }
    public void OnClickja(View view) {

        Intent i = new Intent (Image_Question3.this,Image_Question4.class);
        startActivity(i);


}
    public void OnClickgo(View view) {

        Intent i = new Intent (Image_Question3.this,Image_Question4.class);
        startActivity(i);

    }
    public void OnClickwin(View view) {

        Intent i = new Intent (Image_Question3.this,Image_Question4.class);
        startActivity(i);

    }
    public void  next(View view)
    {
        Intent intent = new Intent(Image_Question3.this,Image_Question4.class);

    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(Image_Question3.this, Image_Question4.class);
        startActivity(intent);
    }



}
