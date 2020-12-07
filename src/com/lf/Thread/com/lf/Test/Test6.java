package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: Test6
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 26 14:22
 * @Version 1.0
 */
public class Test6{
        public String str="6";
        public static void main(String[] args) {
            Test6 sv=new Test6();
            sv.change(sv.str);
            System.out.println(sv.change(sv.str));
            System.out.println(sv.str);
        }
        public String change(String str) {
            str="10";
            return str;
        }
    }

