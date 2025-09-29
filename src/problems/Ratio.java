package problems;

import java.util.List;

public class Ratio {

    public void plusMinus(List<Integer> arr) {
        int numberOfElements = arr.size();
        float positiveNo =0, negativeNo =0, zero = 0;
        for (Integer integer : arr) {
            if(integer> 0){
                positiveNo++;
            } else if(integer<0){
                negativeNo++;
            }else{
                zero++;
            }
        }
        System.out.format("%.6f \n", positiveNo/numberOfElements );
        System.out.format("%.6f \n", negativeNo/numberOfElements);
        System.out.format("%.6f \n", zero/numberOfElements);

    }

    public static void main(String[] args) {
        Ratio ratio = new Ratio();
        ratio.plusMinus(List.of(9,0,-3,2,0,-7,3));
    }
}
