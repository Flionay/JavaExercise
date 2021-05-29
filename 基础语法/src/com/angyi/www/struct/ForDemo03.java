package com.angyi.www.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                String info = "%d * %d = %d \t";
                if (i>=j){
                    System.out.printf(info,i,j,i*j);
                }

            }
            System.out.print("\n");

        }
    }
}
