package org.cat.danbi.purejava.thread;

class TimerRunnable implements Runnable {

    /**
     * 인터페이스 구현체를  구현해준다.
     */
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // 구현체
    }
}

public class TestRunnable {
    public static void main(String[] args) {

        Runnable r = new TimerRunnable();
        Thread th = new Thread(r);
        th.start();
    }
}
