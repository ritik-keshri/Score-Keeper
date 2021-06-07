package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int runA=0,runB=0,outA=0,outB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sixa(View v){
        runA=runA+6;
        scoreA(runA);
    }

    public void foura(View v){
        runA=runA+4;
        scoreA(runA);
    }

    public void threea(View v){
        runA=runA+3;
        scoreA(runA);
    }

    public void twoa(View v){
        runA=runA+2;
        scoreA(runA);
    }

    public void onea(View v){
        runA=runA+1;
        scoreA(runA);
    }

    public void outa(View v){
        if(outA<10)
        {
            outA=outA+1;
            setOutA(outA);
        }
    }

    public void sixb(View v){
        runB=runB+6;
        scoreB(runB);
    }

    public void fourb(View v){
        runB=runB+4;
        scoreB(runB);
    }

    public void threeb(View v){
        runB=runB+3;
        scoreB(runB);
    }

    public void twob(View v){
        runB=runB+2;
        scoreB(runB);
    }

    public void oneb(View v){
        runB=runB+1;
        scoreB(runB);
    }

    public void outb(View v){
        if(outB<10)
        {
            outB=outB+1;
            setOutB(outB);
        }
    }

    public void match(View v){
        TextView x = (TextView) findViewById(R.id.win);
        if(runA>runB)
            x.setText("Team A");
        else if(runB>runA)
            x.setText("Team B");
        else
            x.setText("Draw");
    }

    public void reset(View v){
        runA=runB=outA=outB=0;
        setOutA(outA);
        setOutB(outB);
        scoreA(runA);
        scoreB(runB);
        TextView x = (TextView) findViewById(R.id.win);
        x.setText("");
    }

    public void setOutA(int out){
        TextView x = (TextView) findViewById(R.id.team_a_out);
        x.setText(String.valueOf(out));
    }

    public void setOutB(int out){
        TextView x = (TextView) findViewById(R.id.team_b_out);
        x.setText(String.valueOf(out));
    }

    public void scoreA(int run){
        TextView score = (TextView) findViewById(R.id.team_a_score);
        score.setText(String.valueOf(run));
    }

    public void scoreB(int run){
        TextView score = (TextView) findViewById(R.id.team_b_score);
        score.setText(String.valueOf(run));
    }

}