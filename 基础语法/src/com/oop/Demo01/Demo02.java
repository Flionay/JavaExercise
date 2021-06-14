package com.oop.Demo01;

public class Demo02 {
    //    静态方法  static 类存在就存在
    //    非静态方法  实例化才存在
    public static void main(String[] args) {
        Student li = new Student();
        li.say();
        Student.say2();
        Person person = new Person();
        System.out.println(person.name);
    }

}

class Person{
    String name;
}