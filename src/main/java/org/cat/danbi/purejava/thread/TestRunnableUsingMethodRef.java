package org.cat.danbi.purejava.thread;


public class TestRunnableUsingMethodRef {
    public static void main(String[] args) {

        new Thread(new TestRunnableUsingMethodRef()::doSomething).start();
    }


    public void doSomething() {
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
