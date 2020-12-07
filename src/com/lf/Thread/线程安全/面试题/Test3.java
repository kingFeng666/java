package com.lf.Thread.线程安全.面试题;
/**
 * @ClassName: Test3
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 29 14:56
 * @Version 1.0
 */
import org.omg.PortableInterceptor.INACTIVE;
import sun.security.krb5.SCDynamicStoreConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
/**
 * @ClassName:DemoTest1
 * @Discroption:
 * @Author:Prey
 * @Date:2020 年 11 月 29 14:11
 * @Version 1.0
 */
public class Test3 {
    public static int judge(List<Integer> list,int m){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == m){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入m n
        int n = scanner.nextInt();
        int m  = scanner.nextInt();

        int index = n;
        List<Integer> list = new ArrayList<>();
        while(index-- != 0){
            list.add(scanner.nextInt());
        }
        System.out.println(judge(list, m));
    }
}

