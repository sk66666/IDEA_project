package test;
import java.util.Scanner;
public class duichen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String a= input.nextLine();

        if(Duichen(a)){
            System.out.println("该字符串对称");
        }else {
            System.out.println("该字符串不对称");

        }
    }
    static boolean  Duichen(String a){
        int i=1,j=a.length()/2,k=a.length();
        boolean b=true;
        for(;i<=j&&b;i++,k--) {
            b= a.charAt(i - 1) == a.charAt(k - 1);
        }
        return b;
    }
}
