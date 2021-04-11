package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText password;
    private Button toRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toRelative = findViewById(R.id.myButtonToRelative);
        toRelative.setOnClickListener(v -> openRelativeLayout());
    }

    private void openRelativeLayout(){
        password = findViewById(R.id.myPassword);
        String typedPassword = password.getText().toString();
        startActivity(new Intent(this, MainActivity2.class));
//        if (typedPassword == "password") {
//            startActivity(new Intent(this, MainActivity2.class));
//        }
//        else {
//            Toast.makeText(MainActivity.this, "Wrong Password " + typedPassword, Toast.LENGTH_SHORT).show();
//            System.out.println(typedPassword);
//        }
    }
}