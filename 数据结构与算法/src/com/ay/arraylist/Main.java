package com.ay.arraylist;

public class Main {
    public static void main(String[] args) {
        Main.test2();
    }

    // 测试person对象 添加到数组
    public static void test2(){
        Person xiaoming = new Person("xiaoming",14);
        Person xiaohong = new Person("xiaohong",30);
//        Person xiaohong = new Person("xiaohong",30);

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(xiaoming);
        arrayList.add(xiaohong);
        arrayList.add(xiaohong);
        arrayList.add(xiaohong);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
        //提醒jvm去做垃圾回收
        System.gc();
    }

    public static void test1(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(10);
        arrayList.add(200);
        arrayList.add(300);

        for (int i=0;i<30;i++){
            arrayList.add(i);
        }

        System.out.println(arrayList);


    }
}
