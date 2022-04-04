package com.library.utils;

import android.content.Context;
import android.os.Environment;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author reber
 * on 2022/4/4 16:59
 */
public class FileUtilTest {
    private Context mContext;

    @Before
    public void setUp() {
        mContext = InstrumentationRegistry.getInstrumentation().getContext();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getCachePath() {
        String cachePath = FileUtil.getCachePath(mContext);
        Assert.assertNotNull(cachePath);
    }

    @Test
    public void getFilePath() {
        String filePath = FileUtil.getFilePath(mContext, Environment.DIRECTORY_DOCUMENTS);
        Assert.assertNotNull(filePath);
    }
}