package org.cat.danbi.web.core.ex;

import org.cat.danbi.web.core.LgTV;
import org.cat.danbi.web.core.SamsungTV;
import org.cat.danbi.web.core.TV;
import org.cat.danbi.web.core.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TVUserUsingJavaConfig {

    public static void main(String[] args) {


        // 빈 읽고 생성한다.
        ApplicationContext context
                =  new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("----------- 자바설정으로 빈을 구성 ----------");
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
