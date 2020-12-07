package com.lf.Thread.com.lf.Test;
public class ThreadTest  {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        //t.run();
        t.start();
        for (int j=0;j<100;j++){
            System.out.println("主线程"+j);
        }
    }
 static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i=0;i<100;i++){
                System.out.println("线程分支"+i);
            }
        }
    }
}
