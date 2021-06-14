package com.oop.Demo02;

import java.security.spec.RSAOtherPrimeInfo;

// 一个项目应该只存在一个main方法
public class application {
    public static void main(String[] args) {
        //类是抽象的 需要实例化
        Person x = new Person();
        System.out.println(x.name);
        Person y= new Person("y");
        System.out.println(y.name);
    }
}
