package org.cat.danbi.purejava.collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

    public static void main(String[] args) {

        List<Point> list = new ArrayList<>();
        list.add(new Point(2,3));
        list.add(new Point(-5,20));
        list.add(new Point(30,-8));
        System.out.println(list);

        // 제거
        list.remove(1);
        System.out.println(list);

        Point p1 = list.get(1);
        System.out.println(p1);

        System.out.println("포인트 출력");
        list.forEach(x -> System.out.println(x));
    }
}
