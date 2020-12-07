package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: Test3
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 26 0:01
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        int n=5;
        /*
        * 外层循环执行n-1次 内层循环没一次都要执行n-1的基础上再减一 次
        * 所以最后一次内层循环执行2次 程序结束
        * 所以就是求里面执行的次数就是  n +(n-1)+(n-2)+...2
        * (n-1)(n+2)/2
        * */
        for (int i=0;i<n-1;i++){
            for (int j=n;j>i;j--){
                System.out.println("........");
            }
        }
    }
}
