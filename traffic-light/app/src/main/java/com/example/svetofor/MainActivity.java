package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = findViewById(R.id.constraintLayout);
        mInfoTextView = findViewById(R.id.textViewInfo);

        Button yellowButton = findViewById(R.id.buttonYellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.yellowColor));
            }

        });
        Button greenButton = findViewById(R.id.button_green);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.green);
                mConstraintLayout.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.greenColor));
            }

        });
        Button redButton = findViewById(R.id.button_red);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.red);
                mConstraintLayout.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.redColor));
            }

        });
    }
}