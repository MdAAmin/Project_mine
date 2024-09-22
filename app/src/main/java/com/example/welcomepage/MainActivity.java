package com.example.welcomepage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int TRANSITION_DURATION = 3000; // 3 seconds for animation

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startProgressBarAnimation();
    }

    private void startProgressBarAnimation() {
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, HomePage.class);
            startActivity(intent);
            finish();
        }, TRANSITION_DURATION);
    }
}
