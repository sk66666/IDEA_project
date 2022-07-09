package leetcode;
import java.util.Scanner;
public class isAnagram {
    public static void main(String[] args) {
        //有效的字母异位词
//        给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//        注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
//        1 <= s.length, t.length <= 5 * 10^4
//        s 和 t 仅包含小写字母
        Scanner input = new Scanner(System.in);
        String a,b;
        a = input.next();
        b = input.next();
        IsAnagram(a,b);
    }


    public static void IsAnagram(String s, String t){
        char[] a=s.toCharArray();

    }
}
