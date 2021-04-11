package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    private ArrayList<CheckBox> checkBoxes;
    private Button toConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        toConstraint = findViewById(R.id.myButtonToConstraint);
        toConstraint.setOnClickListener(v -> openConstraintLayout());
    }

    private void openConstraintLayout(){
        checkBoxes = new ArrayList<CheckBox>(){{
            add(findViewById(R.id.checkBox1));
            add(findViewById(R.id.checkBox2));
            add(findViewById(R.id.checkBox3));
        }};
//        startActivity(new Intent(this, MainActivity.class));
        if (!checkBoxes.get(0).isChecked() && checkBoxes.get(1).isChecked() && checkBoxes.get(2).isChecked()) {
            startActivity(new Intent(this, MainActivity.class));
        }
        else {
            Toast.makeText(MainActivity3.this, "Cant Proceed", Toast.LENGTH_SHORT).show();
        }

    }
}