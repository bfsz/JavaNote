package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className Modifier
 * @description Java修饰符
 * @date 2018/10/9 10:10
 */
public class Modifier {
    public static void main(String[] args) {
        Cat catAd = new Cat();
        catAd.cry();
    }
    /**
     * Java修饰符：用来定义类、方法或者变量
     *      1、访问修饰符
     *      2、非访问修饰符
     * Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。
     *          default (即缺省，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
     *          private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
     *          public : 对所有类可见。使用对象：类、接口、变量、方法
     *          protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
     * | 修饰符       | 当前类  | 同一包内 | 子孙类(同一包) | 子孙类(不同包) | 其他包 |
     * | ----------- | ------ | -------- | ------------ | -------------| ------ |
     * | `public`    | Y      | Y        | Y            | Y            | Y      |
     * | `protected` | Y      | Y        | Y            | Y/N | N      |
     * | `default`   | Y      | Y        | Y            | N            | N      |
     * | `private`   | Y      | N        | N            | N            | N      |
     *
     * JAVA 的类（外部类）有 2 种访问权限: public、default。
     * 而方法和变量有 4 种：public、default、protected、private。
     * 其中默认访问权限和 protected 很相似，有着细微的差别。
     *          1、public 意味着任何地方的其他类都能访问。
     *          2、default 则是同一个包的类可以访问。
     *          3、protected 表示同一个包的类可以访问，其他的包的该类的子类也可以访问。
     *          4、private 表示只有自己类能访问。
     * 修饰符：abstract、static、final
     *          abstract: 表示是抽象类。 使用对象：类、接口、方法
     *          static: 可以当做普通类使用，而不用先实例化一个外部类。（用他修饰后，就成了静态内部类了）。
     *                  使用对象：类、变量、方法、初始化函数（注意：修饰类时只能修饰 内部类 ）
     *          final: 表示类不可以被继承。 使用对象：类、变量、方法
     */
    public static final String UID = "U";
    protected Integer age;
    private String name;
    int numAge;
    /*
     *非访问修饰符
     *为了实现一些其他的功能，Java 也提供了许多非访问修饰符。
        static 修饰符，用来修饰类方法和类变量。
        final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
        abstract 修饰符，用来创建抽象类和抽象方法。
        synchronized 和 volatile 修饰符，主要用于线程的编程。

      static
            static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。
            静态变量也被称为类变量。局部变量不能被声明为 static 变量。
            static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。
      final
            修饰的方法可以被子类继承，但是不能被子类修改。
      abstract
            抽象类：
                抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。
                一个类不能同时被 abstract 和 final 修饰。如果一个类包含抽象方法，那么该类一定要声明为抽象类。
            抽象方法：
                抽象方法是一种没有任何实现的方法，该方法的的具体实现由子类提供。
                抽象方法不能被声明成 final 和 static。
                任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。
                如果一个类包含若干个抽象方法，那么该类必须声明为抽象类。抽象类可以不包含抽象方法。

     */

    /**
    *@Description   synchronized 修饰符.synchronized 关键字声明的方法同一时间只能被一个线程访问。
    *@Date  2018/10/10
    *@Param []
    *@Return    void
    */
    public synchronized void showDemo(){

    }
    /*
     * transient 修饰符
     * 序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量。
     * 该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。
     */
    //非持久化

    public transient int lineNum = 55;
    //持久化

    public int lineNumb;

    /*
    * volatile
    * volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。
    * 而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
    * */
}

/**这就是一个抽象类*/
abstract class AbstractAnimal {
    String name;
    int age;

    /**
    *@Description  动物会叫。不确定动物怎么叫的。定义成抽象方法，来解决父类方法的不确定性。
     *             抽象方法在父类中不能实现，所以没有函数体。但在后续在继承时，要具体实现此方法。
    *@Date  2018/10/10
    *@Param []
    *@Return    void
    */
    public abstract void cry();
}

/**抽象类可以被继承,当继承的父类是抽象类时，需要将抽象类中的所有抽象方法全部实现。*/
class Cat extends AbstractAnimal {
    /**
     * 实现父类的cry抽象方法
     */
    @Override
    public void cry() {
        System.out.println("猫叫:");

    }
}