package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: 终止线程的睡眠
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 20 23:23
 * @Version 1.0
 */
public class 终止线程的睡眠 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
        try {
            Thread.sleep(5000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().setName("end");
        System.out.println(Thread.currentThread().getName());
    }
}
class MyThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}