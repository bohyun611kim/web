package org.cat.danbi.web.core.ex;

import org.cat.danbi.web.core.component.LgTV;
import org.cat.danbi.web.core.component.SamsungTV;
import org.cat.danbi.web.core.component.TV;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TVUserUsingXmlCS {

    public static void main(String[] args) {


        // 빈 읽고 생성한다.
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext03-cs.xml");
        System.out.println("----- CS 구성으로 빈을 구성합니다. -----");
        // by-name
        TV samsungTV = context.getBean("samsungTV",SamsungTV.class);
        samsungTV.powerOn();
        samsungTV.volumeUp();

        // by-type
        TV lgTV = context.getBean(LgTV.class);
        lgTV.powerOn();
        lgTV.volumeDown();

    }
}
