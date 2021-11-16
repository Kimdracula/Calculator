package com.homework.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Boolean newOperation = true;
    TextView textView;
    String number;;
    char operation;
    String newNumber;
    String oldNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView = findViewById(R.id.textView);
}
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            setContentView(R.layout.activity_main);
        }
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            setContentView(R.layout.activity_main_land);
        }
    }


public void numberEvent (View view) {
    if (newOperation)
        textView.setText("");
    newOperation = false;

    number = textView.getText().toString();
    switch (view.getId()) {

        case R.id.button0:
            number += "0";
            break;
        case R.id.button1:
            number += "1";
            break;
        case R.id.button2:
            number += "2";
            break;
        case R.id.button3:
            number += "3";
            break;
        case R.id.button4:
            number += "4";
            break;
        case R.id.button5:
            number += "5";
            break;
        case R.id.button6:
            number += "6";
            break;
        case R.id.button7:
            number += "7";
            break;
        case R.id.button8:
            number += "8";
            break;
        case R.id.button9:
            number += "9";
            break;
        case R.id.buttonNegative:
            if (textView.getText().toString().contains("-"))
                return;
            else
            number ="-"+ number;
            break;
        case R.id.buttonComma:
            if (newOperation)
                return;
            if (textView.getText().toString().contains("."))
                return;
            else
            number = number+".";
            break;

    }
    textView.setText(number);

}

    public void actionEvent (View view) {
        newOperation = true;
        oldNumber = textView.getText().toString();
        switch (view.getId()) {

            case R.id.buttonDivide:
                operation = '/';
                break;
            case R.id.buttonMultiply:
                operation = '*';
                break;
            case R.id.buttonMinus:
                operation = '-';
                break;
            case R.id.buttonPlus:
                operation = '+';
                break;

        }
    }

    public void equalEvent (View view){
    newNumber = textView.getText().toString();
        float result=0;
        switch (operation){
            case '/':
                result= Float.parseFloat(oldNumber)/Float.parseFloat(newNumber);
                break;
            case '*':
                result= Float.parseFloat(oldNumber)*Float.parseFloat(newNumber);
                break;
            case '-':
                result= Float.parseFloat(oldNumber)-Float.parseFloat(newNumber);
                break;
            case '+':
                result= Float.parseFloat(oldNumber)+Float.parseFloat(newNumber);
                break;
        }

textView.setText("" + result);
    }

    public void acButtonEvent (View view){
      textView.setText("0");
      newOperation=true;
    }

    public void percentButtonEvent (View view){
double percentNumber = Double.parseDouble(textView.getText().toString())/100;
textView.setText(""+percentNumber);
newOperation = true;
    }


}