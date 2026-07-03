package Two_Pointers;
import java.util.HashMap;

public class two_sum {
    //Brute Force
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }


    //Using Hashmap
    public int[] twosum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        
        return new int[] {};
    }
}
