package offer.o66;

// 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。

public class Test {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        //B = {120,60,40,30,24}
        int[] b = Solution.constructArr(A);
        for (int i : b) {
            System.out.println(i);

        }
    }
}

class Solution{
    public static int[] constructArr(int[] a){
        //测试用例 有个[] 要注意
        if(a.length==0){
            return null;
        }

        int[] b = new int[a.length];
        b[0] = 1;
        int tmp = 1;
        for (int i = 1; i < b.length; i++) {
            b[i]  = a[i-1] * b[i-1];
        }

        for (int k=b.length-2; k>=0; k--){
            tmp = tmp*a[k+1];
            b[k] = b[k]*tmp;
        }
        return b;
    }
}