package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: ThreadTest1
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 20 22:32
 * @Version 1.0
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        RunThread runThread = new RunThread();
        runThread.run();
        //这一行代码写在那个线程里面的就是那个线程
        Thread thread = Thread.currentThread();
        thread.setName("lo");
        for (int j=0;j<10;j++){
            System.out.println(thread.getName()+j);
        }
    }
}
class RunThread implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        thread.setName("LF");
        for (int i =0;i<10;i++){
            System.out.println(thread.getName()+i);
        }
    }
}