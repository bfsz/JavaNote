package com.stu.thread;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className TestThread2
 * @description 线程-继承Thread
 * @date 2018/10/23 16:56
 */
class TestThread2 extends Thread {
    private Thread t;
    private String threadName;

    TestThread2(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    @Override
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class TestThreadDemo {

    public static void main(String args[]) {
        TestThread2 thread2 = new TestThread2("Thread-1");
        thread2.start();

        TestThread2 thread21 = new TestThread2("Thread-2");
        thread21.start();
    }
}
