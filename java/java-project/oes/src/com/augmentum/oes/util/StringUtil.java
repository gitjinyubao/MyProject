package com.augmentum.oes.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    public static Boolean isEmpty(String data){
        if (data == null || data.equals("")) {
            return true;
        }

        return false;
    }

    public static boolean isContainChinese(String str) {
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }

        return false;
    }
}
