package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className Genericity
 * @description 泛型
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

    }

    /**
     * @Description 打印数组 泛型方法
     * @Date 2018/10/19
     * @Param [inputArray]
     * @Return void
     */
    public static <E> void printArray(E[] inputArray) {
        //输出数组元素
        for (E element : inputArray) {
            System.out.print(" " + element);
        }
        System.out.println();
    }
}
