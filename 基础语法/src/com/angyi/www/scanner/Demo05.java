package com.angyi.www.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        // 输入多个数字 求和 平均  没输入一个数用回车确认 通过输入非数字来打断 输出结果

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double len = 0;
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            sum = sum+x;
            len++;
        }
        System.out.println(sum);
        System.out.println(len);
        System.out.println(sum/len);
        scanner.close();
    }
}
