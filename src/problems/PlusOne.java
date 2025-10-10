package problems;

import java.util.Arrays;

public class PlusOne {
    static int[] solution(int[] digits){
        int n = digits.length - 1;

        while (n >= 0) {
            if (digits[n] < 9) {
                digits[n] += 1;
                return digits; // done, no carry
            }
            digits[n] = 0; // carry over
            n--;
        }

        // If we reached here, all digits were 9
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; // the rest are already 0 by default
        return newNumber;
    }
    public static void main(String[] args){
        Arrays.stream(PlusOne.solution(new int[]{9, 9, 9, 9})).forEach(System.out::print);
    }
}
