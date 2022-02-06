package littleCode;
import java.util.Scanner;
public class calendar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max_day ;        //某个月最大值
        int week = 0 ;           //星期几差值
        int count;    //记录星期几
        boolean week_week=false; //每个月对准1号星期几

        System.out.println("please enter the year you want find");
        int x=input.nextInt();
        while (x>9999||x<1){
            System.out.println("you input null");
            x=input.nextInt();
        };


        count = More_Day(x);


        System.out.println("Did you want to find only one month in this year(1/0)");
        int y=input.nextInt();
        while (y!=0&&y!=1){
            System.out.println("you input null");
            y=input.nextInt();
        }
        boolean single = y == 1;

        int z =0;
        if(single){
            System.out.println("请输入你要查询的月份");
            z = input.nextInt();
        }

        // 输出这一年的日历;
        for(int month=1;month<=12;month++){
            boolean title = true;
            max_day = Month_Max_Day(x,month);
            for(int day=1;day<=max_day;day++){
                //输出日历
                if(title){
                        //每个月的标题，星期几
                    if(single){
                        if(z == month){
                            System.out.println("                     "+ Big_Number(month)+"月份日历");
                            System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
                        }
                    }else {
                        System.out.println("                     "+ Big_Number(month)+"月份日历");
                        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
                    }

                    title = false;
                }
                if (!week_week){
                    //日和星期调整一致
                    while (week!=count){
                            week++;
                            if(single){
                                if(z == month){
                                    System.out.print("    \t");
                                }
                            }else {
                                System.out.print("    \t");
                            }

                    }
                    week_week = true;
                }
                if(single){
                    if(z == month){
                        System.out.print(day+"   \t");//输出日子
                    }
                }else {
                    System.out.print(day+"   \t");//输出日子
                }

                count++;
                if(count==7){
                    //判断是否过了一个星期
                    count=0;
                    if(single){
                        if(z == month){
                            System.out.println("\n");
                        }
                    }else {
                        System.out.println("\n");
                    }

                }
                if(day==max_day){
                    //判断一个新月份的日历
                    week = 0;
                    title = true;
                    week_week = false;
                    if(single){
                        if(z == month){
                            System.out.println("\n");
                        }
                    }else {
                        System.out.println("\n");
                    }
                }
            }
            if (month==z){
                month=13;
            }
        }
    }

    public static int Month_Max_Day(int x, int y){
        //记录某年某月多少天
        if(y==1||y==3||y==5||y==7||y==8||y==10||y==12){
            return 31;
        }else if (y==2){
           if(What_year(x)){
               return 29;
           }else {
               return 28;
           }
        }else {
            return 30;
        }
    }

    public static boolean What_year(int x){
        //判断是否为闰年
        return x % 400 == 0 || x % 4 == 0 && x % 100 != 0;
    }



    public static String Big_Number(int i){
        String[] word = new String[]{"零","一","二","三","四","五","六","七","八","九","十"};
        int a = i / 10;
        int b = i % 10;
        if(i<=10) {
            return word[i];
        }else if(i<20){
            return word[10] + word [b];
        }else{
            if(b==0){
                return word[a] + word[10];
            }else{
                return word[a] + word[10] + word [b];
            }
        }
    }
    public static int More_Day(int x){
        //输入年份
        int count=1;
        int c = x;
        for(;x>1900;x--){
            if (What_year(x)){
                count+=1;
                if(count==7){
                    count=0;
                }
                count+=1;
            }else {
                count+=1;
            }
            if(count==7){
                count=0;
            }
        }
        for(;x<1900;x++){
            if (What_year(x)){
                count-=1;
                if(count==-7){
                    count=0;
                }
                count-=1;
            }else {
                count-=1;
            }
            if(count==-7){
                count=0;
            }
        }
        if(c>1900){
            return count;
        }else {
            return -count;
        }
    }


}


