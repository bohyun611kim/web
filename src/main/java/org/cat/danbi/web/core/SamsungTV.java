package org.cat.danbi.web.core;

public class SamsungTV implements TV{

    public SamsungTV() {
        System.out.println("SamsungTV is created.");
    }

    @Override
    public void volumeUp() {
        System.out.println("삼성티비 볼륨 업");
    }

    @Override
    public void volumeDown() {
        System.out.println("삼성티비 볼륨 다운");
    }
}
