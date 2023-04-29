import java.util.Arrays;

public class DSA_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // int[] ans = reverse(arr,0,arr.length-1); 
        reverse(arr,0,arr.length-1); 
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int si, int ei){
        if(si >= ei ){
            return ;
        }
        int mi = si + (ei - si)/2;
        while(si <= ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
        // return arr;
    }
}
