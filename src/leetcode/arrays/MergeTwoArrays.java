package leetcode.arrays;

public class MergeTwoArrays {
    private void mergeArrays(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1; //last element in the first array
        int j = n - 1; //last element in the second array
        int k = m + n - 1; //last element in the merged array

        while (j >= 0) { //as long as there are elements in the array, keep going
            if (i >= 0 && arr1[i] > arr2[j]) { //if the element in arr1 is greater than element in arr2
                arr1[k] = arr1[i]; //put the element in the merged array from the end
                i--; //move to next element
            } else {
                arr1[k] = arr2[j]; //element in second array is greater than the element in first array, place in merged
                j--; //move to next element
            }
            k--; //move pointer to next element in merged array
        }
    }
}
