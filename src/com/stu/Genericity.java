package com.stu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className Genericity
 * @description 泛型方法
 * @date 2018/10/19 14:58
 */

public class Genericity {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 4, 5, 6, 7, 8};
        Double[] doublesArray = {1.1, 1.2, 1.3, 1.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整形数组：");
        printArray(intArray);
        System.out.println("\n双精度数组：");
        printArray(doublesArray);
        System.out.println("\n字符型数组：");
        printArray(charArray);

        System.out.println("1,3,5最大值：" + maxNum(1, 3, 5));
        System.out.println("1.2,2.1,4.1最大值:" + maxNum(1.2, 2.1, 4.1));
        System.out.println("apple,pear,orange最大值:" + maxNum("apple", "pear", "orange"));

        Box<Integer, String> box = new Box<>(123, "earth");
        Box<String, String> box1 = new Box<>("poi", "moon");

        System.out.println(box.getName() + " " + box.getAddress());
        System.out.println(box1.getName() + " " + box1.getAddress());

        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("POI");
        age.add(17);
        number.add(1223456);

        getData(name);
        getData(age);
        getData(number);
    }

    /**
     * @Description 打印数组 泛型方法
     * @Date 2018/10/19
     * @Param [inputArray]
     * @Return void
     */
    private static <E> void printArray(E[] inputArray) {
        //输出数组元素
        for (E element : inputArray) {
            System.out.print(" " + element);
        }
        System.out.println();
    }

    /**
     * @Description 比较三个值大小
     * @Date 2018/10/22
     * @Param
     * @Return
     */
    private static <T extends Comparable<T>> T maxNum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    /**
     * @Description 类型通配符
     * @Date 2018/10/22
     * @Param
     * @Return
     */
    private static void getData(List<?> data) {
        System.out.println("data: " + data.get(0));
    }
}

/**
 * @Description 泛型类
 * @Date 2018/10/22
 * @Param
 * @Return
 */
class Box<T, E> {
    private T name;
    private E address;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getAddress() {
        return address;
    }

    public void setAddress(E address) {
        this.address = address;
    }

    public Box(T name, E address) {
        this.name = name;
        this.address = address;
    }

    public Box() {
    }
}