package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int a=0;a<nums.length;a++){
            int complement = target - nums[a];
            if(countMap.containsKey(complement))
            return new int[]{countMap.get(complement),a};
            else
                countMap.put(nums[a],a);
        }
        return new int[]{};
    }

    public static void main(String[] args){
        TwoSum.twoSum(new int[]{2,7,11,15},9);
    }
}
