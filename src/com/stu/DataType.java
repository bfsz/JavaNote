package com.stu;

import com.bean.Girl;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className day01
 * @description 基础语法-数据类型
 * @date 2018/10/8 13:36
 */
public class DataType {
    public static void main(String[] args) {
        //数据类型
        dataType();
    }

    /*1.数据类型：
    1.1内置数据类型：
    |——基础数据类型：8种，6种数据类型（4个整数型，2个浮点型），1种布尔类型，1种字符类型
      |——整数类型：byte\short\int\long
                |——  byte:8位，最大值127，最小值-128，默认值0
                |——  short：16位
                |——  int：32位，最大值-2^31，最小值-2^31-1，默认值0（常用）
                |——  long：64位，最大值-2^63，最小值-2^63-1，默认值0L，注意：需要在数字后面加上‘L’
       |——浮点型：double\float
                |——  float: 64位，默认值0.0f
                |——  double: 64位，默认值0.0d(常用)
       |——布尔类型：boolean（默认只有2个值：true/false）默认为false
       |——字符类型：char(单一的 16 位 Unicode 字符)
                |—— 最小值是 \u0000（即为0）；
                |—— 最大值是 \uffff（即为65,535）；
                |——  char 数据类型可以储存任何字符；
     1.2引用数据类型
            引用类型指向一个对象，指向对象的变量是引用变量,这些变量在声明时被指定为一个特定的类型,
         变量一旦声明后，类型就不能被改变了。
            对象、数组都是引用数据类型。默认值为null。一个引用变量可以用来引用任何与之兼容的类型。

     1.3转义字符
            \n 换行   \r  回车  \f 换页   \b 退格   \0 空字符
            \s 字符串  \t 制表符  \" 双引号  \' 单引号  \\反斜杠

      1.4自动类型转换
            低->高
             byte,short,char --->int--->long--->float--->double
             数据类型转换必须满足如下规则：
            1. 不能对boolean类型进行类型转换。
            2. 不能把对象类型转换成不相关类的对象。
            3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
            4. 转换过程中可能导致溢出或损失精度
            5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入

      */

    private static void dataType() {
        //byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();
        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
        System.out.println();

        //引用数据类型
        Girl girl = new Girl();
        girl.setName("niko");
        girl.setAge(18);
        System.out.println(girl.toString());

        //常量：不能被修改，用final修饰(常量名建议使用大写)
        final double nNum = 2018.1015;
        byte byteNum = 100;
        short shortNum = 250;
        int intNum = 20181015;
        long longNum = 1994091120181015L;
        float floatNum = 1994.1015F;
        double doubleNum = 2018.1015;
        char charA = 'A';
        String strName = "eureka";
        System.out.println(nNum + "-" + byteNum + "-" + shortNum + "-" + intNum + "-" + longNum + "-" + floatNum + "-"
                + doubleNum + "-" + strName);

        //自动类型转换
        System.out.println("char->int:" + (int) charA);
        //强制类型转换
        int numInt = 111;
        byte b = (byte) numInt;
        System.out.println("int->byte:" + b);

    }
}
