package com.stu.thread;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className RunnableDemo
 * @description 线程
 * @date 2018/10/23 16:40
 */
public class TestThread {
    public static void main(String[] args) {
        RunnabelDemo r1 = new RunnabelDemo("线程-1");
        r1.start();
        RunnabelDemo r2 = new RunnabelDemo("线程-2");
        r2.start();
    }
}

class RunnabelDemo implements Runnable {
    private Thread t;
    private String threadName;

    public RunnabelDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("创建线程中:" + threadName);
    }

    @Override
    public void run() {
        System.out.println("线程running:" + threadName);
        try {
            for (int i = 6; i > 0; i--) {
                System.out.println("线程：" + threadName + "-" + i);
                //线程sleep
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("线程：" + threadName + "阻塞");
        }
        System.out.println("线程：" + threadName + "结束");
    }

    public void start() {
        System.out.println("线程启动：" + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
