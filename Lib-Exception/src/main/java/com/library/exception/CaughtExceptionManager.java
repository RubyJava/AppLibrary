package com.library.exception;

/**
 * @author reber
 * on 2022/4/4 10:12
 */
public class CaughtExceptionManager {

    public static void init() {
        // Tread设置默认全局的未捕捉的异常
        DefaultExceptionHandler excHandler = new DefaultExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(excHandler);
    }
}
