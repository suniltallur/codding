import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSA_1 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,9};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void divide(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mi = si + (ei - si)/2;
        divide(arr,si,mi);
        divide(arr,mi+1,ei);
        conqure(arr, si, mi, ei);
    }
    static void conqure(int[] arr, int si, int mi, int ei){
        int[] merged = new int[ei - si + 1];
        int idx1 =si;
        int idx2 = mi+1;
        int k = 0;
        while(idx1 <= mi && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[k] = arr[idx1];
                k++;
                idx1++;
               
            }else{
                merged[k] = arr[idx2];
                k++;
                idx2++;
            }
        } 

        while(idx1 <= mi){
            merged[k] = arr[idx1];
                 k++;
                idx1++;
        }
        while(idx2 <= ei){
            merged[k] = arr[idx2];
                k++;
                idx2++;
        }

        for (int i = 0, j = si; i < merged.length; i++,j++) {
            arr[j] = merged[i];
        }

    }
}
