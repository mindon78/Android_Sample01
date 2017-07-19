package com.ht.sample01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CoffeeActivity extends AppCompatActivity {

    private TextView mQuantityTextView;
    private int mQuantity = 1;
    private int mPrice = 3000;
    private TextView mPriceTextView;


    // 메인
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 레이아웃 설정 부분
        setContentView(R.layout.activity_coffee);

        // XML에 있는 view의 레퍼런스를 가져오는 방법
        mQuantityTextView = (TextView) findViewById(R.id.quantity_text);
        Button minusButton = (Button) findViewById(R.id.minus_button);
        Button plusButton = (Button) findViewById(R.id.plus_button);
        mPriceTextView = (TextView) findViewById(R.id.price_text);


//        mQuantityTextView.setText(String.valueOf(mQuantity));
        mQuantityTextView.setText(mQuantity + "");


    }

    public void minusButtonClicked(View view) {
//        Toast.makeText(this, "잘 눌림", Toast.LENGTH_SHORT).show();
        mQuantity--;
        if (mQuantity < 0) {
            mQuantity = 0;
        }
        mQuantityTextView.setText("" + mQuantity);
        mPriceTextView.setText(mPrice * mQuantity + " 원");
    }

    public void plusButtonClicked(View view) {
        mQuantity++;
        mQuantityTextView.setText("" + mQuantity);
        mPriceTextView.setText(mPrice * mQuantity + " 원");
    }



}
