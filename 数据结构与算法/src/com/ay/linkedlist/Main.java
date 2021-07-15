package com.ay.linkedlist;
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.remove(2);

        System.out.println(list1);

    }
}
