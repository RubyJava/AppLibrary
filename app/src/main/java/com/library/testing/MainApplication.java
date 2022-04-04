package com.library.testing;

import android.app.Application;

import com.library.exception.CaughtExceptionManager;

/**
 * @author reber
 * on 2022/4/4 10:05
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CaughtExceptionManager.init();
    }
}
