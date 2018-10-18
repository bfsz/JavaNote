package com.stu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className DateDemo
 * @description 日期时间
 * @date 2018/10/12 15:56
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        //日期格式化
        // 这一行代码确立了转换的格式，其中 yyyy 是完整的公元年，MM 是月份，dd 是日期，HH:mm:ss 是时、分、秒。
        //注意:有的格式大写，有的格式小写，例如 MM 是月份，mm 是分；HH 是 24 小时制，而 hh 是 12 小时制。
        SimpleDateFormat sf = new SimpleDateFormat("G Z yyyy-MM-dd HH:mm:ss E");
        System.out.println(sf.format(date));

        //字符串解析为时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date1;
        try {
            date1 = df.parse("2018-11-11");
            System.out.println(df.format(date1));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Calendar类
        Calendar c = Calendar.getInstance();
        System.out.println(c.toInstant());

        c.set(2018, 10 - 1, 15);
        System.out.println(c.toInstant());
        c.set(Calendar.DATE, 1);
        c.set(Calendar.YEAR, 2019);
        c.add(Calendar.DATE, 10);
        c.add(Calendar.YEAR, -6);
        System.out.println(c.toInstant());


        // 获得年份 get(Calendar.YEAR);
        // 获得月份 get(Calendar.MONTH) + 1;
        // 获得日期 get(Calendar.DATE);
        // 获得小时 get(Calendar.HOUR_OF_DAY);
        // 获得分钟 get(Calendar.MINUTE);
        // 获得秒   get(Calendar.SECOND);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        //         get(Calendar.DAY_OF_WEEK);

        System.out.println(c.get(Calendar.HOUR_OF_DAY));

    }
}
