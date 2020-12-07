package com.lf.Thread.线程安全.原子性;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: 原子性
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 24 22:56
 * @Version 1.0
 */
public class 原子性 {
    public static void main(String[] args) {
        //启动两个线程
        getNum getNum = new getNum();
        for (int i=1;i<=2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                     while (true){
                         System.out.println(Thread.currentThread().getName()+"---->"+getNum.getNum());
                         try {
                             Thread.sleep(100);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
                }
            }).start();
        }
    }
    static class getNum1{
        int num;
        public int getNum(){
            return num++;
        }
    }
    static class getNum{
        AtomicInteger num=new AtomicInteger();
        public int getNum(){
            return num.getAndIncrement();
        }
    }

}
