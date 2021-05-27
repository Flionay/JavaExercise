package com.angyi.www.base;

public class Demo08 {
    // 属性
    // 实例变量  从属于对象
    String name;

    // 类变量
    static double salary = 2400;

    int age;
    // 除了基本类型 其余的都是null
    // 布尔值默认是false
    // 数字类型 是 0 活着 0.0
    // main 方法
    public static void main(String[] args) {
        //局部变量 必须声明 和 初始化值
        int i = 10;
        System.out.println(i);

        //变量类型 变量名字 = new com.angyi.www.base.Demo08()
        Demo08 Demo08 = new Demo08();
        System.out.println(Demo08.age);
        System.out.println(Demo08.name);
        System.out.println(Demo08.salary);


    }

    // 其他方法
    public void add(){

    }
}
