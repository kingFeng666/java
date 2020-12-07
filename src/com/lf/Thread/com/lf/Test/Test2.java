package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: Test2
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 25 15:22
 * @Version 1.0
 */
public class Test2 {
    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pong");
    }
}
