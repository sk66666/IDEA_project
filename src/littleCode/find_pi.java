package littleCode;

public class find_pi {
    public static void main(String[] args) {
        float Pi=0;
        float a=0,sum=1;
        for (float i = 3;i < 99;i+=2){
            a=-i;
            sum +=(1/a);
        }
            Pi=4*sum;
        System.out.println(Pi);


    }
}
