package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className TypesOfVariables
 * @description 基础语法-变量类型
 * @date 2018/10/8 15:53
 */
public class TypesOfVariables {
    /*
     * Java语言支持的变量类型有：
     * 类变量(静态变量)：独立于方法之外的变量，用 static 修饰。
     * 实例变量(成员变量)：独立于方法之外的变量，不过没有 static 修饰。
     * 局部变量：类的方法中的变量。
     *  |          | **成员变量**   | **局部变量**             | **静态变量**       |
        | -------- | --------------| ----------------------  | ------------------|
        | 定义位置  | 在类中,方法外   | 方法中,或者方法的形式参数 | 在类中,方法外       |
        | 初始化值  | 有默认初始化值  | 无,先定义,赋值后才能使用  | 有默认初始化值      |
        | 调用方式  | 对象调用        | ---                    | 对象调用，类名调用  |
        | 存储位置  | 堆中           | 栈中                    | 方法区             |
        | 生命周期  | 与对象共存亡    | 与方法共存亡             | 与类共存亡         |
        | 别名      | 实例变量       | ---                    | 类变量             |
     */
    /**
     * 类变量
     *1、类变量也称为静态变量，在类中以static关键字声明，但必须在方法构造方法和语句块之外。
     *2、无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
     *3、静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量。常量初始化后不可改变。
     *4、静态变量储存在静态存储区。经常被声明为常量，很少单独使用static声明变量。
     *5、静态变量在第一次被访问时创建，在程序结束时销毁。
     *6、与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型。
     *7、默认值和实例变量相似。数值型变量默认值是0，布尔型默认值是false，引用类型默认值是null。
     *   变量的值可以在声明的时候指定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
     *8、静态变量可以通过：ClassName.VariableName的方式访问。
     *9、类变量被声明为public static final类型时，类变量名称一般建议使用大写字母。
     *   如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。
     */
    private static final int ALLUID = 2018;
    /**
     * 实例变量
     * 1、声明在类中，在方法、构造方法和语句块之外。
     * 2、当一个对象被实例化后，每个实例变量的值就跟着确定了。
     * 3、实例变量在对象创建的时候创建，在对象被销毁的时候销毁。
     * 4、实例变量的值至少被一个方法、构造方法和语句块引用，使得外部能够通过这些方式获取实例变量信息。
     * 5、可声明在使用前或者使用后。
     * 6、访问修饰符可修饰实例变量。
     * 7、实例变量对于方法、构造方法和语句块是可见的，一般情况下应该设置为私有。通过使用访问修饰符可以把实例变量对子类可见。
     * 8、实例变量具有默认值，数值类型默认为0，布尔类型默认为false，引用类型默认为null。变量的值可在声明是指定，也可在构造方法中指定。
     * 9、可直接通过变量名访问。
     */
    // 私有变量，仅在该类可见(实例变量)
            
    private String str;
    private double salary;
    
    /*
    * 构造方法(有参，无参)
    */

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        typesValue();
    }

    private static void typesValue() {
        //Java 局部变量
        /*
        1、局部变量声明在方法、构造方法或者语句块中；
        2、局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
        3、访问修饰符不能用于局部变量；
        4、局部变量只在声明它的方法、构造方法或者语句块中可见；
        5、局部变量是在栈上分配的。
        6、局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
        */
        int i = 0;
        System.out.println(ALLUID + "-" + i);
        TypesOfVariables typesOfVariables = new TypesOfVariables();
        typesOfVariables.setStr("hello");
        typesOfVariables.setSalary(2018.15);
        System.out.println(typesOfVariables.getStr()+"---"+ typesOfVariables.getSalary());
    }
}
