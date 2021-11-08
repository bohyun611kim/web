package org.cat.danbi.purejava.collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(-1);
        System.out.println(list);

        // index : 기준으로 앞에 넣는다.
        list.add(2, 100);
        System.out.println(list);
        System.out.println("리스트의 엘리먼트 갯수 : " + list.size());

        // 특정위치 값 찾기
        System.out.println("2번째 index 값 : " + list.get(2));


        // 하나씩 꺼내기
        for(int m : list) {
            System.out.format("%d ", m);
        }
        System.out.println();

    }
}
