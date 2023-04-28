public class DSA_17 {
    public static void main(String[] args) { 
        // int[] arr = {4,5,6,7,1,2,3};
        int[] arr = {6,7,1,2,3,4,5};
        int target = 50;
        // int ans = findPosition(arr, arr.length-1, target);
        int ans =  modifiedBinarySearch(arr,0,arr.length-1,target);
        System.out.println(ans);      
    }

    private static int getPivotIndex(int[] arr) {
        int si = 0;
        int ei = arr.length-1;
        while(si < ei){
            int mi = si + (ei - si)/2;
            if(arr[mi] >= arr[0]){
                si = mi + 1;
            }
            else{
                ei = mi;
            }
        }    
        return si;
    }

    public static int search(int[] arr, int si, int ei, int target){
        while( si <= ei){
            int mi = si + (ei - si)/2;
            if(arr[mi] == target){
                return mi;
            }
            if(arr[mi] < target){
                si = mi + 1;
            }else{
                ei = mi -1;
            }
        }
        return -1;
    }

    static int findPosition(int[] arr, int ei, int target){
        int pivot = getPivotIndex(arr);
        if(arr[pivot] <= target && target <= arr[ei]){
            return search(arr, pivot, ei, target);
        }else{
            
            return search(arr, 0, pivot + 1, target);
        }
    }

    static int modifiedBinarySearch(int[] arr, int si, int ei, int target){
        if(si > ei){
            return -1;
        }
        int mi = si + (ei - si)/2;

        if(arr[mi] == target){
            return mi;
        }

        if(arr[mi] >= arr[si]){
            if(arr[si] <= target && target <= arr[mi]){
                return modifiedBinarySearch(arr, si, mi - 1, target);
            }
            else{
                return modifiedBinarySearch(arr, mi + 1, ei, target);

            }
        }else{
            if(arr[mi] <= target && target <= arr[ei]){
                return modifiedBinarySearch(arr, mi + 1, ei, target);
            }
            else{
                return modifiedBinarySearch(arr, si, mi - 1, target);

            }
        }


    }

}
