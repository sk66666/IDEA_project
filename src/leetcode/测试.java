package leetcode;

public class 测试 {
    public static void main(String[] args) {

        int persons[]=new int[]{0, 1,  1,  0,  0,  1,  0};
        int times[]=new int[]  {0, 5, 10, 15, 20, 25, 30};
        TopVotedCandidate topVotedCandidate = new TopVotedCandidate(persons,times);
        System.out.print(topVotedCandidate.q(3));
        System.out.print(topVotedCandidate.q(12));
        System.out.print(topVotedCandidate.q(25));
        System.out.print(topVotedCandidate.q(15));
        System.out.print(topVotedCandidate.q(24));
        System.out.print(topVotedCandidate.q(8));



    }
}
