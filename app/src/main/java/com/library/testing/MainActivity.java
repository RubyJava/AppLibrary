package com.library.testing;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.library.utils.FileUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.actionText).setOnClickListener(v -> {
//            testCrash();
            testFilePath();
        });
    }

    private void testFilePath() {
        String path1 = FileUtil.getCachePath(this);
        String path2 = FileUtil.getFilePath(this, "");
        String path3 = FileUtil.getFilePath(this, "Documents");
        System.out.println("path1: " + path1);
        System.out.println("path2: " + path2);
        System.out.println("path3: " + path3);
    }

    private void testCrash() {
        int[] arr = {1, 2, 3, 5, 8, 2};
        int data = arr[200];
    }
}