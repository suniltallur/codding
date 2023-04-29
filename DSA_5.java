// Given an array of N integers where each value represents the number
//  of chocolates in a packet. Each packet can have a variable number of chocolates. 
//  There are m students, the task is to distribute chocolate packets such that: 

// Each student gets one packet.
// The difference between the number of chocolates in the packet
//  with maximum chocolates and the packet with minimum chocolates given to the students is minimum.

import java.util.Arrays;

public class DSA_5 {
    public static void main(String[] args) {
        // int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};

        Arrays.sort(arr);
        // no.of students
        // int m = 3;
        int m = 7;

        int ans = getMinDiff(arr,m);
        System.out.println(ans);
    }
    static int getMinDiff(int[] arr, int m){
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0 ;  m-1+i < arr.length; i++) {
            int diff = arr[m-1+i] - arr[i];
            minDiff = Math.min(minDiff, diff);
            // System.out.println(diff);
        }
        return minDiff;
    }
}
