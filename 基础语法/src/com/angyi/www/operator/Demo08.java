package com.angyi.www.operator;

public class Demo08 {
    public static void main(String[] args) {
        // 三元运算符
        // x?y:z
        // x为真 结果为y 否则为 z
        int score = 80;
        String student = score > 90 ? "优秀":"良好"; //必须掌握
        // if
        System.out.println(student);
    }
}
