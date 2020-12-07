package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: 线程的合并
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 21 18:07
 * @Version 1.0
 */
public class 线程的合并 {
    public static void main(String[] args) {
        System.out.println("start");
        Thread thread = new Thread(new Runable2());
        thread.start();
        //join()方法 让thread线程合并到当前线程,当前线程进入阻塞状态,thread执行直到结束
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");

    }
}
class Runable2 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
