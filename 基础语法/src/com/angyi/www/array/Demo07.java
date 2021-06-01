package com.angyi.www.array;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {

    }

    //冒泡排序
    //比较数组中相邻的两个元素 如果第一个比第二个大 就交换2位置
    // 每一次比较 产生一个最大或者最小
    // 下一轮少一次排序

    public static int[] mao_sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]>nums[i]){
                    nums[i] = nums[j];
                }

            }
        }
        return nums;
    }
}
