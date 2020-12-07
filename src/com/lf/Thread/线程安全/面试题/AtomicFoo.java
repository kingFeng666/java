package com.lf.Thread.线程安全.面试题;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * @ClassName: AtomicFoo
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 11月 24 16:43
 * @Version 1.0
 */
public class AtomicFoo {
    private final AtomicInteger atomic = new AtomicInteger(0);

    public AtomicFoo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        atomic.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (atomic.get() != 1) {
        }
        printSecond.run();
        atomic.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (atomic.get() != 2) {
        }
        printThird.run();
    }
}
