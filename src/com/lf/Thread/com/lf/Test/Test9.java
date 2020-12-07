package com.lf.Thread.com.lf.Test;
import java.util.Scanner;
/**
 * @ClassName: Test9
 * @Description:[N,M]中非偶数的合数个数统计
 * @Author: 李峰
 * @Date: 2020 年 11月 26 20:19
 * @Version 1.0
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int S=0;
        if (M<N){
            S=N;
            N=M;
            M=S;
        }
        int count=0;
        for (int i=N;i<=M;i++){
           if (i%2!=0){
               for(int j=2;j<i;j++){
                   if (i%j==0){
                       System.out.println(i);
                       count++;
                       break;
                   }
               }
           }
        }
        System.out.println("合数的个数"+count);
    }
}
