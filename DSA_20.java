public class DSA_20 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7 };
        int n = arr.length;
        int all = 0;
        int sum = (n *(n+1))/2;
        for (int i : arr) {
            all = all ^ i;
            sum = sum - i;
            // System.out.println(all);
        }
        // System.out.println(1 ^ 2);
    }
}
