package com.angyi.www.method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1,3,4,5);
    }

    public void test(int... i){
        System.out.println(i);
    }
}
