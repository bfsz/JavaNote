package com.stu.polymorphism;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className Polymorphism
 * @description 多态
 * @date 2018/10/19 13:50
 */
public class Polymorphism {
    //多态是同一个行为具有多个不同表现形式或形态的能力。
    //多态就是同一个接口，使用不同的实例而执行不同操作
    //多态的实现方式
    //方式一：重写：
    //     Java 重写(Override)与重载(Overload)。
    //方式二：接口
    //    1. 生活中的接口最具代表性的就是插座，例如一个三接头的插头都能接在三孔插座中，因为这个是每个国家都有各自规定的接口规则，有可能到国外就不行，那是因为国外自己定义的接口类型。
    //    2. java中的接口类似于生活中的接口，就是一些方法特征的集合，但没有方法的实现。具体可以看 java接口 这一章节的内容。
    //方式三：抽象类和抽象方法

    public static void main(String[] args) {
        show(new Bird());
        show(new Bee());

        //向上转型
        AbstractSkyAnimal a = new Bee();
        //调用的是Bee的eat()
        a.eat();
        //向下转型
        Bee bee = (Bee) a;
        //调用的是Bee的work()
        bee.work();

    }

    private static void show(AbstractSkyAnimal a) {
        a.eat();
        //类型判断
        if (a instanceof Bird) {
            Bird b = (Bird) a;
            b.work();
        } else if (a instanceof Bee) {
            Bee b = (Bee) a;
            b.work();
        }
    }


}

abstract class AbstractSkyAnimal {
    /**
     * @Description 吃
     * @Date 2018/10/19
     * @Param []
     * @Return void
     */
    abstract void eat();

    /**
     * @Description 工作
     * @Date 2018/10/19
     * @Param []
     * @Return void
     */
    abstract void work();
}

/**
 * @Description Bird
 * @Date 2018/10/19
 * @Param
 * @Return
 */
class Bird extends AbstractSkyAnimal {
    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    @Override
    void work() {
        System.out.println("迁徙");
    }
}

/**
 * @Description Bee
 * @Date 2018/10/19
 * @Param
 * @Return
 */
class Bee extends AbstractSkyAnimal {
    @Override
    void eat() {
        System.out.println("吃花粉");
    }

    @Override
    void work() {
        System.out.println("采蜜");
    }
}
