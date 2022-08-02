package test;

import leetcode.Solution;

import java.util.Random;

public class 测试 {
    public static void main(String[] args) {
        Solution test =new Solution();
        int a[]=new int[]{0,0};
        int b[]=new int[]{1,1};
        int c[]=new int[]{1,0};
        int d[]=new int[]{0,1};
        System.out.println(test.validSquare(a, b, c, d));


//        int arr[] = new int[]{37,12,28,9,100,56,80,5,12};
//        System.out.println(test.fractionAddition("8/3+1/1-8/3"));
//        test.arrayRankTransform(arr);
    }

}
