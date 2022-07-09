package littleCode;
import java.util.Random;
import java.util.Scanner;
public class zhitouzi {


    public static void main(String[] args) {

        //掷骰子
        System.out.println("你将与电脑进行投骰子比拼,规则如下: \n " +
                "(上限99局，每一局你输入随机字符即投出一个筛子。)\n");
        int computer_point = 0,user_point = 0;                      //一个变量存储双方点数
        int computer_score = 0,user_score = 0;                        //初始得分
        Random rand = new Random();                                 //随机种子
        Scanner star = new Scanner(System.in);

        for (int i = 1; (computer_score < 6 && user_score < 6) &&i!=100; i++){
            //回合开始,用户先手
            String cishu =  Huiheshu(i);
            System.out.println("第" + cishu + "个回合\n");
            System.out.println("请掷骰子\n");
            int a =star.nextInt();
            user_point = rand.nextInt(6)+1;                     //随机投掷
            computer_point = rand.nextInt(6)+1;
            System.out.println("你的点数是" + user_point + "而计算机点数为" + computer_point );
            String daxiao = compare(user_point,computer_point);
            System.out.println(user_point+daxiao+computer_point+"\n");      //输出比较
            if(user_point>computer_point){
                user_score++;
                System.out.println("你赢得一分("+user_score+":"+computer_score+")\n");

            }else if(user_point==computer_point) {
                System.out.println("平局不加分");
            }else {
                computer_score++;
                System.out.println("计算机赢得一分("+user_score+":"+computer_score+")\n");
            }

        }


        //比赛结束
        if(user_score>computer_score){
            System.out.println("woo!!("+user_score+":"+computer_score+")\nyou are really cool ,you win!!!");
        }else {
            System.out.println("sorry!!("+user_score+":"+computer_score+")\nyou are loser.");
        }

    }

    public static String  Huiheshu(int i){
        String word[] = new String[]{"零","一","二","三","四","五","六","七","八","九","十"};
        int a = i / 10;
        int b = i % 10;
        if(i<=10) {
            return word[i];
        }else if(i>10&&i<20){
            String word_2 =word[10] + word [b];
            return word_2;
        }else{
            if(b==0){
                String word_2 = word[a] + word[10];
                return word_2;
            }else{
                String word_2 = word[a] + word[10] + word [b];
                return word_2;
            }
        }
    }

    public static String compare(int a,int b){
        String c[]= new String[]{">","<","="};
        int d=0;
        if(a>b){
        }else if (a<b){
            d=1;
        }else{
            d=2;
        }
        return c[d];

    }
}
