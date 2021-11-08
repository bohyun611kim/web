package org.cat.danbi.web.core.ex;

import org.cat.danbi.web.core.component.LgTV;
import org.cat.danbi.web.core.component.SamsungTV;
import org.cat.danbi.web.core.component.TV;
import org.cat.danbi.web.core.component.TvConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TVUserUsingJavaCS {

    public static void main(String[] args) {


        // 빈 읽고 생성한다.
        ApplicationContext context
                =  new AnnotationConfigApplicationContext(TvConfig.class);

        System.out.println("----------- 자바설정 CS  ----------");
        // by-name
        TV samsungTV = context.getBean("samsungTV", SamsungTV.class);
        samsungTV.powerOn();
        samsungTV.volumeUp();

        // by-type
        TV lgTV = context.getBean(LgTV.class);
        lgTV.powerOn();
        lgTV.volumeDown();

    }
}
