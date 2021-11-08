package org.cat.danbi.web.speaker.core.ex;

import org.cat.danbi.web.speaker.core.*;

public class TVUserEx {

    public static void main(String[] args) {

        Speaker sony = new SonySpeaker();
        SamsungTV samsungTV = new SamsungTV(sony);
        samsungTV.volumeUp();

        System.out.println("----------------");
        Speaker apple = new AppleSpeaker();
        LgTV lgTV = new LgTV();
        lgTV.setSpeaker(apple);
        lgTV.powerOn();
        lgTV.volumeUp();


    }
}
