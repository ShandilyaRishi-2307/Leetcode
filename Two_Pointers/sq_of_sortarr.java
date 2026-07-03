package Two_Pointers;

import java.util.ArrayList;
import java.util.Collections;

public class sq_of_sortarr {
    public int[] sqarr(int nums[]){
        int i = 0;
        int j = nums.length-1;
        int k = j;
        int arr[] = new int[nums.length];
        while(i<=j){
            int startsq = nums[i]*nums[i];
            int endsq = nums[j]*nums[j];
            if(startsq<endsq){
                arr[k--] = endsq;
                j--;
            }
            else{
                arr[k--] = startsq;
                i++;
            }
        } 
        return arr;
    }




    public int[] sqarrII(int nums[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                list2.add(nums[i]*nums[i]);
            }
            else{
                list1.add(nums[i]*nums[i]);
            }
        }
        if(list1.size() == 0){
            return list2.stream().mapToInt(Integer::intValue).toArray();
        }
        if(list2.size() == 0){
            Collections.reverse(list1);
            return list1.stream().mapToInt(Integer::intValue).toArray();
        }
        else{
            Collections.reverse(list1);
            int i = 0,j=0,k=0;
            while(i<list1.size() && j<list2.size()){
                if(list1.get(i)<list2.get(j)){
                    nums[k++] = list1.get(i);
                    i++;
                }
                else{
                    nums[k++] = list2.get(j);
                    j++;
                }
            }
            while(i<list1.size()){
                nums[k++] = list1.get(i);
                i++;
            }
            while(j<list2.size()){
                nums[k++] = list2.get(j);
                j++;
            }
            return nums;
        }
    }
}
