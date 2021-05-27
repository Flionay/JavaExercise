package com.angyi.www.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextline方法接收：");

        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("接收到的数据为："+str);
        }

        scanner.close();
    }
}
