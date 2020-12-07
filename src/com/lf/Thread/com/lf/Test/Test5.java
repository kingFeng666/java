package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: Test5
 * @Description:包装类的== 和 equals方法
 * @Author: 李峰
 * @Date: 2020 年 11月 26 14:03
 * @Version 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        Integer i = 42;
        Long l = 42l;
        Double d = 42.0;
        /*System.out.println(i==l);//会报编译错误,不同类型的数据不能使用==比较
        System.out.println(i==d);
        System.out.println(l==d);*/
        /* 两个基本型的封装型进行equals()比较，首先equals()会比较类型，如果类型相同，则继续比较值，如果值也相同，返回true。*/
        System.out.println(i.equals(d));//false
        System.out.println(d.equals(l));//false
        System.out.println(i.equals(l));//false
        //这里自动装箱 将42 封装成long类型的,所以先比较类型是否相同,类型相同在比较值是否相同,相同返回true
        System.out.println(l.equals(42L));//true

        //基本型和封装类型调用equals方法
        //这里会自动将基本数据类型封装成包装类型,然后调用equals()方法,比较
        int a=1;
        int b=2;
        Integer c=3;
        System.out.println(c.equals(a + b));//true
    }


}
