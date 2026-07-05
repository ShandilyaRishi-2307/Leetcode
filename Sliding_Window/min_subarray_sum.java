package Sliding_Window;

public class min_subarray_sum {
    public int minSubarraySum(int target,int nums[]){
        int left =0,right=0;
        int winSum=0;
        int minimum = Integer.MAX_VALUE;
        for(right=0;right<nums.length;right++){
            winSum+=nums[right];
            while(winSum>=target){
                minimum = Math.min(minimum,right-left+1);
                winSum = winSum-nums[left];
                left++;
            }
        }
        return minimum == Integer.MAX_VALUE?0:minimum;
    }
}
