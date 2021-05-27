package com.angyi.www.struct;

import java.util.Scanner;

public class SwitchDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();

        //case 穿透
        // JDK7  表达式可以是字符串

        //反编译  java-> class (字节码文件) --> 反编译（IDEA）

        switch (grade){
            case "A":
                System.out.println("优秀");
                break;
            case "B":
                System.out.println("良好");
                break;
            case "C":
                System.out.println("及格");
                break;
            default:
                System.out.println("未知");


        }
        scanner.close();
    }
}
