package recursion;
import java.util.*;
import java.io.*;
public class SubsetSum {
	static int total = 0;
	public static void subsetSums(int[] arr, int l, int r, int sum){
		if(l == r){
			total += sum;
			return;
		}
		subsetSums(arr, l+1, r, sum+arr[l]);
		subsetSums(arr, l+1, r, sum);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++)
				arr[i] = in.nextInt();
			total = 0;
			subsetSums(arr,0,n,0);
			System.out.println(total);
		}
		in.close();
	}
}
