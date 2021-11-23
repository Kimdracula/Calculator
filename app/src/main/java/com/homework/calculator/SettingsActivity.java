package com.homework.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class SettingsActivity extends MainActivity implements Login {

    CodeStyleActivity codeStyle;
    MaterialButton theme1Button;
    MaterialButton theme2Button;
    MaterialButton theme3Button;
    MaterialButton theme4Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

       codeStyle = new CodeStyleActivity();

       theme1Button = findViewById(R.id.theme1Button);
        theme2Button = findViewById(R.id.theme2Button);
        theme3Button = findViewById(R.id.theme3Button);


        theme1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codeStyle.setThemeCode(R.style.AppThemeDark);
            }
        });

        theme2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codeStyle.setThemeCode(R.style.AppThemeLight);
            }
        });

        theme3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codeStyle.setThemeCode(R.style.AppTheme);
            }
        });



        MaterialButton returnButton = findViewById(R.id.returnButton);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra(login,codeStyle);
                startActivity(intent);
            }
        });
}





    }

