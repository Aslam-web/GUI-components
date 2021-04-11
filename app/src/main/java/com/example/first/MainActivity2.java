package com.example.first;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class MainActivity2 extends AppCompatActivity {

    RelativeLayout relativeLayout;

    private TextView textView;
    private SwitchCompat lightSwitch;
    private ImageView lightImage;
    private ToggleButton toggleButton;
    private ImageView toggleImage;
    private ImageButton toGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toGrid = findViewById(R.id.myImageButton);
        toGrid.setOnClickListener(v -> openGridLayout());

        lightSwitch = findViewById(R.id.mySwitch);
        lightSwitch.setOnClickListener(v -> lightSwitchHandler());

        toggleButton = findViewById(R.id.myToggleButton);
        toggleButton.setOnClickListener(v -> toggleButtonHandler());
    }

    private void openGridLayout(){
        if (lightSwitch.isChecked() && toggleButton.isChecked()) startActivity(new Intent(this, MainActivity3.class));
        else Toast.makeText(MainActivity2.this, "Cant Proceed", Toast.LENGTH_SHORT).show();
    }

    private void lightSwitchHandler(){
        lightImage = findViewById(R.id.mySwitchImage);
        if (lightSwitch.isChecked()) {
            lightImage.setImageResource(R.drawable.light_on);
        }
        else {
            lightImage.setImageResource(R.drawable.light_off);
        }

    }

    private void toggleButtonHandler() {
        toggleImage = findViewById(R.id.myToggleImage);
        relativeLayout = findViewById(R.id.myRelativeLayout);
        textView = findViewById(R.id.relativeText);

        if (toggleButton.isChecked()) {
            toggleImage.setImageResource(R.drawable.night);
            relativeLayout.setBackgroundColor(Color.rgb(4, 92, 57));
            textView.setTextColor(Color.BLUE);
        }
        else {
            toggleImage.setImageResource(R.drawable.day);
            relativeLayout.setBackgroundColor(Color.rgb(255, 255, 255));
            textView.setTextColor(Color.rgb(3, 99, 61));
        }
    }
}