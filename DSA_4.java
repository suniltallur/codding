import java.util.HashSet;
import java.util.Set;

// Given an integer array nums, return 
//true if any value appears at least twice in the array,
// and return false if every element is distinct.

public class DSA_15 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        boolean ans = findDublicate(arr);
        System.out.println(ans);
    }
    static boolean findDublicate(int[] arr){
        Set<Integer> intSet = new HashSet<>();
        int i = 0;
        for(int num : arr){
            if(intSet.contains(num)){
                return true;
            }
            intSet.add(num);
        }
        return false;
    }
}
