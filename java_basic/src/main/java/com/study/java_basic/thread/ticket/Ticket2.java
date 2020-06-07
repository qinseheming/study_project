package com.study.java_basic.thread.ticket;

/**
 * @author yangming
 * @date 2020/6/7
 */
public class Ticket2 implements Runnable{
    private int ticketNum = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketNum-- + "张票");
                }
            }
        }
    }
}
