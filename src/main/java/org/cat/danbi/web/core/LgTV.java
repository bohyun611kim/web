package org.cat.danbi.web.core;

public class LgTV implements TV {

    public LgTV() {
        System.out.println("LgTV is created.");
    }


    @Override
    public void powerOn() {
        System.out.println("LgTV is Power On!");
    }

    @Override
    public void powerOff() {
        System.out.println("LgTV is Power Off!");

    }
}
