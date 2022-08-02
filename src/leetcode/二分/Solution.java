package leetcode.二分;

public class Solution {





    public int guessNumber(int n) {
        return erfen(0,n);
    }
    public int erfen(int left,int right){
        int mid = (left+right)/2;
//        int temp = guess(mid);
        if(temp==0){
            return mid;
        }else if(temp==-1){
            return erfen(mid,right);
        }else {
            return erfen(left,mid);
        }
    }








    public int search(int[] nums, int target) {
        return twoSide(nums,0,nums.length,target);
    }
    public int twoSide(int [] nums,int left,int right,int target){
        int mid = (left+right)/2;
        if(nums[mid]==target){
            return mid;
        }else if((right-left)==1){
            return -1;
        }else if(nums[mid]<target){
            return twoSide(nums,mid,right,target);
        }else {
            return twoSide(nums,left,mid,target);

        }
    }
}
