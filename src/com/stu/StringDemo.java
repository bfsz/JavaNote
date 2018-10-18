package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className StringDemo
 * @description String类型 StringBuilder  StringBuffer
 * @date 2018/10/12 11:14
 */
public class StringDemo {
    public static void main(String[] args) {
        //String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变.
        //如果需要对字符串做很多修改，那么应该选择使用 StringBuffer & StringBuilder 类。
        char[] str = {'A', 'B', 'C', 'D'};
        String strs = new String(str);
        System.out.println(strs);
        //字符串长度
        System.out.println(strs.length());
        //连接字符串 string1.concat(string2)
        System.out.println(strs.concat("1234"));
        //整数进行格式化：%[index$][标识][最小宽度]转换方式
        //对浮点数进行格式化：%[index$][标识][最少宽度][.精度]转换方式

        //当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
        //和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
        //StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
        //由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

        StringBuilder stringBuilder = new StringBuilder("I`m ");
        stringBuilder.append("to ");
        stringBuilder.append("be ");
        stringBuilder.append("No.1");
        System.out.println(stringBuilder);

        //返回当前容量
        System.out.println(stringBuilder.capacity());
        //反转
        System.out.println(stringBuilder.reverse());
        //移除
        System.out.println(stringBuilder.delete(2, 5));
        //在此序列中插入 char参数的字符串表示形式。
        System.out.println(stringBuilder.insert(2, "oN "));
        //替换
        System.out.println(stringBuilder.replace(2, 5, "***"));

    }
}
