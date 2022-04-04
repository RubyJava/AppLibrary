package com.library.testing;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.actionText).setOnClickListener(v -> {
            testCrash();
        });
    }

    private void testCrash() {
        int[] arr = {1, 2, 3, 5, 8, 2};
        int data = arr[200];
    }
}