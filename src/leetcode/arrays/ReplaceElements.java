package leetcode.arrays;

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i =arr.length-1; i>=0; i--) {
            int newVal = max;
            if(arr[i] > max) {
                max = arr[i];
            }
            arr[i] = newVal;
        }
        return arr;
    }
}
