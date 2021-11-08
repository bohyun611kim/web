package org.cat.danbi.purejava.collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

    public static void main(String[] args) {

        Map<String, String> dic = new HashMap<>();
        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");
        System.out.println(dic);

        System.out.println(dic.get("baby"));
        System.out.println(dic.get("love"));
        System.out.println(dic.get("apple"));
    }
}
