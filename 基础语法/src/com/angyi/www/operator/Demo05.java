package com.angyi.www.operator;

public class Demo05 {
    public static void main(String[] args) {
        // 与 或 非
        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println("a 与 b ： "+(c && b));
        System.out.println("a 或 b ："+(a || b));
        System.out.println("非 （a 与 b）： "+!(a && b));

        // 短路运算


    }
}
