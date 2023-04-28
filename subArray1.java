import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subArray1 {
    public static void main(String[] args) {
        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // int[] arr = {5,4,-1,7,8};
        int ans = getMAxSubarray(arr);
        // List<List<Integer>> ans = printSubArray(arr);
        System.out.println(ans);
        
    }

    static List<List<Integer>> printSubArray(int[] arr){
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for (int num : arr) {
            int n = outerList.size();
            int sum = 0;
            for (int i = 0; i<n; i++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(num);
                sum = sum + num;
                outerList.add(innerList);
                // System.out.println(Arrays.stream(innerList).sum());
                // System.out.println(innerList);
            }
        }
        return outerList;

    }


    static int getMAxSubarray(int[] arr){
        //initially
        int sum = 0;
        int maxi = arr[0];

        for (int i = 0; i <= arr.length-1; i++) {
            // updating initial values
            sum = sum + arr[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0 ){
                sum = 0;
            }
        }
        return maxi;
    }

}
