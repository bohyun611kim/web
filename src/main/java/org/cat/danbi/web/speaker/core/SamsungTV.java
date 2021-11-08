package org.cat.danbi.web.speaker.core;

import org.springframework.beans.factory.annotation.Autowired;

public class SamsungTV implements TV {

    private Speaker speaker;

    @Autowired
    public SamsungTV(Speaker speaker) {
        this.speaker = speaker;
        System.out.println("SamsungTV 스피커를 넣었습니다.");
        System.out.println("SamsungTV is created.");
    }

    @Override
    public void volumeUp() {
        System.out.println("samsungTV : ");
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.println("samsungTV : ");
        speaker.volumeDown();
    }
}
