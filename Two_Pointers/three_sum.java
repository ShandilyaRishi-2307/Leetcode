package Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class three_sum {
    public List<List<Integer>> threeSum(int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            int target = -1*nums[i];
            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum>target){
                    right--;
                }
                else if(sum == target){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else{
                    left++;

                }
            }
        }

        return result;
    }
}