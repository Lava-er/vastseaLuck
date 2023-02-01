package cn.zcc.vastsea.util;

import java.text.SimpleDateFormat;

public class DateFormat {
    //快速日期格式化
    public static String getNowDate(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(System.currentTimeMillis());
    }
}
