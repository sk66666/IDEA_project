package leetcode;

import java.util.ArrayList;
import java.util.List;

public class kSmallestPairs {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        temp.add(nums1[0]);
        temp.add(nums2[0]);
        for (int i = 0; i < nums1.length && k != 1; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] + nums2[j] < nums1[i]) {

                }
            }
            k--;
        }

        return myList;
    }

}
