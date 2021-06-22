package com.oop.demo05;

public class Person {
    int age;
    String sex;
    String name;

    public Person(){
        this.age = 12;
        this.sex = "NULL";
        System.out.println("Person 初始化");
    }

    public Person(String name){
        System.out.println("Person 有参数初始化"+name);
    }
}
