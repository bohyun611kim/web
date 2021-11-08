package org.cat.danbi.purejava.collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

    public static void main(String[] args) {

        Set<String> words = new HashSet<>();
        words.add("자바");
        words.add("데이타베이스");
        words.add("자바");

        System.out.println(words);
        System.out.println(words.contains("자바"));

        System.out.println("--------------------------------");
        for (String e : words) {
            System.out.println(e);
        }


    }
}
