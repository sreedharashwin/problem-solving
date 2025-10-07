package leetcode.arrays;

public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0; //initial point
        int j = n - 1; //last point
        while(i+1<n && arr[i]<arr[i+1])
            i++;
        while(j>0 && arr[j-1]>arr[j])
            j--;

        return i>0 && i==j && j<n-1;
    }
}
