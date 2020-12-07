package com.lf.Thread.线程安全.守护线程;
/**
 * @ClassName: protectThread
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 22 22:31
 * @Version 1.0
 */
public class protectThread {
    public static void main(String[] args) {
        Thread t=new proThread();
        //设置为守护线程 ,等待用户执行完毕,自动结束
        t.setDaemon(true);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}
class proThread extends  Thread{
    @Override
    public void run() {
        int i=1;
        while(true){
            ++i;
            System.out.println(Thread.currentThread().getName()+"----->"+i);
        }
    }
}
