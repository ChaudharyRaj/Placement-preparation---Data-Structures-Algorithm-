package recursion;
import java.util.*;

public class SumArray {
	
	static void findSum(int[] arr, int n,int sum){
		if(n<0){
			System.out.println(sum);
			return;
		}
		findSum(arr, n-1,sum+arr[n]);
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++)
				arr[i] = in.nextInt();
			findSum(arr,n-1,0);
		}
	}	
}
