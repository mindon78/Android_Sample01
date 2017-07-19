package com.ht.sample01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreBoard extends AppCompatActivity {

    private TextView mLeftScoreText;
    private TextView mRightScoreText;

    private int DEFAULT_SCORE = 0;
    private int mLeftScore = DEFAULT_SCORE;
    private int mRightScore = DEFAULT_SCORE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

        Button left_3points = (Button) findViewById(R.id.left_3points);
        Button left_2points = (Button) findViewById(R.id.left_2points);
        Button left_free_throw = (Button) findViewById(R.id.left_free_throw);

        Button right_3points = (Button) findViewById(R.id.right_3points);
        Button right_2points = (Button) findViewById(R.id.right_2points);
        Button right_free_throw = (Button) findViewById(R.id.right_free_throw);

        Button reset_button = (Button) findViewById(R.id.reset_button);

        mLeftScoreText = (TextView) findViewById(R.id.left_score_text);
        mRightScoreText = (TextView) findViewById(R.id.right_score_text);

        mLeftScoreText.setText(mLeftScore + "");
        mRightScoreText.setText(mRightScore + "");

    }

    //---- onClicked method ---------------------------
    public void left3pointsClicked(View view) {
        mLeftScore += 3;
        displayLeftScore(mLeftScore);
    }

    public void left2pointsClicked(View view) {
        mLeftScore += 2;
        displayLeftScore(mLeftScore);
    }

    public void leftfreethrowClicked(View view) {
        mLeftScore += 1;
        displayLeftScore(mLeftScore);
    }

    public void right3pointsClicked(View view) {
        mRightScore += 3;
        displayRightScore(mRightScore);
    }

    public void right2pointsClicked(View view) {
        mRightScore += 2;
        displayRightScore(mRightScore);
    }

    public void rightfreethrowClicked(View view) {
        mRightScore += 1;
        displayRightScore(mRightScore);
    }

    public void resetbuttonClicked(View view) {
        mLeftScore = 0;
        mRightScore = 0;
        displayLeftScore(mLeftScore);
        displayRightScore(mRightScore);
    }

    //---- display method ---------------------------
    public void displayLeftScore(int score) {
        mLeftScoreText.setText(score + "");
    }
    public void displayRightScore(int score) {
        mRightScoreText.setText(score + "");
    }
}
