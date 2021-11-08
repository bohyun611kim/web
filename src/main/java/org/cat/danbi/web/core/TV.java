package org.cat.danbi.web.core;

public interface TV {

    default void powerOn() {
        System.out.format("%s power on.\n", getClass().getSimpleName());
    }

    default void powerOff() {
        System.out.format("%s power off.\n", getClass().getSimpleName());
    }

    default void volumeUp() {
        System.out.format("%s volume up.\n", getClass().getSimpleName());
    }

    default void volumeDown() {
        System.out.format("%s volume off.\n", getClass().getSimpleName());
    }
}
