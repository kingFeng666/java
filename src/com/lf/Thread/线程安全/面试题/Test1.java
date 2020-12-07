package com.lf.Thread.线程安全.面试题;

import java.util.Scanner;

/**
 * @ClassName: Test1
 * @Description:分治
 * @Author: 李峰
 * @Date: 2020 年 11月 28 0:34
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//表示有T组数据
        int N=0;
        for (int i = 0; i <T ; i++) {
            //表示有N个盒子
             N= sc.nextInt();
        }
        System.out.println(cel(N));*/
        System.out.println(cel(6));
    }
    public static int cel(int N){
        if (N==1){return 1;}
        if (N==2){
            return 2;
        }else{
         return cel(N/2)+1;
        }
    }
}
