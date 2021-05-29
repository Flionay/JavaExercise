package com.angyi.www.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t"); //println 输出完会换行

            }
            if (i%(5*3)==0){
                System.out.print("\n");
            }
        }
    }
}
