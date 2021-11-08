package org.cat.danbi.web.core.component;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {

    public SamsungTV() {
        System.out.println("CS-SamsungTV is created.");
    }
}
