package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className LoopStructure
 * @description 循环结构
 * @date 2018/10/11 13:31
 */
public class LoopStructure {
    public static void main(String[] args) {
        //whileDemo();
        //doWhileDemo();
        forDemo();
    }
    //Java中有三种主要的循环结构：
    //     while 循环
    //     do…while 循环
    //     for 循环


    /**
     * @Description while循环
     * @Date 2018/10/11
     * @Param
     * @Return
     */
    private static void whileDemo() {
        int a = 10;
        //只要布尔表达式为 true，循环就会一直执行下去。
        while (a < 15) {
            System.out.println(a);
            a++;
        }
    }

    /**
     * @Description do...while循环
     * @Date 2018/10/11
     * @Param
     * @Return
     */
    private static void doWhileDemo() {
        //对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
        //do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。
        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b > 15);
    }

    /**
     * @Description for循环 增强for循环  break continue
     * @Date 2018/10/11
     * @Param
     * @Return
     */

    private static void forDemo() {
        //最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
        //然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
        //执行一次循环后，更新循环控制变量。
        //再次检测布尔表达式。循环执行上面的过程。
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //增强for循环
        /*
            for(声明语句 : 表达式)
            {
               //代码句子
            }
            声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。
            表达式：表达式是要访问的数组名，或者是返回值为数组的方法。
         */
        int[] nums = {12, 20, 14, 29, 30};
        for (int x : nums
                ) {
            //break  跳出整个语句块
            if (x == 29) {
                break;
            }
            //continue 立刻跳转到下一次循环的迭代
            //在 for 循环中，continue 语句使程序立即跳转到更新语句。
            //在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句
            if (x == 20) {
                continue;
            }
            System.out.print(x + " ");
        }
    }
}
