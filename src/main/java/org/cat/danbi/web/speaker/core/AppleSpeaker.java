package org.cat.danbi.web.speaker.core;

public class AppleSpeaker implements Speaker{
    @Override
    public void volumeUp() {
        System.out.println(">>> 애플 스피커 볼륨 업");
    }

    @Override
    public void volumeDown() {
        System.out.println(">>> 애플 스피커 볼륨 다운");
    }
}
