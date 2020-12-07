package com.lf.Thread.线程安全.原子性;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: 原子类
 * @Description: 使用原子类实现自增自减操作
 * @Author: 李峰
 * @Date: 2020 年 11月 28 0:02
 * @Version 1.0
 */
public class 原子类 {
    public static void main(String[] args) {
        //创建100个线程
        for (int i = 0; i <1000 ; i++) {
            new MyThread().start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(MyThread.atomicInteger.get());
    }
    static  class MyThread extends  Thread{
        //使用这个对象AtomicInteger实现自增可以保证原子性
        //i++不能保证线程的原子性
        private static AtomicInteger atomicInteger=new AtomicInteger();
        public  static void print(){
            for (int i = 0; i <1000 ; i++) {
             atomicInteger.getAndIncrement();
            }
            System.out.println(Thread.currentThread().getName()+"......."+atomicInteger.get());
        }
        @Override
        public void run() {
            print();
        }
    }
}
