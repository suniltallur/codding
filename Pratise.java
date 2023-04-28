import java.util.Arrays;

public class Pratise {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,9};
        reverse(arr);
       System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int si = 0;
        int ei = arr.length-1;
        while(si <= ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

   

}
