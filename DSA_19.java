public class DSA_19 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        // int[] arr = {7,6,4,3,1};
        // int ans = getProfit(arr);
        int ans = getMaxprofit(arr);
        System.out.println(ans);
    }

    private static int getProfit(int[] arr) {
        int minPrice = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
        }
        int maxPrice = arr[minPrice];
        int minIndex = getIndex(arr,minPrice);
        if(minIndex == arr.length-1){
            return 0;
        }
        for (int j = minPrice+1; j < arr.length; j++) {
            maxPrice = Math.max(maxPrice, arr[j]);
        }

        return maxPrice-minPrice;
        // return minIndex;
    }

    public static int  getIndex(int[] arr , int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }

    static int getMaxprofit(int[] arr){
        int buyPrice = arr[0];
        int currentProfit = 0;
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < buyPrice){
                buyPrice = arr[i];
            }else{
                currentProfit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
       
        return maxProfit;
    }
}
