package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: Test7
 * @Description:基本数据类型之间的计算
 * @Author: 李峰
 * @Date: 2020 年 11月 26 14:36
 * @Version 1.0
 */
public class Test7 {
    public static void main(String[] args) {

        //变量或常量必须有类型:要求声明变量或常量时必须声明类型，而且只能在声明以后才能使用。

        //赋值时类型必须一致:值的类型必须和变量或常量的类型完全一致。
        //int a=1.0;就会报错
        short h;
        byte j=2;
        h=j;//正常
        short k=3;
        byte l;
        //l=k;//报错
        //运算时类型必须一致:参与运算的数据类型必须一致才能运算。
        int a=3;
        short b=4;

        int c= a*b;//12
       // short d =a*b;//报错Error:(22, 19) java: 不兼容的类型: 从int转换到short可能会有损失
        System.out.println(c);
        //会报错,因为 a*b要求返回的是一个byte 但是实际上返回的是一个int类型的数据
        byte d= 2;
        byte e=3;
        byte f;
        int g;
        g=d*e;//这个就完全没有问题
        //f=a*b;就会报错 因为从int 转换为byte可能会损失
    }
}

