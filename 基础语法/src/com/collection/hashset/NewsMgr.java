package com.collection.hashset;

import com.collection.arraylist.NewsTitle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class NewsMgr {
    public static void main(String[] args) {
        NewsTitle title1 = new NewsTitle(1,"北京热门-长城","xx1");
        NewsTitle title2 = new NewsTitle(2,"北京热门-故宫","xx1");
        NewsTitle title3 = new NewsTitle(3,"北京热门-颐和园","xx1");
        NewsTitle title4 = new NewsTitle(4,"北京热门-天安门","xx1");
        NewsTitle title5 = new NewsTitle(5,"北京热门-天坛","xx1");

        HashSet set = new HashSet();
        set.add(title1);
        set.add(title2);
        set.add(title3);
        set.add(title4);
        set.add(title5);

        System.out.println(set.size());
        // 乱序  没有get方法
        // 方法一： 增强型for
        for (Object obj : set) {
            NewsTitle news = (NewsTitle) obj;
            System.out.println(news.getTitle());
        }

        System.out.println("============");
        // 方法二： iterator
        Iterator itor = set.iterator();
        while (itor.hasNext()){
            NewsTitle news = (NewsTitle) itor.next();
            System.out.println(news.getTitle());
        }
    }
}
