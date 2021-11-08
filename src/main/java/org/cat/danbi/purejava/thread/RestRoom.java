package org.cat.danbi.purejava.thread;

public class RestRoom {

    public synchronized void use() {
        System.out.format("%s :>>> 화장실에 들어갔다.\n", Thread.currentThread());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.format("%s : <<< 화장실에서 나왔다.\n", Thread.currentThread());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.format("%s : 손을 씻었다.\n", Thread.currentThread().getName());
    }

}
