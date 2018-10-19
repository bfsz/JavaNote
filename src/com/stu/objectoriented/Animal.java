package com.stu.objectoriented;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className Animal
 * @description 动物类
 * @date 2018/10/19 13:04
 */
public class Animal {
    private String name;
    private int id;

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("吃");
    }

    public void sleep(){
        System.out.println("睡");
    }
}
