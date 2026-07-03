package Two_Pointers;

public class rem_dup_from_sortarrrII {
    public int remdepII(int[] nums){
        int i=1;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-1]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
