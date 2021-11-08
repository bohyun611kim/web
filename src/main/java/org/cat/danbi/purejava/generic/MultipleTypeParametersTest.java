package org.cat.danbi.purejava.generic;

public class MultipleTypeParametersTest {

    public static void main(String[] args) {


        Pair<String, Integer> p1 = new Pair<>("danbi", 12);
        Pair<String, String> p2 = new Pair<>("tom", "밥투정전문가!");

        System.out.format("key=%s, value=%s\n", p1.getKey(), p1.getValue());
        System.out.format("key=%s, value=%s\n", p2.getKey(), p2.getValue());

        System.out.println(p1);
        System.out.println(p2);


    }


}
