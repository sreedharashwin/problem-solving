package problems;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        for(int n:nums){
            if(!intSet.contains(n))
                intSet.add(n);
            else
                return true;
        }
        return false;
    }

    //without using Set
    public boolean containsDupe(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}
