package test;
import java.util.Scanner;
public class paichongfu {
    public static void main(String[] args) {
        int c=9999;
        System.out.println("创建一个几位数的数组");
        Scanner input = new Scanner(System.in);
        int  count = input.nextInt();
        System.out.println("依次输入内容");
        int[] a =new int[count];
        for(int i=0;i<count;i++){
            a[i]= input.nextInt();
        }
        System.out.println("进行重排中");
        for (int i=0,j=0;j<count;){
            j++;
            if(a[i]==a[j]){
                a[j]=c;
                count--;
                for(;j<count;){
                    a[j]=a[++j];
                    a[j]=c;
                }

            }else {
                i++;
            }
            j=i;
        }
        for (int i=0;i<count;){
            System.out.print(a[i++]);
        }

    }
}
