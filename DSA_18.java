import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSA_18 {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        // int[] arr = {3,1,4,2};
        // int[] arr = {3,2,1};
        // List<List<Integer>> ans = allPermute(arr);
         nextPermute(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static List<List<Integer>> allPermute(int[] arr) {
        ArrayList<List<Integer>> resultList = new ArrayList<>();
        backTrack(resultList, new ArrayList<>(), arr);
        return resultList;
    }

    private static void backTrack(ArrayList<List<Integer>> resultList, ArrayList<Integer> tempList, int[] arr) {
            if(tempList.size() == arr.length){
                resultList.add( new ArrayList<>(tempList));
                return;
            }

            for(int num : arr){
                if(!tempList.contains(num)){
                    // continue;

                tempList.add(num);
                backTrack(resultList, tempList, arr);
                tempList.remove(tempList.size()-1);
                // System.out.println(tempList.size()-1);
                // tempList.remove(num);
            }
        }
    }

    public static void nextPermute(int[] arr){
        int break_point = arr.length-2;
        // int j = 0;

        while( break_point >= 0 && arr[break_point] >= arr[break_point + 1]){
            break_point--;
        }
        System.out.println(break_point);
        
        if(break_point == -1){
            break_point = arr.length-1;
            reverse(arr,0,break_point);
        }
        
        if( break_point >= 0){
          int j ;
          for ( j = arr.length-1 ; j >= 0; j--) {
            if(arr[j] > arr[break_point]){
                break;
            }
        }
        swap(arr, break_point, j);
        reverse(arr, j,break_point +1);
        
        }
    }

    private static void reverse(int[] arr, int break_point, int j) {
        while(j < break_point){
            swap(arr,break_point,j);
            break_point--;
            j++;
        }
    }

    private static void swap(int[] arr, int break_point, int j) {
        int temp = arr[break_point];
         arr[break_point] = arr[j];
         arr[j] = temp;
    }


}
