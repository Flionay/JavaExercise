package com.angyi.www.struct;

public class TrigDemo {
    public static void main(String[] args) {
        //打印五行三角形
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
