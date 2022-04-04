package com.library.exception;


import androidx.annotation.NonNull;

/**
 * @author reber
 * on 2022/4/4 10:01
 */
public class DefaultExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {
        Throwable throwable = e.getCause();
        StackTraceElement[] elements = e.getStackTrace();
        String localizedMessage = e.getLocalizedMessage();
        String message = e.getMessage();
        System.exit(0);
    }
}
