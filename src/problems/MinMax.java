package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int min=0, max=0;
        for(int i=0;i<arr.size()-1;i++){
            min+=arr.get(i);
        }
        for (int i = 1; i <arr.size() ; i++) {
            max+=arr.get(i);
        }
        System.out.print(min+" "+max);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        miniMaxSum(arr);
    }
}
