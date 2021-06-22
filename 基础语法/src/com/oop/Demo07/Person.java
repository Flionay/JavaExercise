package com.oop.Demo07;

public class Person {
    {
        System.out.println("匿名代码块");

    }

    static {
        System.out.println("static code block"); //永久只执行一次

    }

    public Person(){
        System.out.println("init");
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("=======");
        Person t = new Person();
    }
}
