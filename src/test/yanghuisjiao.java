package test;

public class yanghuisjiao {
    //杨辉三角
    public static void main(String[] args) {
        int [][]a=new int [10][10];
        for(int i = 1;i <= 10;i++){
            for(int j = 1;j <= i;j++){
                if(i==j||j==1){
                    a[i-1][j-1]=1;
                }else {
                    a[i-1][j-1]=a[i-2][j-2]+a[i-2][j-1];
                }
                System.out.print(a[i-1][j-1]+"\t");
            }
            System.out.println();
        }
    }
}
