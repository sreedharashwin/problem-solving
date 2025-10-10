package problems;
import java.util.*;

public class ArrayIntersection {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer,Integer> intMap = new HashMap<>(); //create a map to count the number of occurrences
            for(int n:nums1){
                intMap.put(n,intMap.getOrDefault(n,0)+1); //update the counter
            }
            List<Integer> result = new ArrayList<>();
            for(int n:nums2){
                if(intMap.getOrDefault(n,0)>0){
                    result.add(n);
                    intMap.put(n,intMap.get(n)-1); //if found, reduce the counter in the value
                }
            }
            int[] res = new int[result.size()]; //convert to array from List
            int n=0;
          for(int r: result){
              res[n] = r;
              n++;
          }
          return res;
        }

        //alternative solution, two pointer approach
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i=0,j=0;
            List<Integer> result = new ArrayList<>();
            while(i<nums1.length && j<nums2.length){
                if(nums1[i]==nums2[j]){
                    result.add(nums1[i]);
                    i++;
                    j++;
                }
                else if(nums1[i]<nums2[j])
                    i++;
                else
                    j++;
            }

            int n=0;
            int[] res = new int[result.size()];
            for(int r: result){
                res[n]=r;
                n++;
            }
            return res;
        }
    }
