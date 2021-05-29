package com.angyi.www.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        int sum = 0;
        int sumd = 0;
        for(int i =0;i<=100;i++){
            if (i % 2 != 0){

                sum = sum+i;

            }else{
                sumd = sumd+i;
            }
        }
        System.out.println("奇数和："+sum);
        System.out.println("偶数和："+sumd);

    }
}
