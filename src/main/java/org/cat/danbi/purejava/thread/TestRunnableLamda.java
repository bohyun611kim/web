package org.cat.danbi.purejava.thread;

public class TestRunnableLamda {
    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r).start();
    }
}
