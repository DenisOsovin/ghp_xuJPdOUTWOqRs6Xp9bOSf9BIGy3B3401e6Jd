package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //вводим объекты для дальнейшей привязки
    private Button mB1;
    private Button mB2;
    private Button mB3;
    private Button mB4;
    private Button mB5;
    private Button mB6;
    private Button mB7;
    private Button mB8;
    private Button mB9;
    private Button mB0;
    private Button mBPoint;
    private Button mBPlus;
    private Button mBMinus;
    private Button mBMultiplication;
    private Button mBDivision;
    private Button mBEqually;
    private TextView mResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //связываем объеты с элементами в layout
        mB1 = (Button) findViewById(R.id.button_1);
        mB2 = (Button) findViewById(R.id.button_2);
        mB3 = (Button) findViewById(R.id.button_3);
        mB4 = (Button) findViewById(R.id.button_4);
        mB5 = (Button) findViewById(R.id.button_5);
        mB6 = (Button) findViewById(R.id.button_6);
        mB7 = (Button) findViewById(R.id.button_7);
        mB8 = (Button) findViewById(R.id.button_8);
        mB9 = (Button) findViewById(R.id.button_9);
        mB0 = (Button) findViewById(R.id.button_0);
        mBPoint = (Button) findViewById(R.id.button_point);
        mBPlus = (Button) findViewById(R.id.button_plus);
        mBMinus = (Button) findViewById(R.id.button_minus);
        mBMultiplication = (Button) findViewById(R.id.button_multiplication);
        mBDivision = (Button) findViewById(R.id.button_division);
        mBEqually = (Button) findViewById(R.id.button_equally);
        mResult = (TextView) findViewById(R.id.textView1);

        //добавляем нажатие всех кнопок

        mB1.setOnClickListener(this);
        mB2.setOnClickListener(this);
        mB3.setOnClickListener(this);
        mB4.setOnClickListener(this);
        mB5.setOnClickListener(this);
        mB6.setOnClickListener(this);
        mB7.setOnClickListener(this);
        mB8.setOnClickListener(this);
        mB9.setOnClickListener(this);
        mB0.setOnClickListener(this);
        mBPoint.setOnClickListener(this);
        mBPlus.setOnClickListener(this);
        mBMultiplication.setOnClickListener(this);
        mBDivision.setOnClickListener(this);
        mBEqually.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_0:
                mResult.append(mB0.getText());
                break;

            case R.id.button_1:
                mResult.append(mB1.getText());
                break;

            case R.id.button_2:
                mResult.append(mB2.getText());
                break;

            case R.id.button_3:
                mResult.append(mB3.getText());
                break;

            case R.id.button_4:
                mResult.append(mB4.getText());
                break;


            case R.id.button_5:
                mResult.append(mB5.getText());
                break;

            case R.id.button_6:
                mResult.append(mB6.getText());
                break;

            case R.id.button_7:
                mResult.append(mB7.getText());
                break;

            case R.id.button_8:
                mResult.append(mB8.getText());
                break;

            case R.id.button_9:
                mResult.append(mB9.getText());
                break;

            case R.id.button_point:
                mResult.append(mBPoint.getText());
                break;



        }
    }
}