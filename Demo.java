import java.util.*;

public class Demo {
	public static void main(String[] args) {
		// int[] arr = {8,3,4,7,2,6};
		int[] arr = {4,2,0,8,20,9,2};
		int start =0 ;
		int end = arr.length-1;
		Divide(arr, start,end);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// System.out.println(arr[0]);
		// System.out.println(arr[arr.length-1]);
	}

	private static void Divide(int[] arr, int start, int end) {
		if(start >= end){
			return;
		}

		int mid = start + (end - start)/2;
		Divide(arr,start,mid);
		Divide(arr,mid+1,end);

		Conqure(arr,start,mid,end);
	}
 
	private static void Conqure(int[] arr, int start, int mid, int end) {
		int[] merged = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j<= end){
			if(arr[i] <= arr[j]){
				merged[k] = arr[i];
				i++;
			}
			else if(arr[i] >= arr[j]){
				merged[k] = arr[j];
				j++;
			}
			k++;
		}
		while(i <= mid){
			merged[k] = arr[i];
				i++;
				k++;
		}

		while(j <= end){
			merged[k] = arr[j];
				j++;
				k++;
		}

		for (int m = 0,l = start ; m < merged.length; m++, l++) {
			arr[l] = merged[m];
		}

	}
	
	
}
 