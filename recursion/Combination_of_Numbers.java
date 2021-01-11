package recursion;
import java.util.*;
public class Combination_of_Numbers {
	
	private static void recur(int[] arr, String out, int i, int n, int k) {
		if(k==0){
			System.out.println(out);
			
		}
		for(int j =i; j<n; j++){
			recur(arr, out+(arr[j])+" ", j+1, n, k-1);
		}
	}
	public static void main(String[] args){
		Scanner in =  new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i =0; i<n; i++)
				arr[i]  = in.nextInt();
			int k = in.nextInt();
			String ans = "";
			recur(arr,"",0,arr.length,k);
			
		}
	}
}
