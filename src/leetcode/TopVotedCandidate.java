package leetcode;

public class TopVotedCandidate {
    private int person[] = new int[5003];
    private int ci[][] = new int[5003][2];
    private int number = 1;

    //0指time，1指persons;
    public TopVotedCandidate(int[] persons, int[] times) {
        int max_person = persons[0];
        //第一票的人假设为最大票数
        for (int i = 0; i < persons.length; i++) {
            //编号为persons[i]的人票数增加
            person[persons[i]]++;
            //第number个时候，时间为time【1】；
            ci[number][0] = times[i];
            //找出time[i]时刻最大票数人
            if (person[max_person] <= person[persons[i]]) {
                max_person = persons[i];
            }
            ci[number++][1] = max_person;
        }
        number--;

    }

    public int q(int t) {
        if (t >= ci[number][0]) return ci[number][1];
        int left = 0;
        int right = number;
        while (left < right) {
            int mid = (left + right) / 2;
            if (t == ci[mid][0]) {
                return ci[mid][1];
            } else if (t < ci[mid][0]) {
                right = mid;
            } else if (t > ci[mid][0]) {
                left = mid + 1;
            }
        }
        return ci[left - 1][1];

    }
}

