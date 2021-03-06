package com.lf.Thread.线程安全.线程同步机制解决;

/**
 * @ClassName: Account
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 21 22:37
 * @Version 1.0
 */
public class Account {
    private String actno;//账户
    private double Banlance;//余额

    public Account() {
    }

    public Account(String actno, double banlance) {
        this.actno = actno;
        Banlance = banlance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBanlance() {
        return Banlance;
    }

    public void setBanlance(double banlance) {
        Banlance = banlance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "actno='" + actno + '\'' +
                ", Banlance=" + Banlance +
                '}';
    }
    public void getMoney(double money){
        /*
        *线程同步机制 就是一个代码执行结束了 另外一个才能够执行负责必须等待
        * synchronized(线程同步对象){ 线程同步代码块}
        * ()多线程共享的数据  多线程的共享对象
        *
        * */
        synchronized (this){
            //取款前
            double  befor=this.getBanlance();
            //取款后
            double after=befor-money;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //跟新余额
            this.setBanlance(after);
        }
    }
}
