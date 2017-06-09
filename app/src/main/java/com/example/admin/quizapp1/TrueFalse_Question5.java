package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TrueFalse_Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false__question5);
    }


    public void OnClicktrues(View view) {

        Intent i = new Intent (TrueFalse_Question5.this,MainActivity.class);
        startActivity(i);



    }
    public void OnClickfalses(View view) {

        Intent i = new Intent (TrueFalse_Question5.this,MainActivity.class);
        startActivity(i);

    }



    public void back(View view)
    {
        Intent intent = new Intent(this,TrueFalse_Question4.class);
        startActivity(intent);
    }
    public void onClickbck(View view)
    {
        Intent intent = new Intent(TrueFalse_Question5.this,TrueFalse_Question4.class);
        startActivity(intent);
    }
    public void  next(View view)
    {
        Intent intent = new Intent(TrueFalse_Question5.this,MainActivity.class);
    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(TrueFalse_Question5.this, MainActivity.class);
        startActivity(intent);
    }

}
