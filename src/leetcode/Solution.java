package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
        public int largestComponentSize(int[] nums) {
            int m = Arrays.stream(nums).max().getAsInt();
            UnionFind uf = new UnionFind(m + 1);
            for (int num : nums) {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        uf.union(num, i);
                        uf.union(num, num / i);
                    }
                }
            }
            int[] counts = new int[m + 1];
            int ans = 0;
            for (int num : nums) {
                int root = uf.find(num);
                counts[root]++;
                ans = Math.max(ans, counts[root]);
            }
            return ans;
        }


    class UnionFind {
        int[] parent;
        int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            rank = new int[n];
        }

        public void union(int x, int y) {
            int rootx = find(x);
            int rooty = find(y);
            if (rootx != rooty) {
                if (rank[rootx] > rank[rooty]) {
                    parent[rooty] = rootx;
                } else if (rank[rootx] < rank[rooty]) {
                    parent[rootx] = rooty;
                } else {
                    parent[rooty] = rootx;
                    rank[rootx]++;
                }
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
    }




    //有效正方形
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        //优先列出所有点之间连线，判断最长两条是否相等以及剩下四条是否相等
        double edges[]=new double[6];
        int p[][] = new int[4][2];
        p[0][0]=p1[0];
        p[0][1]=p1[1];
        p[1][0]=p2[0];
        p[1][1]=p2[1];
        p[2][0]=p3[0];
        p[2][1]=p3[1];
        p[3][0]=p4[0];
        p[3][1]=p4[1];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                edges[index++]=Math.pow(  (  Math.pow(p[i][0]-p[j][0],2)+Math.pow(p[i][1]-p[j][1],2)  ) , 0.5 );
            }
        }
        Arrays.sort(edges);
        if(edges[0]!=0&&edges[0]==edges[3]&&edges[4]==edges[5])return true;


        return false;
    }

    public int[] arrayRankTransform(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Map<Integer, Integer> rank = new HashMap<>();
        Arrays.sort(arrCopy);
        for (int num : arrCopy) {
            rank.putIfAbsent(num, rank.size() + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }
        return arr;

    }
    public String fractionAddition(String expression) {
        String result ="hello";
        //定义一个分数，0表示分子，1表示分母
        int number[][]=new int[2][2];
        final char  molecule = 0;
        final char  denominator = 1;

        for(int i = 0 ;i<expression.length(); ){
            //定义一个index判断第一个数是否存在
            int index = 0;
            if(number[0][denominator]!=0)index=1;
            //定义符号 0为正
            boolean sign =false;
            if(expression.charAt(i)=='-'){
                sign=true;
                i++;
            }else if(expression.charAt(i)=='+'){
                sign=false;
                i++;
            }
            //读取分子
            while(expression.charAt(i)!='/'){
                if(number[index][molecule]!=0)number[index][molecule]*=10;
                number[index][molecule]+=(expression.charAt(i++)-'0');
            }
            i++;
            //读取分母
            while(expression.charAt(i)>='0'&expression.charAt(i)<='9'){
                if(number[index][denominator]!=0)number[index][denominator]*=10;
                number[index][denominator]+=(expression.charAt(i++)-'0');
                if(i==expression.length()){
                    break;
                }
            }
            if(sign)number[index][molecule]*=-1;
            if(index != 0){
                if(number[0][denominator]==number[1][denominator]){
                    number[0][molecule]+=number[1][molecule];
                }else {
                    number[0][molecule]
                            =     number[0][molecule] * number[1][denominator]
                                + number[1][molecule] * number[0][denominator];
                    number[0][denominator]*=number[1][denominator];
                }
                number[1][molecule]=0;
                number[1][denominator]=0;
                if(number[0][molecule]==0){
                    number[0][denominator]=1;
                }else {
                    int a = Math.abs(number[0][molecule]);
                    int b = number[0][denominator];
                    while (a !=0){
                        if(a>=b){
                            a=a%b;
                        }else {
                            int temp = a;
                            a = b;
                            b = temp;
                        }
                    }
                    number[0][molecule]/=b;
                    number[0][denominator]/=b;
                }
            }

        }
        result = Integer.toString(number[0][molecule])+'/'+Integer.toString(number[0][denominator]);


        return result;
    }
}
