package com.stu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className SerializeDemo
 * @description 序列化对象
 * @date 2018/10/22 10:13
 */
public class SerializeDemo {
    //一个类的对象要想序列化成功，必须满足两个条件：
    //该类必须实现 java.io.Serializable 对象。
    //该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的

    public static void main(String[] args) {
        Employees e = new Employees();
        e.setName("PL");
        e.setAge(17);
        e.number = 101;
        e.SSN = 10015;
        try {
            FileOutputStream out = new FileOutputStream("D:employees.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(out);
            outputStream.writeObject(e);
            out.close();
            outputStream.close();
            System.out.println("Serialized data is saved in 'D:employees.ser'");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

class Employees implements Serializable {
    private String name;
    private Integer age;
    public transient int SSN;
    public int number;

    public Employees(String name, Integer age, int SSN, int number) {
        this.name = name;
        this.age = age;
        this.SSN = SSN;
        this.number = number;
    }

    public Employees() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void check() {
        System.out.println(name + " " + age);
    }
}
