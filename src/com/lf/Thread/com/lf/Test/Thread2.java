package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: Thread2
 * @Description:sleep
 * @Author: 李峰
 * @Date: 2020 年 11月 20 23:00
 * @Version 1.0
 */
public class Thread2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
            Thread.sleep(1000);
        }
    }
}
