package com.angyi.www.operator; //package 必须在最上面
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) {
        // 关系型运算符返回的结果  正确 错误 布尔值

        int a =10;
        int b = 12;
        int c = 20;
        System.out.println(a>b);
        System.out.println(a!=b);
        System.out.println(c%b); //取余  模运算
        Date dates = new Date();
    }
}
