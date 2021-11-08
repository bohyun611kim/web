package org.cat.danbi.web.core.ex;

import org.cat.danbi.web.core.SamsungTV;
import org.cat.danbi.web.core.TV;

public class TVUserEx {

    public static void main(String[] args) {

        TV tv = new SamsungTV();
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
}
