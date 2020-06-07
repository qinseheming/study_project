package com.study.java_basic.thread.ticket;

/**
 * @author yangming
 * @date 2020/6/7
 */
public class Ticket extends Thread{

    private int ticketNum = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (ticketNum > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketNum-- + "张票");
            }
        }
    }
}
