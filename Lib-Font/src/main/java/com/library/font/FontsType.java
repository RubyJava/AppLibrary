package com.library.font;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author reber
 * on 2022/4/3 19:08
 */
@IntDef({
        FontsType.ROBOTO_REGULAR,
        FontsType.ROBOTO_ITALIC,
        FontsType.ROBOTO_BOLD
})
@Retention(RetentionPolicy.SOURCE)
public @interface FontsType {
    // 定义所有的字体类型
    int ROBOTO_REGULAR = 0;
    int ROBOTO_ITALIC = 1;
    int ROBOTO_BOLD = 2;
}
