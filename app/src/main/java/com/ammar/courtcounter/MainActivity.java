package com.ammar.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ScoreTeamA = 0;
    int ScoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // team a points
    public void three_points_ForTeamA(View view) {
        ScoreTeamA = ScoreTeamA + 3 ;
        displayForTeamA(ScoreTeamA);

    }

    public void tow_points_ForTeamA(View view) {
        ScoreTeamA = ScoreTeamA + 2 ;
        displayForTeamA(ScoreTeamA);
    }

    public void one_point_ForTeamA(View view) {
       ScoreTeamA = ScoreTeamA +1;
       displayForTeamA(ScoreTeamA);
    }

    //team b points

public void three_points_ForTeamB(View view) {
        ScoreTeamB = ScoreTeamB +3;
        displayForTeamB(ScoreTeamB);
}

    public void two_points_ForTeamB(View view) {
        ScoreTeamB = ScoreTeamB +2;
        displayForTeamB(ScoreTeamB);
    }
    public void one_points_ForTeamB(View view) {
        ScoreTeamB = ScoreTeamB +1;
        displayForTeamB(ScoreTeamB);
    }

    public void reset(View view) {
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
