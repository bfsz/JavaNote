package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className ExceptionDemo
 * @description 异常
 * @date 2018/10/18 13:55
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //exceptionFun();
        //exceptionFunTwo();
        //exceptionFunThrows();
        //exceptionFinally();
        exceptionUserFun();
    }
    //运行时异常：不处理，编译则无法通过
    //非运行时异常：不处理，编译可以通过，如果有异常抛出则抛出异常。

    /**
     * @Description 捕获异常
     * @Date 2018/10/19
     * @Param []
     * @Return void
     */
    private static void exceptionFun() {
        try {
            int[] a = new int[2];
            System.out.println("数组：" + a[3]);
        } catch (Exception e) {
            System.out.println("数组越界异常:" + e);
        }
        System.out.println("跳出块");
    }

    /**
     * @Description 多重捕获异常
     * @Date 2018/10/19
     * @Param []
     * @Return void
     */
    private static void exceptionFunTwo() {
        int a = 10;
        int b = 0;
        int c = 0;
        //使用try···catch··· 来捕获多个异常
        try {
            int[] arr = {1, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(arr[7]);
            c = a / b;

            //如果出现数组越界异常将执行下面第一个catch中的代码
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常：" + e);
            //如果出现数学界异常将执行下面的catch中的代码
        } catch (ArithmeticException e) {
            System.out.println("数学异常：" + e);
        }
    }

    /**
     * @Description throws/throw 关键字
     * @Date 2018/10/19
     * @Param
     * @Return
     */

    private static void exceptionFunThrows() throws ArrayIndexOutOfBoundsException {
        //如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。
        // throws 关键字放在方法签名的尾部。也可以使用 throw 关键字抛出一个异常
        int[] str = {0, 1, 2, 3, 4, 5};
        System.out.println(str[7]);
    }

    /**
     * @Description finally关键字
     * @Date 2018/10/19
     * @Param
     * @Return
     */

    private static void exceptionFinally() {
        int[] strs = {1, 2, 3, 4, 5};
        try {
            System.out.println(strs[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常：" + e);
        } finally {
            strs[0] = 233;
            System.out.println("strs[0] = " + strs[0]);
            System.out.println("finally块执行");
        }
    }

    /**
     * @Description 自定义异常
     * @Date 2018/10/19
     * @Param
     * @Return
     */

    private static void exceptionUserFun() {
        CheckingAcount ca = new CheckingAcount(622672612);
        System.out.println("存：$500");
        ca.deposit(500);
        try {
            System.out.println("\n取：$100");
            ca.draw(100);
            System.out.println("\n取：$600");
            ca.draw(600);
        } catch (InsufficientFundsException e) {
            System.out.println("抱歉，余额不足" + ca.getBalance());
            e.printStackTrace();
        }
    }
}

/**
 * @Description 自定义异常
 * @Date 2018/10/19
 * @Param
 * @Return
 */
class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

/**
 * @Description 模拟银行账户
 * @Date 2018/10/19
 * @Param
 * @Return
 */
class CheckingAcount {
    //余额

    private double balance;
    //卡号

    private int number;

    public CheckingAcount(int number) {
        this.number = number;
    }
    //存钱

    public void deposit(double amount) {
        balance += amount;
    }
    //取钱

    public void draw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    //返回余额

    public double getBalance() {
        return balance;
    }

    //返回卡号


    public int getNumber() {
        return number;
    }
}