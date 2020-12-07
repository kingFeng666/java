package com.lf.Thread.com.lf.Test;

/**
 * @ClassName: Test
 * @Description: equals和==
 * @Author: 李峰
 * @Date: 2020 年 11月 25 23:18
 * @Version 1.0
 */
        /*==和equals的区别
        ==： 它的作用是判断两个对象的地址是不是相等。即判断两个对象是不是同一个对象。
        (基本数据类型==比较的是值，引用数据类型==比较的是内存地址)
        因为 Java 只有值传递，所以，对于 == 来说，不管是比较基本数据类型，还是引用数据类型的变量，
        其本质比较的都是值，只是引用类型变量存的值是对象的地址。
        equals() : 它的作用也是判断两个对象是否相等，它不能用于比较基本数据类型的变量。
        equals()方法存在于Object类中，而Object类是所有类的直接或间接父类。
        equals() 方法存在两种使用情况：
        情况 1：类没有覆盖 equals()方法。则通过 equals()比较该类的两个对象时，
        等价于通过“==”比较这两个对象。使用的默认是 Object类equals()方法。
        情况 2：类覆盖了 equals()方法。一般，我们都覆盖 equals()方法来两个对象的内容相等；
        若它们的内容相等，则返回 true(即，认为这两个对象相等)。*/

public class Test {
    public static void main(String[] args) {
        String a="hello";
        String b="hello";
        char c []={'h','e','l','l','o'};
        System.out.println(a.equals(b));//true

        System.out.println(b.equals(c));//false

        System.out.println(a == b);// true// a 和 b指向的是同一内存空间

        System.out.println(b.equals(new String("hello")));//true
    }
}
