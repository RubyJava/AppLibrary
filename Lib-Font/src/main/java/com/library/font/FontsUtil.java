package com.library.font;

import android.content.Context;
import android.graphics.Typeface;

import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;

/**
 * @author reber
 * on 2022/4/3 19:08
 * <p>
 * 根据提供的FontType返回需要的TypeFace
 */
public class FontsUtil {

    /**
     * @param context  /
     * @param fontType 如：FontType.ROBOTO_BOLD，可以查看 {@link FontsType}
     * @return 根据定义的fontType返回TextView能够识别的TypeFace
     */
    public static Typeface getTypeFace(@NonNull Context context, @FontsType int fontType) {
        return ResourcesCompat.getFont(context, getFontResourceId(fontType));
    }

    /**
     * @param fontType /
     * @return 根据定义的fontType返回对应字体的resourceId，可以在文件res/font查看
     * @see #getTypeFace(Context, int)
     */
    private static @FontRes
    int getFontResourceId(@FontsType int fontType) {
        switch (fontType) {
            case FontsType.ROBOTO_REGULAR:
                return R.font.roboto_regular;
            case FontsType.ROBOTO_ITALIC:
                return R.font.roboto_italic;
            case FontsType.ROBOTO_BOLD:
                return R.font.roboto_bold;
            default:
                return R.font.roboto_regular;
        }
    }
}
