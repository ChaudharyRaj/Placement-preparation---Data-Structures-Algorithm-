package arrays;
import java.util.*;
public class Find_maxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the max sum of kth consecutive element :: this is Brouthforce solution 
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
		int max = Integer.MIN_VALUE;
		int n = arr.length;
		
		for(int i=0; i<n-k+1; i++){
			//System.out.println(i);
			int sum =0;
			for(int j = i; j<i+k; j++){
				System.out.print(j+" ");
				sum += arr[j];
			}
			max = Math.max(sum, max);
		}
		System.out.println(max);
	}
}
