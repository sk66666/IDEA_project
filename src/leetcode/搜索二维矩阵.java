package leetcode;
//编写一个高效的算法来搜索?m?x?n?矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
//
//        每行的元素从左到右升序排列。
//        每列的元素从上到下升序排列。
//        ?
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/search-a-2d-matrix-ii
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class 搜索二维矩阵{
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m = 0;
        int n = matrix[0].length - 1;
        while (m < matrix.length && n >= 0) {
            if (matrix[m][n] == target) {
                return true;
            } else if (matrix[m][n] > target) {
                n--;
            } else {
                m++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]a={{1,4,7,11,15}, {2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int b = 23;
        if(searchMatrix(a,b)){
            System.out.println("find it");
        }else {
            System.out.println("can't find it ");
        }
    }
}
