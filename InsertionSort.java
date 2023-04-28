import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,7,2,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int k, int l) {
        
        int temp = arr[k];
        arr[k] = arr[l];
        arr[l] = temp;

    }
}
