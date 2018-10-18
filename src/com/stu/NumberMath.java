package com.stu;

import java.util.Random;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className NumberMath
 * @description Java Number & Math 类
 * @date 2018/10/11 16:31
 */
public class NumberMath {
    public static void main(String[] args) {
        //所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。
        //这种由编译器特别支持的包装称为装箱，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。
        //相似的，编译器也可以把一个对象拆箱为内置类型。Number 类属于 java.lang 包。

        //当 x 被赋为整型值时，由于x是一个对象，所以编译器要对x进行装箱。然后，为了使x能进行加运算，所以要对x进行拆箱。
        Integer a = 10;
        a += 10;
        System.out.println(a);

        mathDemo();
    }

    static void mathDemo() {
        Integer age = 18;
        String name = "niko";
        Double high = 167.5;

        // 	xxxValue()
        //将 Number 对象转换为xxx数据类型的值并返回。
        System.out.println(age.byteValue());

        // compareTo()
        //如果指定的数与参数相等返回 0。
        //如果指定的数小于参数返回 -1。
        //如果指定的数大于参数返回 1。
        System.out.println(age.compareTo(18) + "、" + age.compareTo(20) + "、" + age.compareTo(10));

        //equals() 方法用于判断 Number 对象与方法的参数进是否相等
        //如 Number 对象不为 Null，且与方法的参数类型与数值都相等返回 True，否则返回 False
        System.out.println(age.equals(18) + "-" + age.equals(name));

        //valueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。
        //该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数。
        Integer x = Integer.valueOf(18);
        Integer y = Integer.valueOf("100");
        Integer z = Integer.valueOf("444", 8);
        System.out.println(x + "   " + y + "   " + z);

        //toString 以字符串形式返回值
        System.out.println(x.toString());

        //parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
        //如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数。
        int xNum = Integer.parseInt("12");
        int yNum = Integer.parseInt("444", 16);
        System.out.println(xNum + "  " + yNum);

        //abs()
        //返回参数的绝对值。
        Integer absNum = -20;
        System.out.println(Math.abs(absNum));

        // 	ceil()
        //返回大于等于( >= )给定参数的的最小整数。
        //floor()
        //返回小于等于（<=）给定参数的最大整数 。
        double ceilNum = 10.75;
        float ceilA = -10.531f;
        System.out.println(Math.ceil(ceilNum) + "  " + Math.ceil(ceilA));
        System.out.println(Math.floor(ceilNum) + "  " + Math.floor(ceilA));

        // rint()
        //返回与参数最接近的整数。返回类型为double。
        double rintA = 100.500;
        double rintB = 101.500;
        System.out.println(Math.rint(rintA) + "  " + Math.rint(rintB));

        //round()
        //它表示四舍五入，算法为 Math.floor(x+0.5)，即将原来的数字加上 0.5 后再向下取整，
        // 所以，Math.round(11.5) 的结果为12，Math.round(-11.5) 的结果为-11。
        double roundA = 100.5;
        float roundB = -100.5F;
        System.out.println(Math.round(rintA) + " " + Math.round(roundB));

        // 	min()
        //返回两个参数中的最小值。
        System.out.println(Math.min(rintA, rintB));

        //max()
        //返回两个参数中的最大值。
        System.out.println(Math.max(rintA, rintB));

        //exp()
        //返回自然数底数e的参数次方。
        double expNum = 2.5;
        System.out.println(Math.exp(expNum));

        //log()
        //返回参数的自然数底数的对数值
        System.out.println(Math.log(expNum));

        // 	pow()
        //返回第一个参数的第二个参数次方。
        int powNum = 2;
        System.out.println(Math.pow(powNum, 2));

        //sqrt()
        //求参数的算术平方根。
        double sqrtNum = 11.635;
        System.out.println(Math.sqrt(sqrtNum));

        //  sin()
        //求指定double类型参数的正弦值。
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("pi 的值为 %.4f%n", Math.PI);
        System.out.format("%.1f 度的正弦值为 %.4f%n", degrees, Math.sin(radians));
        //	cos()
        //求指定double类型参数的余弦值。
        //	tan()
        //求指定double类型参数的正切值。
        //  asin()
        //求指定double类型参数的反正弦值。
        //  acos()
        //求指定double类型参数的反余弦值。
        // 	atan()
        //求指定double类型参数的反正切值。

        //atan2()
        //将笛卡尔坐标转换为极坐标，并返回极坐标的角度值。
        double atanA = 45.0;
        double atanB = 30.0;
        System.out.println(Math.atan2(atanA, atanB));

        //toDegrees()
        //将参数转化为角度。
        //toRadians()
        //将角度转换为弧度。
        double toDx = 45.0;
        System.out.println(Math.toDegrees(toDx));
        System.out.println(Math.toRadians(toDx));

        //random() 方法用于返回一个随机数，随机数范围为 0.0 =< Math.random < 1.0。
        //返回0-1000的随机数
        Random random = new Random();
        long i = (long) (Math.random() * 1000);
        long j = random.nextLong();
        System.out.println(i + "   " + j);

    }
}
