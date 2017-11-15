package com.wordpress.bayuteguhpamuji.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*untuk team A*/
    //method dipanggil ketika button plus 3 diklik
    public void displayScore3(View view){
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }
    //method dipanggil ketika button plus 2 diklik
    public void displayScore2(View view){
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }
    //method dipanggil ketika button free throw diklik
    public void displayScoreFree(View view){
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }

    /*untuk team B*/
    //method dipanggil ketika button plus 3 diklik
    public void displayScore3B(View view){
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }
    //method dipanggil ketika button plus 2 diklik
    public void displayScore2B(View view){
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }
    //method dipanggil ketika button free throw diklik
    public void displayScoreFreeB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }


    public void displayTeamA(int score){
        TextView scoreA = findViewById(R.id.team_a_score);
        scoreA.setText(String.valueOf(score));
    }

    public void displayTeamB(int score){
        TextView scoreB = findViewById(R.id.team_b_score);
        scoreB.setText(String.valueOf(score));
    }
}
