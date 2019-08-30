package com.Aliyunketang;

import java.lang.Thread;

public class ThreadDemoDianNao {
    public static void main(String[] args) throws Exception {
        Resource res = new Resource();
        new Thread(new Producer(res)).start();
        new Thread(new Consumer(res)).start();
    }
}

class Producer implements Runnable {
    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                this.resource.make();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                this.resource.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Resource {
    private Computer computer;

    public synchronized void make() throws Exception {
        if (this.computer != null) { //已经生产过了
            super.wait();
        }
        Thread.sleep(100);
        this.computer = new Computer("MLDN电脑", 1.1);
        System.out.println("[生产电脑]" + this.computer);
        super.notifyAll();
    }

    public synchronized void get() throws Exception {
        if (this.computer == null) {
            super.wait();
        }
        Thread.sleep(10);
        System.out.println("[取走电脑]" + this.computer);
        System.out.println(this.computer);
        this.computer = null;//
        super.notify();
    }
}

class Computer {
    private static int count = 0;//生产的电脑个数
    private String name;
    private double price;

    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
        count++;
    }

    public String toString() {
        return "[共" + count + "台电脑]" + "电脑名字，" + this.name + ",价值" + this.price;
    }

}

