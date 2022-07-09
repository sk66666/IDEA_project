package test;
import java.util.Scanner;
public class yi0zhimuowei {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入建立多大的数组");
        int count = input.nextInt();
        System.out.println("依次输入数");
        int[] a=new int[count];
        for(int i=0;i<count;i++){
            a[i]= input.nextInt();
        }
        int k=count;
        System.out.println("重排中");
        for(int i=0,j=0;i<k;){
            if(a[i]==0){
                k--;
                for(;j<k;){
                    a[j]=a[++j];
                    a[j]=0;
                }
                j=i;
            }else {
                j=++i;
            }
        }
        for (int i=0;i<count;i++){
            System.out.print(a[i]);
        }
    }
}
