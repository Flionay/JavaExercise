package com.collection.collections;

import com.collection.arraylist.NewsTitle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<NewsTitle> list = new ArrayList<NewsTitle>();
        NewsTitle new1 = new NewsTitle(1,"天安门1","author");
        NewsTitle new2 = new NewsTitle(7,"天安门7","author");
        NewsTitle new3 = new NewsTitle(3,"天安门3","author");
        NewsTitle new4 = new NewsTitle(5,"天安门5","author");

        list.add(new1);
        list.add(new2);
        list.add(new4);
        list.add(new3);
        // 遍历
        for (NewsTitle newsTitle : list) {
            System.out.println(newsTitle.getTitle());
        }
        System.out.println("===============");
        // 要想对自定义类进行排序，需要重写类的比较规则 compareable
        Collections.sort(list);
        for (NewsTitle newsTitle : list) {
            System.out.println(newsTitle.getTitle());
        }

    }
}
