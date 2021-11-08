package org.cat.danbi.purejava.generic;

public class UtilTest {

    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(1, "나단비");
//        Pair<Integer, String> p2 = new Pair<>(2, "김봉구");
        Pair<Integer, String> p2 = new Pair<>(1, "나단비");
        boolean result = Util.compare(p1, p2);
        System.out.println(result);

    }
}
