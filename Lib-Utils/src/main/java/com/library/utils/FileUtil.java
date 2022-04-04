package com.library.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;

/**
 * @author reber
 * on 2022/4/4 14:08
 * <p>
 * Environment：常用来获取外部存储目录
 * <p>
 * 1. 手机内部存储：getCacheDir()、getFilesDir()等，在data/data/目录下
 * <p>
 * 2. 手机机身的外部存储：getExternalFilesDir()、getExternalCacheDir()等，在storage/目录下，
 * 与应用有关，卸载了应用，里面的内容也没了
 * <p>
 * 3. 外部存储-SD卡内存：Environment.getExternalStorageDirectory()
 * <p>
 * 4. 权限添加
 * <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE">
 * <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE”>
 */
public class FileUtil {

    /**
     * @return 返回手机的外部存储是否可用
     * <p>
     * MEDIA_MOUNTED:表明sd对象是存在并具有读/写权限
     */
    public static boolean isExternalStorageEnable() {
        // 判断外部存储是是否可用，
        boolean isStorageEnable = Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState());
        // 判断外部存储是否移除了，如，低版本的手机有SD卡移除功能
        boolean isStorageRemoved = Environment.isExternalStorageRemovable();
        return isStorageEnable || !isStorageRemoved;
    }

    /**
     * 先考虑外部缓存存储，然后在考虑内部缓存存储
     */
    public static String getCachePath(Context context) {
        if (isExternalStorageEnable()) {
            // 当外部存储可用时
            return context.getExternalCacheDir().getAbsolutePath();
        }
        return context.getCacheDir().getAbsolutePath();
    }

    /**
     * 先考虑外部缓存存储，然后在考虑内部缓存存储
     *
     * @param type files下的指定文件夹路径:Environment.DIRECTORY_DOCUMENTS
     */
    public static String getFilePath(Context context, String type) {
        if (isExternalStorageEnable()) {
            // sdk > 19时，支持type获取文件夹路径
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                return context.getExternalFilesDir(type).getAbsolutePath();
            } else {
                return Environment.getExternalStorageDirectory().getAbsolutePath();
            }
        }
        return context.getFilesDir().getAbsolutePath();
    }
}
