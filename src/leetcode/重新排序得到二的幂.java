package leetcode;
import java.util.Arrays;
public class 重新排序得到二的幂 {
//    给定正整数 N?，我们按任何顺序（包括原始顺序）将数字重新排序，注意其前导数字不能为零。
//
//    如果我们可以通过上述方式得到?2 的幂，返回 true；否则，返回 false。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/reordered-power-of-2
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public static boolean reorderedPowerOf2(int n) {
        int []a=new int [10];
        int length=0;
        boolean value=false;
        //记录该数的长度同时录入每个数字出现次数。
        for(;n>0;n/=10){
            a[n%10]++;
            length++;
        }
        //依次从小到大制造一个2次幂的数
        for(int i=1,length1=1,count=10;length1<=length;i*=2){
            //判断该2次幂位数
            if(i>=count){
                length1++;
                count*=10;
            }
            //比较位数，若相等则比较数组
            if(length1==length){
                int []b=new int [10];
                //录入每个数出现次数
                for(int j=i;j>0;j/=10){
                    b[j%10]++;
                }
                value = Arrays.equals(a,b);
                if(value){
                    return value;
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(reorderedPowerOf2(16));
    }
}
