package com.example.android.scoreapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int setTeamA = 0;
    int setTeamB = 0;
    int timeOutA = 0;
    int timeOutB = 0;
    int attackTeamA = 0;
    int blockTeamA = 0;
    int aceTeamA = 0;
    int oppErrorTeamA = 0;
    int attackTeamB = 0;
    int blockTeamB = 0;
    int aceTeamB = 0;
    int oppErrorTeamB = 0;
    int totalScoreA = 0;
    int totalScoreB = 0;
    int attackTeamATemp = 0;
    int blockTeamATemp = 0;
    int aceTeamATemp = 0;
    int oppErrorTeamATemp = 0;
    int attackTeamBTemp = 0;
    int blockTeamBTemp = 0;
    int aceTeamBTemp = 0;
    int oppErrorTeamBTemp = 0;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
        outState.putInt("setTeamA", setTeamA);
        outState.putInt("setTeamB", setTeamB);
        outState.putInt("timeOutA", timeOutA);
        outState.putInt("timeOutB", timeOutB);
        outState.putInt("attackTeamA", attackTeamA);
        outState.putInt("blockTeamA", blockTeamA);
        outState.putInt("aceTeamA", aceTeamA);
        outState.putInt("oppErrorTeamA", oppErrorTeamA);
        outState.putInt("attackTeamB", attackTeamB);
        outState.putInt("blockTeamB", blockTeamB);
        outState.putInt("aceTeamB", aceTeamB);
        outState.putInt("oppErrorTeamB", oppErrorTeamB);
        outState.putInt("totalScoreA", totalScoreA);
        outState.putInt("totalScoreB", totalScoreB);
        outState.putInt("attackTeamATemp", attackTeamATemp);
        outState.putInt("blockTeamATemp", blockTeamATemp);
        outState.putInt("aceTeamATemp", aceTeamATemp);
        outState.putInt("oppErrorTeamATemp", oppErrorTeamATemp);
        outState.putInt("attackTeamBTemp", attackTeamBTemp);
        outState.putInt("blockTeamBTemp", blockTeamBTemp);
        outState.putInt("aceTeamBTemp", aceTeamBTemp);
        outState.putInt("oppErrorTeamBTemp", oppErrorTeamBTemp);

    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        setTeamA = savedInstanceState.getInt("setTeamA");
        setTeamB = savedInstanceState.getInt("setTeamB");
        timeOutA = savedInstanceState.getInt("timeOutA");
        timeOutB = savedInstanceState.getInt("timeOutB");
        attackTeamA = savedInstanceState.getInt("attackTeamA");
        blockTeamA = savedInstanceState.getInt("blockTeamA");
        aceTeamA = savedInstanceState.getInt("aceTeamA");
        oppErrorTeamA = savedInstanceState.getInt("oppErrorTeamA");
        attackTeamB = savedInstanceState.getInt("attackTeamB");
        blockTeamB = savedInstanceState.getInt("blockTeamB");
        aceTeamB = savedInstanceState.getInt("aceTeamB");
        oppErrorTeamB = savedInstanceState.getInt("oppErrorTeamB");
        totalScoreA = savedInstanceState.getInt("totalScoreA");
        totalScoreB = savedInstanceState.getInt("totalScoreB");
        attackTeamATemp = savedInstanceState.getInt("attackTeamATemp");
        blockTeamATemp = savedInstanceState.getInt("blockTeamATemp");
        aceTeamATemp = savedInstanceState.getInt("aceTeamATemp");
        oppErrorTeamATemp = savedInstanceState.getInt(" oppErrorTeamATemp");
        attackTeamBTemp = savedInstanceState.getInt("attackTeamBTemp");
        blockTeamBTemp = savedInstanceState.getInt(" blockTeamBTemp");
        aceTeamBTemp = savedInstanceState.getInt("aceTeamBTemp");
        oppErrorTeamBTemp = savedInstanceState.getInt("oppErrorTeamBTemp");
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displaySetForTeamA(setTeamA);
        displaySetForTeamB(setTeamB);
        displayTimeOutForTeamA(setTeamA);
        displayTimeOutTeamB(setTeamB);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
    /**
     * Displays the set score for Team A.
     */
    public void displaySetForTeamA(int setTeamA) {
        TextView scoreView = findViewById(R.id.team_a_set);
        scoreView.setText(String.valueOf(setTeamA));
    }
    /**
     * Displays the set score for Team B.
     */
    public void displaySetForTeamB(int setTeamB) {
        TextView scoreView = findViewById(R.id.team_b_set);
        scoreView.setText(String.valueOf(setTeamB));

        /**
         * Displays number of timeouts taken by Team A.
         */
    }
    public void displayTimeOutForTeamA(int timeOutA) {
        TextView scoreView = findViewById(R.id.t2);
        scoreView.setText(String.valueOf(timeOutA));
    }


    public void displayTimeOutTeamB(int timeOutB) {
        TextView scoreView = findViewById(R.id.t3);
        scoreView.setText(String.valueOf(timeOutB));
    }

    /**
     * Changes the number of timeouts taken by Team B.
     */
    public void callTimeOutA (View view){
        timeOutA = timeOutA + 1;
        displayTimeOutForTeamA (timeOutA);
    }


    public void callTimeOutB (View view) {
        timeOutB = timeOutB + 1;
        displayTimeOutTeamB(timeOutB);
    }

    /**
     * Adds a point to the score of Team A via Attack, adds the point a temporary stat integer that
     * is used to display stats once the set indicator is changed for any of the two teams.
     */

    public void attackTeamA(View view) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreTeamA = scoreTeamA + 1;
        attackTeamATemp = attackTeamATemp + 1;
        displayForTeamA(scoreTeamA);
    }
    public void blockTeamA(View view) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreTeamA = scoreTeamA + 1;
        blockTeamATemp = blockTeamATemp + 1;
        displayForTeamA(scoreTeamA);
    }
    public void aceTeamA(View view) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreTeamA = scoreTeamA + 1;
        aceTeamATemp = aceTeamATemp + 1;
        displayForTeamA(scoreTeamA);}
    public void oppErrorTeamA(View view) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreTeamA = scoreTeamA + 1;
        oppErrorTeamATemp = oppErrorTeamATemp + 1;
        displayForTeamA(scoreTeamA);}

    /**
     * Adds the number of sets won for Team A by 1, resets the number of points scored,
     * zeroes the temporary integers' values and moves them into the general stat variables which are
     * later displayed on the stats tab. Resets the number of time outs taken to 0 for both teams
     */

    public void setTeamA(View view) {
        TextView scoreView = findViewById(R.id.team_a_set);
        setTeamA = setTeamA + 1;
        scoreTeamB = 0;
        scoreTeamA = 0;
        attackTeamA = attackTeamA + attackTeamATemp;
        attackTeamATemp = 0;
        attackTeamB = attackTeamB + attackTeamBTemp;
        attackTeamBTemp = 0;
        blockTeamA = blockTeamA+ blockTeamATemp;
        blockTeamATemp = 0;
        blockTeamB = blockTeamB + blockTeamBTemp;
        blockTeamBTemp = 0;
        aceTeamA = aceTeamA + aceTeamATemp;
        aceTeamATemp = 0;
        aceTeamB = aceTeamB + aceTeamBTemp;
        aceTeamBTemp = 0;
        oppErrorTeamA = oppErrorTeamA + oppErrorTeamATemp;
        oppErrorTeamATemp = 0;
        oppErrorTeamB = oppErrorTeamB + oppErrorTeamBTemp;
        oppErrorTeamBTemp = 0;
        timeOutA = 0;
        timeOutB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displaySetForTeamA(setTeamA);
        displayTimeOutForTeamA (timeOutA);
        displayTimeOutTeamB (timeOutB);

    }

    public void attackTeamB(View view) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreTeamB = scoreTeamB + 1;
        attackTeamBTemp = attackTeamBTemp + 1;
        displayForTeamB(scoreTeamB);
    }
    public void blockTeamB(View view) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreTeamB = scoreTeamB + 1;
        blockTeamBTemp = blockTeamBTemp + 1;
        displayForTeamB(scoreTeamB);
    }
    public void aceTeamB(View view) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreTeamB = scoreTeamB + 1;
        aceTeamBTemp = aceTeamBTemp + 1;
        displayForTeamB(scoreTeamB);}
    public void oppErrorTeamB(View view) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreTeamB = scoreTeamB + 1;
        oppErrorTeamBTemp = oppErrorTeamBTemp +1;
        displayForTeamB(scoreTeamB);}

    public void setTeamB(View view) {
        TextView scoreView = findViewById(R.id.team_b_set);
        setTeamB = setTeamB + 1;
        scoreTeamB = 0;
        scoreTeamA = 0;
        attackTeamA = attackTeamA + attackTeamATemp;
        attackTeamATemp = 0;
        attackTeamB = attackTeamB + attackTeamBTemp;
        attackTeamBTemp = 0;
        blockTeamA = blockTeamA + blockTeamATemp;
        blockTeamATemp = 0;
        blockTeamB = blockTeamB + blockTeamBTemp;
        blockTeamBTemp = 0;
        aceTeamA = aceTeamA + aceTeamATemp;
        aceTeamATemp = 0;
        aceTeamB = aceTeamB + aceTeamBTemp;
        aceTeamBTemp = 0;
        oppErrorTeamA = oppErrorTeamA + oppErrorTeamATemp;
        oppErrorTeamATemp = 0;
        oppErrorTeamB = oppErrorTeamB + oppErrorTeamBTemp;
        oppErrorTeamBTemp = 0;
        timeOutA = 0;
        timeOutB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displaySetForTeamB(setTeamB);
        displayTimeOutForTeamA(timeOutA);
        displayTimeOutTeamB(timeOutB);
    }
    /**
     * Resets the scores in the set and time outs taken. Using the temporary integers makes sure
     * that the points accumulated before the reset are not taken into account for the stats while
     * the stats for the previous sets are saved
     */
    public void reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        timeOutA = 0;
        timeOutB = 0 ;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayTimeOutForTeamA (timeOutA);
        displayTimeOutTeamB (timeOutB);
    }
    /**
     * Restarts the game and resets all the variables including any stat variables
     */
    public void restart (View view){
        scoreTeamA = 0 ;
        scoreTeamB = 0 ;
        setTeamA = 0 ;
        setTeamB = 0 ;
        timeOutA = 0 ;
        timeOutB = 0 ;
        displayForTeamB(scoreTeamB);
        displaySetForTeamB(setTeamB);
        displaySetForTeamB(setTeamB);
        displayForTeamA(scoreTeamA);
        displaySetForTeamA(setTeamA);
        displayTimeOutForTeamA (timeOutA);
        displayTimeOutTeamB (timeOutB);
        scoreTeamA = 0;
        scoreTeamB = 0;
        setTeamA = 0;
        setTeamB = 0;
        attackTeamA = 0;
        blockTeamA = 0;
        aceTeamA = 0;
        oppErrorTeamA = 0;
        attackTeamB = 0;
        blockTeamB = 0;
        aceTeamB = 0;
        oppErrorTeamB = 0;
    }
    /**
     * Initiates a new activity that opens a new window with the stats for the game for any finished
     * set. Moves the integers from the main activity where the stats are kept to the new activty
     */
        public void stats(View view) {
            totalScoreA =  attackTeamA + blockTeamA + aceTeamA + oppErrorTeamA ;
            totalScoreB =  attackTeamB + blockTeamB + aceTeamB + oppErrorTeamB;
        Intent intent =  new Intent(this, com.example.android.scoreapp.stats.class);
            intent.putExtra("attackTeamA", attackTeamA);
            intent.putExtra("attackTeamB", attackTeamB);
            intent.putExtra("blockTeamA ", blockTeamA);
            intent.putExtra("blockTeamB", blockTeamB);
            intent.putExtra("aceTeamA ", aceTeamA );
            intent.putExtra("aceTeamB", aceTeamB);
            intent.putExtra("oppErrorTeamA", oppErrorTeamA);
            intent.putExtra("oppErrorTeamB", oppErrorTeamB);
            intent.putExtra("totalScoreA", totalScoreA);
            intent.putExtra("totalScoreB", totalScoreB);

                 startActivity(intent);


        }




}
