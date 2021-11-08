package org.cat.danbi.purejava.generic;

public class GenericTest {

    public static void main(String[] args) {

        // 1. 제너릭을 사용하지 않는다.

        SimpleBox box = new SimpleBox();
        box.set(1988);
        Integer n1 = (Integer) box.get(); // 자식타입으로 변환
        System.out.println(n1);

        box.set("응답하라!");
        String s1 = (String) box.get();

        System.out.println(s1);



        // 2. 제너릭을 사용한다.
        Box<Integer> iBox = new Box<>();
        iBox.set(2020);
        Integer i1 = iBox.get();
        System.out.println(i1);

        Box<String> sBox = new Box<>();
        sBox.set("Hello, world!");
        String s2 = sBox.get();
        System.out.println(s2);
        

    }


}
