package com.lf.Thread.线程安全.死锁;

/**
 * @ClassName: 死锁
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 22 17:31
 * @Version 1.0
 */
public class 死锁 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread01 thread01 = new Thread01(o1, o2);
        Thread02 thread02 = new Thread02(o1,o2);
        thread01.start();
        thread02.start();
    }
}
class Thread01 extends  Thread{
    Object o1;
    Object o2;
    public Thread01(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}
class Thread02 extends  Thread{
    Object o1;
    Object o2;
    public Thread02(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){
            }
        }
    }
}
