package com.stu.objectoriented;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className AnimalOa
 * @description implements 关键字可以变相的使java具有多继承的特性，使用范围为类继承接口的情况，可以同时继承多个接口（接口跟接口之间采用逗号分隔）
 * @date 2018/10/19 13:17
 */

public class AnimalOa implements AnimalOo, AnimalOp {

    @Override
    public void show() {
        System.out.println("AnimalOo: show()");
    }

    @Override
    public void eat() {
        System.out.println("AnimalOp: eat()");
    }

    @Override
    public void sleep() {
        System.out.println("AnimalOp: sleep");
    }

    public static void main(String[] args) {
        AnimalOa animalOa = new AnimalOa();
        animalOa.show();
        animalOa.eat();
        animalOa.sleep();
    }
}
