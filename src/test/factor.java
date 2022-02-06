package test;
import java.util.ArrayList;
import java.util.Scanner;
public class factor {
    //因子
     static void way(int x){
         ArrayList a = new ArrayList();
         for(int b = 1; b <= x / 2; b++) {
             if (x % b == 0) {
                 a.add(b);
             }
         }
         a.add(x);
         for(int i=0;i< a.size();i++){
             int b= (int) a.get(i);
             System.out.print(b+" ");
         }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a;
        a=input.nextInt();
        way(a);
    }
}
