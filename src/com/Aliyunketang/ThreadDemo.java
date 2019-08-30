package com.Aliyunketang;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.lang.Thread;

//public class ThreadDemo {
//    public static void main(String[] args) {
//        Thread userThread = new Thread(() -> {
//            for (int x = 0; x < 10; x++) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在运行，x=" + x);
//            }
//        }, "用户线程");
//        Thread daemonThread = new Thread(() -> {
//            for (int x = 0; x < Integer.MAX_VALUE; x++) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在运行，x=" + x);
//            }
//        }, "守护线程");
//        daemonThread.setDaemon(true);
//        userThread.start();
//        daemonThread.start();
//    }
   public class ThreadDemo {
    public static void main(String[] args) throws Exception{
        MyThread mt=new MyThread();
        new Thread(mt,"票贩子A").start();
        new Thread(mt,"票贩子B").start();
        new Thread(mt,"票贩子C").start();
    }
}
class MyThread implements Runnable{
       private volatile int ticket=9;//直接内存操作，未建立副本值
    @Override
    public void run() {
        synchronized (this) {
            while (this.ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "现在正在运行，" + this.ticket--);
            }
        }
    }
}