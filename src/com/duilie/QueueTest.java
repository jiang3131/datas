package com.duilie;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> qu = new Queue<>();
        qu.enqueue("a");
        qu.enqueue("b");
        qu.enqueue("c");
        qu.enqueue("d");
        for (Object o : qu) {
            System.out.println(o);
        }
        System.out.println("_______________");
        String s = qu.dequeue();
        String s1 = qu.dequeue();

        System.out.println(s);
        System.out.println(s1);
        System.out.println("剩余个数"+qu.size());

    }
}
