package leetcode;

public class increasingTriplet {
    //    给你一个整数数组 nums ，判断这个数组中是否存在长度为 3 的递增子序列。
    //    如果存在这样的三元组下标 (i, j, k) 且满足 i < j < k ，使得 nums[i] < nums[j] < nums[k] ，返回 true ；否则，返回 false 。
    public boolean increasingTriplet(int[] nums) {
        int min = 9999, mid = 9999;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
            } else if (nums[i] <= mid) {
                mid = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}
