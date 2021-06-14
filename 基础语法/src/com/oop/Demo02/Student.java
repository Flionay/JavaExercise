package com.oop.Demo02;

public class Student {
    //属性 字段
    String name;
    int age;

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }
}

/*
public class application {
    public static void main(String[] args) {
        //类是抽象的 需要实例化

        // student 是  Student的一个具体实例
        Student student = new Student();

        Student xiaoming = new Student();
        Student xiaohong = new Student();
        xiaoming.name = "小明";
        xiaoming.age = 18;

        System.out.println(xiaoming.name);
        System.out.println(xiaohong.name);
        xiaoming.study();

    }
}
 */