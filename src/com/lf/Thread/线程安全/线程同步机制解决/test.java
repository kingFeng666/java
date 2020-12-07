package com.lf.Thread.线程安全.线程同步机制解决;

/**
 * @ClassName: test
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 21 22:51
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Account act = new Account("a001", 10000);
        //创建两个线程,相当于两个人来取钱
        Thread t1 = new accountThread(act);
        Thread t2 = new accountThread(act);
        t1.setName("李峰");
        t2.setName("薛建伟");
        t1.start();
        t2.start();
    }
}
