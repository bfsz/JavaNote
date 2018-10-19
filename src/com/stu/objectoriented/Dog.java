package com.stu.objectoriented;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className Dog
 * @description 狗-继承动物
 * @date 2018/10/19 13:06
 */
public class Dog extends Animal {
    //super 与 this 关键字
    //super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
    //this关键字：指向自己的引用。

    @Override
    public void eat() {
        System.out.println("Dog eat!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep!");
    }

    public void test() {
        this.eat();
        super.eat();
    }
}
