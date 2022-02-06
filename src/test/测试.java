package test;

import java.util.Random;

public class 测试 {
    public static void main(String[] args) {
//        栈 a=new 栈();
//        a.push(2);
//        System.out.println(a.pop());
        mySet a=new mySet();
        String table[]={"张良","李白","露娜","橘右京","李元芳","钟馗","刘禅","元哥","马超","嬴政"};
        Random randomNumber_1=new Random();
        int count=0;
        while (a.getsize()<3) {
            int randomNumber =randomNumber_1.nextInt(table.length);
            count++;
            a.add(table[randomNumber]);
        }
        System.out.println("经过"+count+"次后得出");
        System.out.println("热门英雄排行榜");
        a.printSet();
    }
}
