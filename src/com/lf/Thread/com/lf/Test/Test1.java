package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: Test1
 * @Description: do while()
 * @Author: 李峰
 * @Date: 2020 年 11月 25 15:12
 * @Version 1.0
 */
public class Test1 {
        public static void main(String args[]) {
            int i = 7;
            do {
                System.out.println(--i);
                --i;
            } while (i != 0);
            System.out.println(i);
        }
}
