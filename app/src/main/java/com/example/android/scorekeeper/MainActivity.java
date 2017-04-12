package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int goalTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalsForTeamA(0);
    }

    /**
     * Displays goals for Team A.
     */

    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays goals for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }

    // Displays fouls for Team A

    public void displayFoulForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    //Displays fouls for Team B

    public void displayFoulForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void goalForTeamA (View v) {
        goalTeamA += 1;
        displayGoalsForTeamA(goalTeamA);
    }

    public void goalForTeamB (View v) {
        goalTeamB += 1;
        displayGoalForTeamB(goalTeamB);
    }

    public void foulForTeamA (View v) {
        foulTeamA += 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void foulForTeamB (View v) {
        foulTeamB += 1;
        displayFoulForTeamB(foulTeamB);
    }



    public void reset (View v) {
        goalTeamA = 0;
        goalTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayGoalsForTeamA(goalTeamA);
        displayGoalForTeamB(goalTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
    }
}
