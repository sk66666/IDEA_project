package littleCode;

import java.util.Scanner;

public class 拆答案 {
    public static void main(String[] args) {
        String word = new String();
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        getAnser a = new getAnser(word);
        a.panduan();
 
    }

    static class getAnser {
        String words = new String();
        int a[] = new int[27];

        getAnser(String word) {
            words = word;
        }

        void panduan() {
            int ci = 0;

            for (int i = 0; i < words.length(); i++) {
                ci = words.charAt(i) - 96;
                a[ci]++;
            }
            int maxn = 1;
            int minn = 99999;
            for (int i = 1; i < 27; i++) {
                if (a[i] != 0) {
                    if (maxn < a[i]) maxn = a[i];
                    if (minn > a[i]) minn = a[i];
                }
            }
            if (zhishu(maxn - minn)) {
                System.out.println("Lucky Word");
                System.out.println(maxn - minn);
            } else {
                System.out.println("No Answer");
                System.out.println(0);
            }
        }

        boolean zhishu(int a) {
            if (a == 0 || a == 1) return false;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        }

    }

}
