package com.collection.collections;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a1");
        list.add("a2");

        List<Integer>list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(3);
        list2.add(15);
        list2.add(10);


        System.out.println("====================");

        // 遍历
        for (Integer i : list2) {
            System.out.println(i);
        }
        //排序
        Collections.sort(list2);
        Collections.reverse(list2);
        System.out.println("====================");
        for (Integer i : list2) {
            System.out.println(i);
        }
        System.out.println("====================");
        // 最大最小
        System.out.println(Collections.max(list2));
        System.out.println(Collections.min(list2));

        System.out.println("====================");
        // 指定元素
        System.out.println(Collections.binarySearch(list2,3));


    }
}
