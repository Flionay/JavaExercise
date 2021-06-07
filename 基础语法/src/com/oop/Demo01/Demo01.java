package com.oop.Demo01;

public class Demo01 {
    public static void main(String[] args) {
        sayHello();
        resayHello();
    }
    /*
    修饰符 返回值类型 方法名（...){
        //方法体
         return 返回值；
    }
     */
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String resayHello(){
        return "Hello";
    }

    public static int myMax(int a,int b){
        return a>b? a :b;
    }

}
