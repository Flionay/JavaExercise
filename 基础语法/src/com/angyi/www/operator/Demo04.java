package com.angyi.www.operator;

public class Demo04 {
    public static void main(String[] args) {
        // 自增 自减 一元运算符
        int a = 3;
        System.out.println(a);
        int b = a++;
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算 2^3
        // 很多运算使用一些工具类来操作

        double x = Math.pow(2,3);
        System.out.println(x);
    }
}
