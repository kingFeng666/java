package com.lf.Thread.线程安全.面试题;
/**
 * @ClassName: synchronized面试题
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 22 14:48
 * @Version 1.0
 */
public class synchronized面试题2 {
    public static void main(String[] args) {
        myClass mc = new myClass();
        myClass mc1 = new myClass();
        Thread t1=new MyThread(mc);
        Thread t2=new MyThread(mc1);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
class MyThread1 extends  Thread{
    private myClass mc;

    MyThread1(myClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.dosome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doather();
        }
    }
}
class  myClass1{
    public synchronized static void  dosome(){
        System.out.println("dosome begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("dosome end");
    }
    public synchronized static void doather(){
        System.out.println("doather begin");
        System.out.println("doather end");
    }
}
