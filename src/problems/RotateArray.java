package problems;

import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1); //reverse the original array
        reverse(nums,0,k-1); //reverse the first k elements
        reverse(nums,k,nums.length-1); //reverse the rest of the elements from k to end of array
    }
    static void reverse(int[] nums, int start, int end) {
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        RotateArray.rotate(nums,3);
        Arrays.stream(nums).forEach(System.out::print);
    }
}
