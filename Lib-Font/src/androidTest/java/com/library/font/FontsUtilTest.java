package com.library.font;

import android.content.Context;
import android.graphics.Typeface;

import androidx.test.platform.app.InstrumentationRegistry;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author reber
 * on 2022/4/3 19:12
 */
public class FontsUtilTest {

    private Context mContext;

    @Before
    public void setUp() {
        mContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testFont() {
        Typeface notNullTypeFace = FontsUtil.getTypeFace(mContext, FontsType.ROBOTO_BOLD);
        Assert.assertNotNull(notNullTypeFace);

        // 有默认值返回
        Typeface nullTypeFace = FontsUtil.getTypeFace(mContext, -2);
        Assert.assertNotNull(nullTypeFace);
    }
}