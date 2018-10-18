package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className Operator
 * @description 运算符
 * @date 2018/10/10 17:01
 */
public class Operator {
    public static void main(String[] args) {
        //operatorDemo();
        //relationFun();
        //anOperator();
        //logicalOperator();
        //assigningOperator();
        //conditionalOperator();
        instanceofOperator();
    }

    /**
    *@Description   算术运算符
    *@Date  2018/10/10
    *@Param
    *@Return
    */
    private static void operatorDemo(){
        int a = 1;
        int b = 2;
        double c = 1.2;
        double d = 2.2;
        //求余
        System.out.println("a%b = " + a%b);
        //自增 前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
        System.out.println("a++ = " + a++);
        System.out.println("c-- = " + c--);
        //自减 后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算。
        System.out.println("++b = " + ++b);
        System.out.println("--d = " + --d);
    }

    /**
    *@Description 关系运算符
    *@Date  2018/10/10
    *@Param
    *@Return
    */
    private static void relationFun(){
        int upNum = 10;
        int dnNum = 12;
        System.out.println("upNum == dnNum :" + ( upNum == dnNum ));
        System.out.println("upNum != dnNum :" + ( upNum != dnNum ));
        System.out.println("upNum > dnNum :" + ( upNum > dnNum ));
        System.out.println("upNum < dnNum :" + ( upNum < dnNum ));
        System.out.println("upNum >= dnNum :" + ( upNum >= dnNum ));
        System.out.println("upNum <= dnNum :" + ( upNum <= dnNum ));
    }

    /**
    *@Description 位运算符
    *@Date  2018/10/10
    *@Param
    *@Return
    */

    private static void anOperator(){
        // Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。
        //位运算符作用在所有的位上，并且按位运算。假设a = 60，b = 13
        //A = 0011 1100 (60)
        //B = 0000 1101 (13)
        //C = 0000 0010 (2)
        int A = 60;
        int B = 13;
        int C = 2;
        //& 如果相对应位都是1，则结果为1，否则为0  0000 1100 = 12
        System.out.println(A & B);
        //| 如果相对应位都是0，则结果为0，否则为1  0011 1101 = 61
        System.out.println(A | B);
        //^ 如果相对应位值相同，则结果为0，否则为1  0011 0001 = 49
        System.out.println(A ^ B);
        //~ 按位取反运算符翻转操作数的每一位，即0变成1，1变成0。 1100 0011 = -61
        System.out.println(~A);
        //<< 按位左移运算符。左操作数按位左移右操作数指定的位数。 0000 1000 = 8
        System.out.println(C << 2);
        //>> 按位右移运算符。左操作数按位右移右操作数指定的位数。 0000 0011 = 3
        System.out.println(B >> 2);
        //>>> 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 0011 1100 = 0000 1111
        System.out.println(A >>> 2);
    }

    /**
    *@Description 逻辑运算符
    *@Date  2018/10/11
    *@Param
    *@Return
    */

    private static void logicalOperator(){
        // && :称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。
        // || :称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。
        // !  :称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。
        boolean A = true;
        boolean B = false;
        System.out.println(A && B);
        System.out.println(A || B);
        System.out.println(!A);
        // && 短路逻辑与
        //当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，
        //但是当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了。
        int a = 5;
        boolean b = (a<4)&&(a++<10);
        System.out.println("使用短路逻辑运算符的结果为"+b);
        System.out.println("a的结果为"+a);
    }

    /**
    *@Description 赋值运算符
    *@Date  2018/10/11
    *@Param
    *@Return
    */

    private static void assigningOperator(){
                int a = 10;
                int b = 20;
                int c = 0;
                c = a + b;
                System.out.println("c = a + b = " + c );
                c += a ;
                System.out.println("c += a  = " + c );
                c -= a ;
                System.out.println("c -= a = " + c );
                c *= a ;
                System.out.println("c *= a = " + c );
                a = 10;
                c = 15;
                c /= a ;
                System.out.println("c /= a = " + c );
                a = 10;
                c = 15;
                c %= a ;
                System.out.println("c %= a  = " + c );
                c <<= 2 ;
                System.out.println("c <<= 2 = " + c );
                c >>= 2 ;
                System.out.println("c >>= 2 = " + c );
                c >>= 2 ;
                System.out.println("c >>= a = " + c );
                c &= a ;
                System.out.println("c &= 2  = " + c );
                c ^= a ;
                System.out.println("c ^= a   = " + c );
                c |= a ;
                System.out.println("c |= a   = " + c );
            }


     /**
     *@Description 条件运算符(三元运算符)
     *@Date  2018/10/11
     *@Param
     *@Return
     */
     private static void conditionalOperator(){
       //variable x = (expression) ? value if true : value if false
       int aNum,bNum;
       aNum = 10;
       bNum = (aNum > 9)? 20 : 30;
         System.out.println(bNum);
       bNum = (aNum < 9)? 20 : 30;
         System.out.println(bNum);
     }

     /**
     *@Description  instanceof 运算符
     *@Date  2018/10/11
     *@Param
     *@Return
     */

     private static void instanceofOperator(){
         //该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。
         //( Object reference variable ) instanceof  (class/interface type)
         String name = "EUREKA";
         boolean result = name instanceof String;
         System.out.println(result);
     }
}
