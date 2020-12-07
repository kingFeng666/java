package com.lf.Thread.线程安全.面试题;
/**
 * @ClassName: synchronized面试题
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 22 14:48
 * @Version 1.0
 */
public class synchronized面试题 {
    public static void main(String[] args) {
        myClass mc = new myClass();
        Thread thread=new MyThread(mc);
        Thread thread1=new MyThread(mc);
        thread.setName("t1");
        thread1.setName("t2");
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
    }
}
class MyThread extends  Thread{
    private myClass mc;

    MyThread(myClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.dosome();
        }else{
            mc.doather();
        }
    }
}
class  myClass{
    public synchronized void  dosome(){
        System.out.println("dosome begin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("dosome end");
    }
    public void doather(){
        System.out.println("doather begin");
        System.out.println("doather end");
    }
}