package leetcode;

public class 数组嵌套{

//    输入: A = [5,4,0,3,1,6,2]
//    输出: 4
//    解释:
//    A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/array-nesting
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

    public static int  arrayNesting(int[] nums) {
        int end=0;
        boolean []a=new boolean[nums.length];
        for (int i=0,j=0;i<nums.length;i=++j){
            int count=1;
            j=i;
            while (!a[nums[i]]){
                a[i]=true;
                i=nums[i];
                if(i==nums[i]){
                    count--;
                }
                count++;
            }
            if (count>end){
                end=count;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int [] a={5,4,0,3,1,6,2};
        arrayNesting(a);
        System.out.println(arrayNesting(a));
    }


}
