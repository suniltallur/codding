import java.util.Arrays;

public class DSA_16 {
    public static void main(String[] args) {
        // int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        Arrays.sort(arr);
        int m = 5;
        int ans = getMinDifference(arr,m);
        System.out.println(ans);
    }

    public static int getMinDifference(int[] arr, int m) {
        int sum =  Integer.MAX_VALUE;
        int s = 0;
        int e = m - 1;
        while(e <= arr.length-1){
           int temp = arr[e] - arr[s];
            if(sum > temp){
                sum = temp;
            }
            s++;
            e++;
        }

        return sum;
    }
}
