package org.cat.danbi.purejava.lamda;

import java.util.ArrayList;
import java.util.List;

public class PersonEx {

    // 인터페이스는 구현체를 넘겨받는다.
    public void printPerson(List<Person> roster, CheckPerson checkPerson) {
        for(Person person : roster) {
            if(checkPerson.test(person)) {
                System.out.println(person);
            }
        }
    }


    public void go() {
        Person p1 = new Person("아이유", 1993, "iu@gmail.com");
        Person p2 = new Person("이선균", 1975, "sun@naver.com");
        Person p3 = new Person("이지아", 1978, "lee@naver.com");

        List<Person> roster = new ArrayList<>();
        roster.add(p1);
        roster.add(p2);
        roster.add(p3);

        // 출력 메세지
        System.out.println("성이 이씨");
        // 구현체
        printPerson(roster, person -> person.getName().startsWith("이"));
        System.out.println();

        // 1990년 이후 출생자 출력
        System.out.println("1990년 이후 출생자");
        printPerson(roster, person -> person.getBirth() >= 1990);
        System.out.println();

        // gmail 이용자 출력
        System.out.println("gmail 이용자");
        printPerson(roster, person -> person.getEmail().endsWith("gmail.com"));

    }

    public static void main(String[] args) {
        new PersonEx().go();
    }
}
