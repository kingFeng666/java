package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: 线程的优先级
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 21 17:46
 * @Version 1.0
 */
public class 线程的优先级 {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(1);
        Thread thread = new Thread(new RuableDemo());
        thread.setName("t");
        thread.setPriority(10);
        thread.start();
        for (int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
class RuableDemo implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
