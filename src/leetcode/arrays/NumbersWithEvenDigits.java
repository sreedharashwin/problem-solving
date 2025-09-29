package leetcode.arrays;

public class NumbersWithEvenDigits {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int number:nums){
            int digits=0;
            while(number>0){
                number = number/10;
                digits +=1;
            }
            if(digits%2==0)
                count +=1;
        }
        return count;
    }
}
