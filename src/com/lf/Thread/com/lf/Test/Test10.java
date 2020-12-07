package com.lf.Thread.com.lf.Test;
/**
 * @ClassName: Test10
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 27 10:22
 * @Version 1.0
 */
class Value{
    public int i=15;
}
public class Test10{
    public static void main(String argv[]){
        Test10 t=new Test10( );
        t.first();
    }
    public void first(){
        int i=5;
        Value v=new Value( );
        v.i=25;
        second(v,i);
        //second()方法执行完毕后,就会出栈,里面的所有东西都被释放掉了
        //这里调用的就是first栈帧里面的变量
        System.out.println(v.i);//v.i
    }
    public void second(Value v,int i){
        i = 0;
        v.i = 20;//这里修改的是v里面保存的i
        Value val = new Value( );//在堆上开辟了一个新的空间里面vai 指向了这个新的空间
        v = val;//让v的引用指向了val 的引用
        System.out.println(v.i+" "+i);//这里调用的v.i指向的是堆里面val里面保存的i=15;
    }
}

