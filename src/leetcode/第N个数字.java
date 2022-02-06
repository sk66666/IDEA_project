package leetcode;
import java.util.Scanner;
import java.math.*;
public class 第N个数字 {
    //给你一个整数 n ，请你在无限的整数序列 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...] 中找出并返回第 n 位数字
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入要查找第几个数");
        int n = input.nextInt();
        System.out.println("第"+n+"个数为"+findNthDigit(n));
    }
    public static int findNthDigit(int n) {
//        int N = 1;
//        for (int x =N;((9*N-1)*Math.pow(10,N)+1)/9<n;N=x++);
//        double s =(int)Math.pow(10,N-1);
//        double z=n-((9*(N-1)-1)*s+1)/9;
//        int x=(int)(z/N)<=N*(int)(z/N)?(int)(z/N):(int)(z/N)-1;
//        int y=(int)(z%N);
//        if((int)z==1){
//            return 1;
//        }
//        s=Math.pow(10,N-1);
//        double t1=Math.pow(10,N-y+1);
//        double t2=Math.pow(10,N-y);
//        int a=y!=0?(int)((s+x)%t1/t2):(int)((s+x-1)%10);
//        return n>9?a:n;
        int len =1;
        while (len * 9 * Math.pow(10, len - 1) < n) {
            n -= len * 9 * Math.pow(10, len - 1);
            len++;
        }
        long s = (long) Math.pow(10, len - 1);
        long x = n / len - 1 + s;
        n -= (x - s + 1) * len;
        return n == 0 ? (int) (x % 10) : (int) ((x + 1) / Math.pow(10, len - n) % 10);

    }

}
