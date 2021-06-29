package com.collection.linkedlist;

import com.collection.arraylist.NewsTitle;

import java.util.LinkedList;

public class NewsMgr {
    public static void main(String[] args) {
        NewsTitle title1 = new NewsTitle(1,"北京热门-长城","xx1");
        NewsTitle title2 = new NewsTitle(2,"北京热门-故宫","xx1");
        NewsTitle title3 = new NewsTitle(3,"北京热门-颐和园","xx1");
        NewsTitle title4 = new NewsTitle(4,"北京热门-天安门","xx1");
        NewsTitle title5 = new NewsTitle(5,"北京热门-天坛","xx1");

        LinkedList<NewsTitle> list = new LinkedList<NewsTitle>();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(title4);
        list.add(title5);
        NewsTitle title6 = new NewsTitle(6,"北京热门-国家博物馆","xx1");

        list.addFirst(title6);
        System.out.println("新闻标题共有"+list.size()+"条");

        for (NewsTitle obj : list) {   //返回类型即为NewsTitle
//            NewsTitle ob = (NewsTitle) obj;
            System.out.println(obj.getTitle());
        }
        //泛型 获取头天新闻
        String titleFirst = list.getFirst().getTitle();
        System.out.println("第一条新闻: "+titleFirst);
//        // 获取头条和最后的新闻
//        NewsTitle titleFirst = (NewsTitle) list.getFirst();
//        System.out.println("第一条新闻: "+titleFirst.getTitle());
//
//        NewsTitle titleLast= (NewsTitle) list.getLast();
//        System.out.println("最后一条新闻: "+titleLast.getTitle());
//
//        list.removeLast();
//        NewsTitle titleLast1= (NewsTitle) list.getLast();
//        System.out.println("最后一条新闻: "+titleLast1.getTitle());


    }
}
