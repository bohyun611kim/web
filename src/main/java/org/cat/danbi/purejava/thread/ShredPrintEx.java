package org.cat.danbi.purejava.thread;

public class ShredPrintEx {

    public static void main(String[] args) {
        Printer printer = new Printer();

        //  공유자원에 대한 경쟁모드 시작
        new Thread(() -> printer.println("ABCD")).start();
        new Thread(() -> printer.println("abcd")).start();
    }
}
