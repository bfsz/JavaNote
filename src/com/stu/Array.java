package com.stu;

import java.util.Arrays;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className Array
 * @description 数组
 * @date 2018/10/12 13:14
 */
public class Array {
    public static void main(String[] args) {
        //声明创建数组
        double[] dbList = {1, 0.5, 2, 3, 4, 1.2, 7};
        double sum = 0;
        double maxNum = 0;
        double minNum = 0;
        //遍历所有元素
        for (double t : dbList
                ) {
            System.out.print(t + " ");
        }

        //遍历求和
        for (double aDbList : dbList) {
            sum += aDbList;
        }
        System.out.println("\nSUM = " + sum);

        //查找最大元素,最小元素
        maxNum = dbList[0];
        minNum = dbList[0];

        for (double aDbList : dbList) {
            if (aDbList > maxNum) {
                maxNum = aDbList;
            }
            if (aDbList < minNum) {
                minNum = aDbList;
            }
        }
        System.out.println("Max = " + maxNum + "   Min = " + minNum);

        //方法
        printArray(dbList);
        System.out.println();

        for (double v : relay(dbList)) {
            System.out.print(v + " ");
        }
        System.out.println();

        //二维数组
        arrays();
        System.out.println();

        //倒序
        for (double v : reverse(dbList)) {
            System.out.print(v + " ");
        }
        System.out.println();

        //数组转字符串
        System.out.println(Arrays.toString(dbList));
        //字符串转数组
        String str_a = "EUREKA IS NO.1";
        char[] str_b = str_a.replaceAll(" +", "").toCharArray();
        for (char v : str_b) {
            System.out.print(v + " ");
        }
        System.out.println();


        //排序
        Arrays.sort(str_b);
        for (char v : str_b) {
            System.out.print(v + " ");
        }
        System.out.println();

        //fill
        Arrays.fill(str_b,'-');
        for (char v : str_b) {
            System.out.print(v + " ");
        }
    }

    /**
     * @Description 数组作为函数的参数
     * @Date 2018/10/12
     * @Param
     * @Return
     */
    private static void printArray(double[] array) {
        for (double arrays : array) {
            System.out.print(arrays + " ");
        }
    }

    /**
     * @Description 数组作为函数的返回值
     * @Date 2018/10/12
     * @Param
     * @Return
     */
    private static double[] relay(double[] array) {
        double[] strs = new double[array.length];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = array[i] + 1;
        }
        return strs;
    }

    /**
     * @Description 多维数组
     * @Date 2018/10/12
     * @Param
     * @Return
     */
    private static void arrays() {
        double[][] str = {{1, 2, 3}, {1.1, 1.2, 1.3}, {2.1, 2.2, 2.3}};
        System.out.println(str[2][1]);
    }

    /**
     * @Description 数组倒序
     * @Date 2018/10/12
     * @Param
     * @Return
     */
    private static double[] reverse(double[] array) {
        double[] resultArray = new double[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            resultArray[i] = array[j];
        }
        return resultArray;
    }
}

