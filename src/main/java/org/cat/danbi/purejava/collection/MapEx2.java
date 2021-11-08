package org.cat.danbi.purejava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("김성동", 97);
        scoreMap.put("황기태", 88);
        scoreMap.put("김남윤", 98);
        scoreMap.put("이재문", 70);
        scoreMap.put("한원선", 99);
        System.out.println(scoreMap);
        System.out.println("HashMap 요소갯수 : " + scoreMap.size());

        System.out.println(scoreMap.get("황기태"));

        // 1. keySet
        Set<String> keySet = scoreMap.keySet();
        for (String key : keySet) {
            int value = scoreMap.get(key);
            System.out.format("%s : %d\n", key, value);
        }
        System.out.println("---------------------");

        // 2. entrySet
        Set<Map.Entry<String, Integer>> entrySet = scoreMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.format("%s : %d\n", entry.getKey(), entry.getValue());
        }
    }
}
