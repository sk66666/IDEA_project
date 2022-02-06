package littleCode;
import java.util.Scanner;
public class cjw {

        /**
         * 需求：输入年份与月份，将打印出当月日历
         *
         * 实现：
         * 		1.两次输入，Scanner实现，并定义变量(year,month,day)，且对应赋值
         * 		2.if判断year是否为闰年，并由闰年结果确定2月的天数，使用了switch实现了对应月份的天数
         * 		3.根据元年1月1号为星期一，由此推断之后具体年月份的一号为星期几
         * 		4.定义了一个输出方法，首先输出对应格式的星期一到日，最核心的是要确定具体年月份距离元年一月一号多少天，
         * 		    先根据年份差距计算出祖略的天数，然后根据月份再精细计算，主要是有平闰年的天数差距，这时候定义了两个
         * 		    变量(j,k)来控制平闰年的差距，最后总天数对7取余，剩下的数就是星期数
         * 		5.最后进行格式控制，\t和空格来实现，一号对应的空格数由循环空格加\t来补充
         * @author xiaochen
         * @param year
         * @param month
         * @param day
         */

        public static void output(int year,int month,int day) { 	//定义输出方法
            month=1;
            for (;month<=12;month++) {
                System.out.println("日\t一\t二\t三\t四\t五\t六");        //格式输出
                int arr[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};    //定义月份数组，便与输出
                if (year >= 1)                                                //借助变量j,k来实现天数统计
                {
                    int j = 0, k = 0;
                    for (int i = 1; i < year; i++) {
                        if ((i % 4 == 0) && !(i % 100 == 0) || (i % 400 == 0))
                            j++;
                        else
                            k++;
                    }
                    int temp = 1;                                            //定义中间变量来保证元年第一天为星期一
                    if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))
                        arr[2] = 29;                                        //闰年更改二月天数
                    if (month >= 1)                                        //统计月份间的天数差
                    {
                        for (int l = 1; l < month; l++)
                            temp += arr[l];
                    }
                    int days;
                    days = 366 * j + 365 * k + temp;                                //days存储总天数
                    int a;
                    a = days % 7;                                            //得出的星期数由a存储
                    for (int i = 0; i < a; i++) {                                //格式控制
                        System.out.print(" \t");
                    }
                    for (int n = 1; n <= day; n++)                                //具体日历输出，7天一换行
                    {
                        System.out.print(n + "\t");
                        if ((a + n) % 7 == 0)
                            System.out.println("\n");
                    }
                    System.out.println();
                }
            }
        }

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            System.out.println("Please enter the year:");					//提示输入信息
            int year =input.nextInt();
            System.out.println("Please enter the month:");
            int month =input.nextInt();										//输入的信息由year和month存储
            int day=0;
            boolean True=false;												//由True来判断是否为闰年
            if((year%4==0) && !(year%100==0) || (year%400==0)) {
                System.out.println(year+"年是闰年。");
                True=true;}
            else
                System.out.println(year+"年不是闰年。");
            System.out.println("公元1年1月1日是星期一");						//友情提示
            switch (month) {												//月数对应天数的赋值
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day=31;
                    break;
                case 2:
                    if(True)
                        day=29;
                    else
                        day=28;
                    break;
                default:
                    day=30;
                    break;
            }
            System.out.println("当月有"+day+"天");							//提示信息
            output(year, month,day);										//方法调用，进行日历输出
        }
    }
