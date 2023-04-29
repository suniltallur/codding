
public class DSA_3 {
    public static void main(String[] args) {
        // int[] arr = {5,4,-1,7,8};
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSumSubArray(arr);
        System.out.println(ans);
    }
    static int maxSumSubArray(int[] arr){
        int maxi = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maxi = Math.max(maxi, sum);

            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}

