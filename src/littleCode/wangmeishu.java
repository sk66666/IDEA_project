package littleCode;
import java.util.Scanner;
public class wangmeishu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int a = 1;a<=1000;a++) {
            int sum = 0;
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    sum += i;
                }
            }
            if (sum == a) {
                System.out.println("完美数:"+a);
                for (int i = 1; i < a; i++) {
                    if (a % i == 0) {
                        sum += i;
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
