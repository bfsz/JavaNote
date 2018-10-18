package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className MethodDemo
 * @description 方法
 * @date 2018/10/15 10:28
 */
public class MethodDemo {
    public static void main(String[] args) {
        String s = strString("-HAO");
        System.out.println(s);

        Loli loli = new Loli(10, 0, "EU");
        System.out.println(loli.toString());

        printMax(1, 3, 12, 32, 13, 16.7, 2.1);
        printMax();

        Cake cake = new Cake(1);
        Cake cake2 = new Cake(2);
        Cake cake3 = new Cake(3);

        cake2 = cake3 = null;
        System.gc();
    }

    /*修饰符 返回值类型 方法名(参数类型 参数名){
    ...
        方法体
    ...
        return 返回值;
    }

    方法包含一个方法头和一个方法体。下面是一个方法的所有部分：
        修饰符：修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
        返回值类型 ：方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，returnValueType 是关键字void。
        方法名：是方法的实际名称。方法名和参数表共同构成方法签名。
        参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。
        方法体：方法体包含具体的语句，定义该方法的功能。

    当创建对象时，系统会自动调用构造方法
        没有自定义构造方法时，系统会调用默认构造方法
        构造方法可以重载，不同的构造方法名字相同，参数列表不同，参数列表是其识别的依据、标志，类似不同人可能有相同的名字，但有不同的身份证号。
        当自定义构造方法时，系统依据传入的参数类型、数量，自动匹配构造方法初始化对象
    */

    private static String strString(String str) {
        String strs = "EUREKA" + str;
        return strs;
    }

    /**
     * @Description 可变参数
     * @Date 2018/10/15
     * @Param
     * @Return
     */
    private static void printMax(double... number) {
        if (number.length == 0) {
            System.out.println("No Data");
            return;
        }
        double result = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > result) {
                result = number[i];
            }
        }
        System.out.println("The Max Num :" + result);
    }
}

class Loli {
    private int age;
    private int sex;
    private String name;

    /**
     * @Description 无参构造方法
     * @Date 2018/10/15
     * @Param []
     * @Return
     */
    public Loli() {
    }

    /**
     * @Description 有参构造方法
     * @Date 2018/10/15
     * @Param
     * @Return
     */
    public Loli(int age, int sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Loli{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}

class Cake extends Object {
    //finalize()方法 Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。

    private int i;

    public Cake(int i) {
        this.i = i;
        System.out.println("cake object " + i + " is created");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("cake object " + i + " is disposed");
    }
}
