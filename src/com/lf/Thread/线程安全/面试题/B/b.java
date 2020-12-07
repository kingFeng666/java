package com.lf.Thread.线程安全.面试题.B;

/**
 * @ClassName: b
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 29 14:10
 * @Version 1.0
 */
public class b {
    public static void main(String[] args) {

        String a=new String("hello");
        System.out.println(a.hashCode());
        String b=a;
        System.out.println(a==b);
        System.out.println(b.hashCode());
        a=new String(a+b);
        System.out.println(a.hashCode());

    }
}
