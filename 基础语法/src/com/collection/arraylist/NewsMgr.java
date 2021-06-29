package com.collection.arraylist;

import java.util.ArrayList;

public class NewsMgr {
    public static void main(String[] args) {
        NewsTitle title1 = new NewsTitle(1,"北京热门-长城","xx1");
        NewsTitle title2 = new NewsTitle(2,"北京热门-故宫","xx1");
        NewsTitle title3 = new NewsTitle(3,"北京热门-颐和园","xx1");
        NewsTitle title4 = new NewsTitle(4,"北京热门-天安门","xx1");
        NewsTitle title5 = new NewsTitle(5,"北京热门-天坛","xx1");

        ArrayList list = new ArrayList();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(title4);
        list.add(title5);

        //获取新闻标题的总数
        // ArrayList size() 等同于 数组的length属性
        System.out.println("新闻标题共有"+list.size()+"条");

        // 逐条打印
        for (int i = 0; i < list.size(); i++) {
            NewsTitle obj = (NewsTitle) list.get(i); //等同于数组的 [i] 索引
            System.out.println(obj.getTitle());
        }
        System.out.println("=========");
        for (Object obj:list){
            NewsTitle news = (NewsTitle)obj;
            System.out.println(news.getTitle());
        }

        System.out.println("==========");
        list.remove(title2);
        System.out.println(list.contains(title2));
        // add() size() contains() remove() 是Collection接口的通用方法
        //常用的方法还有 clear() isEmpty() iterator() toArray()

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
