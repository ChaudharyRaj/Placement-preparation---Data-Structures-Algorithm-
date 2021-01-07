package arrays;
import java.util.*;
public class subarray_sum {
	private static void subArraySum(int[]a,int n, int sum){
		
		int curr_sum;
		for (int i = 0; i < n; i++) { 
			curr_sum = a[i];
			for(int j = i+1; j<=n; j++){
				if(curr_sum == sum){
					int p = j-1;
					System.out.println("index "+i+" and "+ p);
					return;
				}
				if(curr_sum > sum || j == n)
					break;
				
				curr_sum = curr_sum+a[j];
			}
		}
		System.out.println("Not fiund");
		return;
	}
	
	private static void subArraySum_opt(int[] a, int n, int sum){
		
		int curr_sum = 0;
		int start = 0;
		int count  = 0;
		for(int i =0; i<n; i++){
			while(curr_sum > sum && start < i-1){
				curr_sum = curr_sum - a[start];
				start++;
			}
			if(curr_sum == sum){
				count++;
			}
			
			if(i<n)
				curr_sum = curr_sum+a[i];
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1}; 
        int n = arr.length; 
        int sum = 2; 
        //subArraySum(arr,n,sum);
        subArraySum_opt(arr,n,sum);
	}

}
