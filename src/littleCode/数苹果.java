package littleCode;

import java.util.Scanner;

public class 数苹果 {
    public static void main(String[] args) {
        int N = 0;
        int M = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
         
        int li = 0;
        int ri = 0;
        int c = 0;
        int[] ci = new int[N + 1];
        for (int j = 1; j <= M; j++) {
            li = sc.nextInt();
            ri = sc.nextInt();
            c = sc.nextInt();
            for (int i = li; i <= ri; i++) {
                ci[i] += c;
            }
        }
        for (int i = 1; i < ci.length; i++) {
            System.out.print(ci[i] + " ");
        }

    }


}
