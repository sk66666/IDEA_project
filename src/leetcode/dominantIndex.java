package leetcode;

public class dominantIndex {
    public int dominantIndex(int[] nums) {
        int max = 0, max_next = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max_next) {
                max_next = nums[i];
                if (max_next > max) {
                    index = i;
                    int temp = max;
                    max = max_next;
                    max_next = temp;
                }
            }
        }
        if (max_next == 0) {
            return index;
        }
        if (max / max_next >= 2) {
            return index;
        } else {
            return -1;
        }

    }
}
