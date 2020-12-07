package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: 匿名内部类
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 20 21:15
 * @Version 1.0
 */
public class 匿名内部类 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("分支线程"+i);
                }
            }
        });
        thread.start();
        for (int j=0;j<100;j++){
            System.out.println("主线程"+j);
        }
    }
}
