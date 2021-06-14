package com.oop.Demo04;

public class Student {
    private String name;
    private int id;
    private char sex;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //提供一些可以操作这个属性的方法
    // 提供一些public的set 、get方法

    //get 获取这个数据
    public String getName(){
        return this.name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setName(String name){
        this.name = name;
    }
}
