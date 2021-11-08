package org.cat.danbi.web.speaker.core;

public class LgTV implements TV {

    private Speaker speaker;

    public LgTV() {
        System.out.println("LgTV is created.");
    }


    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
        System.out.println("엘지티비에 스프커를 세터 주입했습니다.");
    }
}
