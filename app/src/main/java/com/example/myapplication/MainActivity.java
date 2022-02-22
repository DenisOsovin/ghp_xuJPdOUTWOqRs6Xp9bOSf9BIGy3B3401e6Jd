package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //вводим объекты для дальнейшей привязки
    private Button B1;
    private Button B2;
    private Button B3;
    private Button B4;
    private Button B5;
    private Button B6;
    private Button B7;
    private Button B8;
    private Button B9;
    private Button B0;
    private Button BPoint;
    private Button BPlus;
    private Button BMinus;
    private Button BMultiplication;
    private Button BDivision;
    private Button BEqually;
    private TextView Result;
    private EditText E1;
    private EditText E2;
    private String Count ="";

    public static final String appTheme="App_theme";
    public static final int CalcButtonStyle=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(R.style.CalcButtonStyle));
        setContentView(R.layout.activity_main);
        initThemeChooser();

        //связываем объеты с элементами в layout
        B1 = (Button) findViewById(R.id.button_1);
        B2 = (Button) findViewById(R.id.button_2);
        B3 = (Button) findViewById(R.id.button_3);
        B4 = (Button) findViewById(R.id.button_4);
        B5 = (Button) findViewById(R.id.button_5);
        B6 = (Button) findViewById(R.id.button_6);
        B7 = (Button) findViewById(R.id.button_7);
        B8 = (Button) findViewById(R.id.button_8);
        B9 = (Button) findViewById(R.id.button_9);
        B0 = (Button) findViewById(R.id.button_0);
        BPoint = (Button) findViewById(R.id.button_point);
        BPlus = (Button) findViewById(R.id.button_plus);
        BMinus = (Button) findViewById(R.id.button_minus);
        BMultiplication = (Button) findViewById(R.id.button_multiplication);
        BDivision = (Button) findViewById(R.id.button_division);
        BEqually = (Button) findViewById(R.id.button_equally);
        Result = (TextView) findViewById(R.id.textview);
        E1= (EditText) findViewById(R.id.edittext1);
        E2= (EditText) findViewById(R.id.edittext2);

        //добавляем нажатие всех кнопок

        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);
        B7.setOnClickListener(this);
        B8.setOnClickListener(this);
        B9.setOnClickListener(this);
        B0.setOnClickListener(this);
        BPoint.setOnClickListener(this);
        BPlus.setOnClickListener(this);
        BMultiplication.setOnClickListener(this);
        BDivision.setOnClickListener(this);
        BEqually.setOnClickListener(this);
    }

    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonCalcButtonStyle), calcButtonStyle);
        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton)rg.getChildAt(getCodeStyle(calcButtonStyle))).setChecked(true);
    }

    private int getAppTheme(int calcButtonStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }



    @Override
    public void onClick(View view) {
        float value1=0;
        //parseFloat распознает число с плавающей точкой.
        value1= Float.parseFloat((E1).getText().toString());
        float value2=0;
        //parseFloat распознает число с плавающей точкой.
        value2 = Float.parseFloat((E2).getText().toString());
        float result=0;
        switch (view.getId()){
            case R.id.button_plus:
                Count="+";
                result=value1+value2;
                break;
            case R.id.button_minus:
                Count="-";
                result=value1-value2;
                break;
            case R.id.button_multiplication:
                Count="*";
                result=value1*value2;
                break;
            case R.id.button_division:
                Count="/";
                result=value1/value2;
                break;
        }
        Result.setText((int) result);
    }
}
//        switch (view.getId()) {
//            case R.id.button_0:
//                mResult.append(mB0.getText());
//                break;
//
//            case R.id.button_1:
//                mResult.append(mB1.getText());
//                break;
//
//            case R.id.button_2:
//                mResult.append(mB2.getText());
//                break;
//
//            case R.id.button_3:
//                mResult.append(mB3.getText());
//                break;
//
//            case R.id.button_4:
//                mResult.append(mB4.getText());
//                break;
//
//
//            case R.id.button_5:
//                mResult.append(mB5.getText());
//                break;
//
//            case R.id.button_6:
//                mResult.append(mB6.getText());
//                break;
//
//            case R.id.button_7:
//                mResult.append(mB7.getText());
//                break;
//
//            case R.id.button_8:
//                mResult.append(mB8.getText());
//                break;
//
//            case R.id.button_9:
//                mResult.append(mB9.getText());
//                break;
//
//            case R.id.button_point:
//                mResult.append(mBPoint.getText());
//                break;
//       }
