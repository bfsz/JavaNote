package com.stu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className RegexDemo
 * @description 正则表达式
 * @date 2018/10/12 16:45
 */
public class RegexDemo {
    public static void main(String[] args) {
        //正则表达式定义了字符串的模式。
        //正则表达式可以用来搜索、编辑或处理文本。

        /*Pattern 类：
        pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。
        Matcher 类：
        Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。
        PatternSyntaxException：
        PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。*/

        String str = "eureka...";
        String pattern = ".*eureka.*";
        boolean isMatch = Pattern.matches(pattern, str);
        System.out.println(isMatch);
        System.out.println("-------------------------------------");

        //匹配正整数
        String num = "100";
        String pattern1 = "^\\d+$";
        boolean isMatch1 = Pattern.matches(pattern1, num);
        System.out.println(isMatch1);
        System.out.println("-------------------------------------");

        //start() end();
        String strs = "cat cat cat cattie cat";
        String regex = "cat";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(strs);
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println("Match Num:" + count);
            System.out.println("start():" + m.start());
            System.out.println("end():" + m.end());
        }
        System.out.println("-------------------------------------");


        //matches 和 lookingAt 方法
        //matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。它们的不同是 matches 要求整个序列都匹配，而lookingAt 不要求。
        //lookingAt 方法虽然不需要整句都匹配，但是需要从第一个字符开始匹配
        String strIn1 = "foooooooooooo";
        String strIn2 = "ooooooofooooo";
        String regex1 = "foo";

        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(strIn1);
        Matcher m2 = p1.matcher(strIn2);

        System.out.println(m1.lookingAt());
        System.out.println(m2.lookingAt());
        System.out.println("-------------------------------------");

        //replaceFirst 和 replaceAll 方法
        //replaceFirst 和 replaceAll 方法用来替换匹配正则表达式的文本。不同的是，replaceFirst 替换首次匹配，replaceAll 替换所有匹配。
        String strRep = "The Yui is My Darling";
        String regex2 = "is";
        String replace = "Is";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher = pattern2.matcher(strRep);
        String s = matcher.replaceAll(replace);
        System.out.println(s);
        System.out.println("-------------------------------------");

        //appendReplacement 和 appendTail 方法
        //文本替换
        String strApp = "theabbyuiabopabuiabb";
        String regex3 = "a*b";
        String appStr = "-";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher1 = pattern3.matcher(strApp);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher1.find()) {
            matcher1.appendReplacement(stringBuffer, appStr);
        }
        matcher1.appendTail(stringBuffer);
        System.out.println(stringBuffer.toString());
        System.out.println("-------------------------------------");

        //QQ校验
        String reg = "[1-9][0-9]{4,14}";
        String qqStr = "627261109";
        System.out.println(qqStr.matches(reg));
    }
}
