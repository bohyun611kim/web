package org.cat.danbi.purejava.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeEx {

    public static void main(String[] args) {

        // 1. Queue 테스트
        //  Stack 빠르다.
        Queue<String> queue = new ArrayDeque<>(); // First in First out
        queue.offer("Seoul");
        queue.offer("Busan");
        queue.offer("LA");
        System.out.println(queue);

        System.out.println(queue.poll()); // seoul
        System.out.println(queue.poll()); // busan
        System.out.println(queue);
        System.out.println("------------------------------");


        // 2. Deque  테스트 : 양방향 넣고 뺄수 있다.
        Deque<String> stack = new ArrayDeque<>();
        stack.offer("서울");
        stack.offer("부산");
        stack.offer("LA");
        System.out.println(stack);
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack);



    }
}
