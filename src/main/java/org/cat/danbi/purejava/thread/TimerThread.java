package org.cat.danbi.purejava.thread;

public class TimerThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TestThread {
    public static void main(String[] args) {

        TimerThread th = new TimerThread();
        th.start();
    }
}