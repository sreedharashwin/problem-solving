package problems;

import java.util.Arrays;
import java.util.List;

public class SingleNum {
    public int singleNumber(int[] nums){
        int result = nums[0];
        int n = nums.length-1;
        while(n>0){
            result = result ^ nums[n]; //xor operator, if bits are same, it will return 0, 1 XOR 1 = 0, 0 XOR 0 = 0, etc
            n--;
        }
        return result;
    }
}