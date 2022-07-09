package leetcode;
import java.util.Scanner;
public class nthUglyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(NthUglyNumber(n));
    }

    public static int   NthUglyNumber(int n){
        //查找第n个丑数
        //丑数 就是只包含质因数 2、3 和/或 5 的正整数。
        //[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] 是由前 10 个丑数组成的序列。
        int[] all=new int[200000];
        all[1] = 1;
        all[2] = 2;
        all[3] = 3;
        all[4] = 4;
        all[5] = 5;
        int count = 5;//记录有几个丑数
        boolean first = n<count?false:true;
        int x,y,j=0;
        while (count!=n&&first){
            for (int z=count;;z--){

            }
        }





        return all[n];
    }

}
