package com.homework.calculator;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class SettingsActivity extends AppCompatActivity {

    ThemeActivity themeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
     //   initThemeChooser();
        themeActivity = new ThemeActivity();
        MaterialButton returnButton = findViewById(R.id.returnButton);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
}



    private void initThemeChooser() {
        SwitchMaterial switchTheme1 = findViewById(R.id.switchTheme1);
        SwitchMaterial switchTheme2 = findViewById(R.id.switchTheme2);
        SwitchMaterial switchTheme3 = findViewById(R.id.switchTheme3);
        SwitchMaterial switchTheme4 = findViewById(R.id.switchTheme4);
        switcher(switchTheme1);
    }

    private void switcher(SwitchMaterial switchTheme) {
        switchTheme.setOnClickListener(view -> {
            if (switchTheme.isChecked()){
                themeActivity.setAppTheme(R.style.AppThemeDark);
            }
            else {
                themeActivity.setAppTheme(R.style.AppThemeLight);
            }
            recreate();
        });
    }
}
