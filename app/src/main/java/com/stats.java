package com.example.android.scoreapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


import com.example.android.scoreapp.MainActivity;
import com.example.android.scoreapp.R;

public class stats extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);
        /**
         * imports integer values from the main activity, displays the values on the screen
         * for the specific statistics
         */
        int attackTeamA = getIntent().getIntExtra("attackTeamA", 0);
        int attackTeamB = getIntent().getIntExtra("attackTeamB", 0);
        int blockTeamA  = getIntent().getIntExtra("blockTeamA ", 0);
        int blockTeamB = getIntent().getIntExtra("blockTeamB", 0);
        int aceTeamA  = getIntent().getIntExtra("aceTeamA ", 0);
        int aceTeamB = getIntent().getIntExtra("aceTeamB", 0);
        int oppErrorTeamA = getIntent().getIntExtra("oppErrorTeamA", 0);
        int oppErrorTeamB = getIntent().getIntExtra("oppErrorTeamB", 0);
        int totalScoreA = getIntent().getIntExtra("totalScoreA", 0);
        int totalScoreB = getIntent().getIntExtra("totalScoreB", 0);

        attackTeamA(attackTeamA);
        attackTeamB(attackTeamB);
        blockTeamA(blockTeamA);
        blockTeamB(blockTeamB);
        aceTeamA(aceTeamA);
        aceTeamB(aceTeamB);
        oppErrorTeamA(oppErrorTeamA);
        oppErrorTeamB(oppErrorTeamB);
        totalScoreA(totalScoreA);
        totalScoreB(totalScoreB);
    }
    /**
     * displays the number of points scored via an attack for team A
     */
    public void attackTeamA(int attackTeamA) {
        TextView scoreView = findViewById(R.id.teamStatsAAttack);
        scoreView.setText(String.valueOf(attackTeamA));
    }
    public void attackTeamB(int attackTeamB) {
        TextView scoreView = findViewById(R.id.teamStatsBAttack);
        scoreView.setText(String.valueOf(attackTeamB));
    }
    public void blockTeamA(int blockTeamA) {
        TextView scoreView = findViewById(R.id.teamStatsABlock);
        scoreView.setText(String.valueOf(blockTeamA));
    }
    public void blockTeamB(int blockTeamB) {
        TextView scoreView = findViewById(R.id.teamStatsBBlock);
        scoreView.setText(String.valueOf(blockTeamB));
    }
    public void aceTeamA(int aceTeamA ) {
        TextView scoreView = findViewById(R.id.teamStatsAAce);
        scoreView.setText(String.valueOf(aceTeamA ));
    }
    public void aceTeamB(int aceTeamB) {
        TextView scoreView = findViewById(R.id.teamStatsBAce);
        scoreView.setText(String.valueOf(aceTeamB));
    }
    public void oppErrorTeamA(int oppErrorTeamA) {
        TextView scoreView = findViewById(R.id.teamStatsAOppError);
        scoreView.setText(String.valueOf(oppErrorTeamA ));
    }
    public void oppErrorTeamB(int oppErrorTeamB) {
        TextView scoreView = findViewById(R.id.teamStatsbOppError);
        scoreView.setText(String.valueOf(oppErrorTeamB));
    }
    public void totalScoreA(int totalScoreA) {
        TextView scoreView = findViewById(R.id.teamStatsATotalPoints);
        scoreView.setText(String.valueOf(totalScoreA));
    }
    public void totalScoreB(int totalScoreB) {
        TextView scoreView = findViewById(R.id.teamStatsBTotalPoints);
        scoreView.setText(String.valueOf(totalScoreB));
    }
    /**
     * Finishes the activity moves back to the initial screen
     */
    public void back(View view) {

        finish();}
}

