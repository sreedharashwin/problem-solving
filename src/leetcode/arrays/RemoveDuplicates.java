package leetcode.arrays;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j=0; // pointer
        for(int i=1;i<nums.length;i++){ //start from second element
            if(nums[j]!=nums[i]){ //if they are not same
                j++; //move to next element
                nums[j]=nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}