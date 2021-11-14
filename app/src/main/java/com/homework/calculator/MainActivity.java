package com.homework.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        Button buttonComma = findViewById(R.id.buttonComma);
        Button buttonAC = findViewById(R.id.buttonAC);
        Button buttonNegative = findViewById(R.id.buttonNegative);
        Button buttonPercent = findViewById(R.id.buttonPercent);
        Button buttonDivide = findViewById(R.id.buttonDevide);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonEqual = findViewById(R.id.buttonEqual);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button0:
                        if (Integer.parseInt(textView.getText().toString())==0)
                            break;
                        else
                        textView.append("0");
                break;
                    case R.id.button1:
                        if (Integer.parseInt(textView.getText().toString())==0){
                           textView.setText("1");
                        break;}
                        else
                        textView.append("1");
                        break;
                    case R.id.button2:
                        if (Integer.parseInt(textView.getText().toString())==0){
                            textView.setText("2");
                            break;}
                        else
                        textView.append("2");
                        break;
                    case R.id.button3:
                        if (Integer.parseInt(textView.getText().toString())==0){
                            textView.setText("3");
                            break;}
                        else
                        textView.append("3");
                        break;
                    case R.id.button4:
                        if (Integer.parseInt(textView.getText().toString())==0){
                            textView.setText("4");
                            break;}
                        else
                        textView.append("4");
                        break;
                    case R.id.button5:
                        if (Integer.parseInt(textView.getText().toString())==0){
                            textView.setText("5");
                            break;}
                        else
                        textView.append("5");
                        break;
                    case R.id.button6:
                        if (Integer.parseInt(textView.getText().toString())==0){
                            textView.setText("6");
                            break;}
                        else
                        textView.append("6");
                        break;
                    case R.id.button7:
                        if (Integer.parseInt(textView.getText().toString())==0){
                            textView.setText("7");
                            break;}
                        else
                        textView.append("7");
                        break;
                    case R.id.button8:
                        if (Integer.parseInt(textView.getText().toString())==0){
                            textView.setText("8");
                            break;}
                        else
                        textView.append("8");
                        break;
                    case R.id.button9:
                        if (Integer.parseInt(textView.getText().toString())==0){
                            textView.setText("9");
                            break;}
                        else
                        textView.append("9");
                        break;
                }
            }
        };

button0.setOnClickListener(clickListener);
        button1.setOnClickListener(clickListener);
        button2.setOnClickListener(clickListener);
        button3.setOnClickListener(clickListener);
        button4.setOnClickListener(clickListener);
        button5.setOnClickListener(clickListener);
        button6.setOnClickListener(clickListener);
        button7.setOnClickListener(clickListener);
        button8.setOnClickListener(clickListener);
        button9.setOnClickListener(clickListener);

    }


}