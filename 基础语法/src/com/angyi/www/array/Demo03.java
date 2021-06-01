package com.angyi.www.array;

public class Demo03 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,};

        // 增强for循环
        for (int i : array) {
            System.out.println(i);
        }

        // sum
        System.out.println(sum_array(array));
        //find-max
        System.out.println(find_max(array));
        // reverse
        for (int i:reverse(array)){
            System.out.println(i);
        }
    }


    public static int sum_array(int[] nums){
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int find_max(int[] nums){
        int init_a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>init_a){
                init_a=nums[i];
            }
        }
        return init_a;
    }

    public static int[] reverse(int[] nums){
        int res[] = new int[nums.length];
        int j = 0;
        for (int i = nums.length-1; i >= 0; i--) {
             res[j] = nums[i];
//             System.out.println(nums[i]);
             j = j+1;
        }
        return res;
    }
}
