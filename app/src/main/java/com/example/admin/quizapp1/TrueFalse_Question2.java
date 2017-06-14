package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TrueFalse_Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false__question2);
    }
    public void OnClicktr(View view) {

        Intent i = new Intent (TrueFalse_Question2.this,TrueFalse_Question3.class);
        startActivity(i);



    }
    public void OnClickfs(View view) {

        Intent i = new Intent (TrueFalse_Question2.this,TrueFalse_Question3.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);

    }



    public void back(View view)
    {
        Intent intent = new Intent(this,True_False_Question1.class);
        startActivity(intent);
    }
    public void onClickbck(View view)
    {
        Intent intent = new Intent(TrueFalse_Question2.this,True_False_Question1.class);
        startActivity(intent);
    }
    public void  next(View view)
    {
        Intent intent = new Intent(TrueFalse_Question2.this,TrueFalse_Question3.class);
    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(TrueFalse_Question2.this, TrueFalse_Question3.class);
        startActivity(intent);
    }

}
