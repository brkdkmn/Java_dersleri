package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<String> deq1=new LinkedList<>();

        deq1.add("K");
        deq1.add("B");
        deq1.addLast("T");
        deq1.addFirst("C");

        System.out.println(deq1.getFirst()); // C
        System.out.println(deq1.getLast()); // T

        System.out.println(deq1.remove()); // C
        System.out.println(deq1.poll()); // K
        System.out.println(deq1.removeLast()); // T
        System.out.println(deq1.remove()); // B

        deq1.add("K");
        deq1.add("B");

        deq1.push("A"); // [A, K, B]
        System.out.println(deq1.pop()); // A

        System.out.println(deq1.element()); // K
        System.out.println(deq1.peek()); // K

        System.out.println(deq1.offer("N")); // true Liste ==>> [K, B, N]

        System.out.println(deq1.size()); // 3
        System.out.println(deq1);
    }
}
