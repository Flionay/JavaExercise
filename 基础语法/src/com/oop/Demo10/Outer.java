package com.oop.Demo10;

public class Outer {
    private static int id;
    public void out(){
        System.out.println("这是外部类的方法");
    }
    static class Inner{
        public void in(){
            System.out.println("这是内部类");
        }
        public void getID(){
            System.out.println(id);
        }
    }
}
