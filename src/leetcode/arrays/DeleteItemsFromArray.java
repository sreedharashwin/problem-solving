package leetcode.arrays;

public class DeleteItemsFromArray {
    public int removeElement(int[] nums, int val) {
        int k = 0; //a pointer created to check the element
        for (int i = 0; i < nums.length; i++) { // run through entire array
            if (nums[i] != val) { // if pointer not equal to target element
                nums[k] = nums[i]; // current element will be overwritten
                k++; //move the pointer to next position
            }
        }
        return k; //return the length
    }
}
