package com.lf.Thread.线程安全.线程异步;

/**
 * @ClassName: accountThread
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 21 22:45
 * @Version 1.0
 */
public class accountThread extends Thread {
    //两个账户要实现数据共享  所以使用了构造方法的形式
    public accountThread(Account act) {
        this.act = act;
    }

    private Account act;
    @Override
    public void run() {
        act.getMoney(5000);
        System.out.println(Thread.currentThread().getName()+ "对账户"+act.getActno()+"当前余额"+act.getBanlance());
    }
}
