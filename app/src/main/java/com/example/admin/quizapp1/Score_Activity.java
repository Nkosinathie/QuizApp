package com.example.admin.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.admin.quizapp1.R.id.TotalScore;

public class Score_Activity extends AppCompatActivity {

    private Button Main;
    TextView TotalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_);
        TotalScore = (TextView) findViewById(R.id.TotalScore);

        double logo = ((MainActivity.score / 5.0)* 100);

        int res = (int) ((MainActivity.score * 100.0f) / 5);

        TotalScore.setText("Total Score = " + res + "%");

    }

    public void onClicktr (View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        MainActivity.score = 0;

    }
 // public void onClicktr(View view) {
    // Intent i = new Intent(ScoreActivity.this, Scripture_Question1.Class);
    // startActivity(1)
    // }



}
