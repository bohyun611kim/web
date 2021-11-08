package org.cat.danbi.purejava.generic;

public class Util {

    /**
     * 제너릭 메소드, 리턴 타입 앞에 타입 파라미터를 쓴다.
     */

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

        // 상황에 맞게 정의해 준다.
        return p1.getKey().equals(p2.getKey()) && p2.getValue().equals(p2.getValue());
    }

}
