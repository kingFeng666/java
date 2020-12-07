package com.lf.Thread.com.lf.Test;
/**
 * @ClassName: 线程的中端
 * @Description:线程的中端一般不采用stop（）方法 因为stop（）方法会导致数据的丢失
 * @Author: 李峰
 * @Date: 2020 年 11月 21 17:14
 * @Version 1.0
 */
public class 线程的中端 {
    public static void main(String[] args) {
        MyThreadDemo myThreadDemo = new MyThreadDemo();
        Thread thread = new Thread(myThreadDemo);
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThreadDemo.flag=false;
    }
}
class MyThreadDemo extends Thread{
    //通过一个标记来实现现成的中断
    boolean flag=true;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (flag ) {
                System.out.println(Thread.currentThread().getName() + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
    }
}
