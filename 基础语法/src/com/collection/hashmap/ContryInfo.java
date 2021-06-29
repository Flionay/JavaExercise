package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ContryInfo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("China","中国");
        map.put("USA","美国");
        map.put("Japan","日本");
        map.put("Italy","意大利");
        map.put("Koera","韩国");


        System.out.println(map.size());
        // 返回是object 需要一个强制类型转换
        String contry = (String) map.get("Italy");
        System.out.println(contry);

        System.out.println(map.keySet());
        System.out.println(map.containsKey("Australia"));
        if (map.containsKey("USA")) {
            map.remove("USA");
        }

        // 遍历一
        Set keyss = map.keySet();
        Iterator keys = keyss.iterator();
        while(keys.hasNext()){
            String value = (String) map.get(keys.next());
            System.out.println(value);
        }
        System.out.println("===================");
        //遍历二
        for (Object obj : keyss) {
            String value = (String) map.get(obj);
            System.out.println(value);
        }

        //遍历三
        System.out.println("=================");
        Set items = map.entrySet();
        for (Object obj : items) {
            // item是键值对 它属于Map.entry类型
            Map.Entry item = (Map.Entry) obj;
            System.out.println("("+item.getKey()+","+item.getValue()+")");
//            System.out.println(item.getValue());
        }


    }
}
