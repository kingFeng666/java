package com.lf.Thread.com.lf.Test;
/**
 * @ClassName: staticTest
 * @Description:静态方法和实例方法
 * @Author: 李峰
 * @Date: 2020 年 11月 25 18:45
 * @Version 1.0
 */
public class staticTest {
    public static void main(String[] args) {
        staticTest staticTest = new staticTest();
        staticTest.say();
        o();
    }
    public void say(){
        o();
    }
    public static void  o(){
        staticTest staticTest = new staticTest();
        staticTest.say();
    }
}
