package org.cat.danbi.web.core.ex;

import org.cat.danbi.web.core.BeanFactory;
import org.cat.danbi.web.core.TV;

import java.util.Scanner;

public class TVUserUsingFactory {

    public static void main(String[] args) {

        BeanFactory factory = new BeanFactory();
        System.out.println("빈 이름을 입력하세요 : ");

        try(Scanner sc = new Scanner(System.in)) {
            String beanName = sc.next();

            TV tv = (TV) factory.getBean(beanName);
            tv.powerOn();
            tv.volumeUp();
        }
    }
}
