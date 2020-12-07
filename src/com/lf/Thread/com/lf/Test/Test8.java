package com.lf.Thread.com.lf.Test;

import java.util.Scanner;

/**
 * @ClassName: Test8
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 26 20:06
 * @Version 1.0
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int count=0;
        if (N<0){
            N=N*(-1);
        }
        for (int i=0;i<=N;i++){
            if (Math.cbrt(i)%1==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
