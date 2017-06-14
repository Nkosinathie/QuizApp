package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TrueFalse_Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false__question4);
    }
    public void OnClicktr(View view) {

        Intent i = new Intent (TrueFalse_Question4.this,TrueFalse_Question5.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);





    }
    public void OnClickfae(View view) {

        Intent i = new Intent (TrueFalse_Question4.this,TrueFalse_Question5.class);
        startActivity(i);

    }



    public void back(View view)
    {
        Intent intent = new Intent(this,TrueFalse_Question3.class);
        startActivity(intent);
    }
    public void onClickbck(View view)
    {
        Intent intent = new Intent(TrueFalse_Question4.this,TrueFalse_Question3.class);
        startActivity(intent);
    }
    public void  next(View view)
    {
        Intent intent = new Intent(TrueFalse_Question4.this,TrueFalse_Question5.class);
    }
    public void onClicknxt(View view) {
        Intent intent = new Intent(TrueFalse_Question4.this, TrueFalse_Question5.class);
        startActivity(intent);
    }
}
