package com.angyi.www.array;

public class Demo01 {
    public static void main(String[] args) {
        //数组类型 变量名 = 变量的值
        //int[] nums; //定义
        int nums2[];

        int[] nums = new int[10]; //    可以存放10个int类型的数字 创建一个数组

        //给数组赋值
        nums[0] = 1;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 1;
        nums[6] = 1;
        nums[7] = 1;
        nums[8] = 1;
        nums[9] = 1;
        nums[1] = 1;

        for (int i = 0; i < nums.length; i++) {
            System.out.println( nums[i]);

        }


    }
}
