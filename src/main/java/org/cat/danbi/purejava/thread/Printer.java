package org.cat.danbi.purejava.thread;

public class Printer {

    public void println(String str) {
        for (char c : str.toCharArray()) {
            System.out.println(c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
}
