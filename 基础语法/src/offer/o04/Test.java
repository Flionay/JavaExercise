package offer.o04;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class Test {
    public static void main(String[] args) {
//        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,15,22},{10,13,14,15,24},{18,21,23,26,30}};
//        System.out.println(Solution.test1(matrix,15));
//        System.out.println(matrix.length);
//        System.out.println(matrix.length);
        int[][] matrix2 = {{-5,1}};
        System.out.println(Solution.findNumberIn2DArray(matrix2,0));
    }
}

class Solution {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if  (matrix.length ==0){
            return false;
        }else if (matrix[0].length==0){
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int j=0,i=row-1;
        while (i>=0 && j<col){
            if (target<matrix[i][j]){       //  目标太小 往上边寻找
                i--;
            }else if(target>matrix[i][j]){  //  目标太大 往右边寻找
                j++;
            }else{
                return true;
            }

        }
        return false;
    }
}


//行和列一定要弄对