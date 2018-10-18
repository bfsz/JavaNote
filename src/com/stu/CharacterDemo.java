package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className CharacterDemo
 * @description Java Character 类
 * @date 2018/10/12 11:01
 */
public class CharacterDemo {
    public static void main(String[] args) {
        //Character 类用于对单个字符进行操作。
        //Character 类在对象中包装一个基本类型 char 的值
        //装箱
        Character str = 'A';
        //拆箱
        char strx = str;

        //isLetter() 方法用于判断指定字符是否为字母。
        System.out.println(Character.isLetter(str));
        //isDigit() 方法用于判断指定字符是否为数字。
        System.out.println(Character.isDigit(str));
        //isWhitespace() 是否是一个空格
        //isWhitespace()是否是一个空格
        //sUpperCase()是否是大写字母
        //isLowerCase()是否是小写字母
        //toUpperCase()指定字母的大写形式
        //toLowerCase()指定字母的小写形式
        //toString()返回字符的字符串形式，字符串的长度仅为1

        /*
         * Character构造函数 Java9起已经弃用
         *Character ch = new Character('a');      // Java9 以前
         *Character ch = Character.valueOf('a');  // Java9 以后
         */
    }
}
