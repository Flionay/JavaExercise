package offer.o03;
// 03 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

import java.util.Arrays;

/**
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

 public class Test {
    public static void main(String[] args) {
        int[] n = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(Solution.test2(n));
//        System.out.println(Solution.findRepeatNumber(n));
    }
}

class Solution{
     //   原地置换法，因为所有的数字都是在0-n-1的，所以我们吧这些数字放到对应的坑位中，如果坑中有值，那么就返回该值
    public static int findOne(int[] n){
        int t= 0;
        for(int i=0;i<n.length;i++){

            if(n[i]!=i){
                t = n[n[i]];
                n[n[i]] = n[i];
                if (n[i]==t){
                    return t;
                }else{
                    n[i] = t;

                }
            }else{
                continue;

            }
            System.out.println(Arrays.toString(n));
        }
        return -1;
    }

    public static int test2(int[] n){
        int i = 0;
        while(i<n.length){
            if(n[i]==i){
                i++;
                continue;
            }
            // 如果这个地方的数字 == 换来的数字
            if(n[n[i]]==n[i]){
                return n[i];
            }
            // 此位置的数字该去哪里 与那个数字交换
            int temp = n[n[i]]; //先把该去的位置腾出来
            n[n[i]] = n[i];
            n[i] = temp;
        }
        return -1;
    }

    public static int findRepeatNumber(int[] nums) {
        int i = 0 ;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

}
