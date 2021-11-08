package org.cat.danbi.web.speaker.core;

public interface Speaker {

    default  void volumeUp() {
        System.out.format("%s - volume up.\n", getClass().getSimpleName());
    }

    default  void volumeDown() {
        System.out.format("%s - volume down.\n", getClass().getSimpleName());
    }
}
