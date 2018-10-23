package com.stu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className BtSerializeDemo
 * @description 反序列化对象
 * @date 2018/10/22 10:34
 */
public class BtSerializeDemo {
    public static void main(String[] args) {
        Employees e = null;
        try {
            FileInputStream input = new FileInputStream("D:employees.ser");
            ObjectInputStream in = new ObjectInputStream(input);
            try {
                e = (Employees) in.readObject();
            } catch (ClassNotFoundException e1) {
                System.out.println("NOT FOUND");
                e1.printStackTrace();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.getName());
        System.out.println("Address: " + e.getAge());
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
