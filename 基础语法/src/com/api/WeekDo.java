package com.api;

public class WeekDo {
    //根据输入星期几，输出做什么事
    public void doWhat(int day){
        if(day>7 || day<1){
            System.out.println("输入参数必须在1-7");
            return;
        }
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日，请努力工作");
                break;
            case 6:
                System.out.println("今天周六");
                break;
            case 7:
                System.out.println("今天周日");
                break;
        }
    }

    // 使用枚举
    public void doWhat2(Week day){
        switch (day){
            case MON:
            case TUE:
            case WES:
            case THU:
            case FRI:
                System.out.println("工作日，请努力工作");
                break;
            case SAT:
                System.out.println("今天周六");
                break;
            case SUN:
                System.out.println("今天周日");
                break;
        }
    }

    public static void main(String[] args) {
        WeekDo wd = new WeekDo();
        wd.doWhat(8);
        wd.doWhat2(Week.SUN);
    }


}
