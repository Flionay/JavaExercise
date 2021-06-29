package com.api;

public class Student {
    public Genders sex;

    public static void main(String[] args) {
        Student stu = new Student();
        // 使用枚举保证了sex属性的正确赋值
        // 类型安全，易于属于和赋值
        stu.sex= Genders.女;
    }
}
