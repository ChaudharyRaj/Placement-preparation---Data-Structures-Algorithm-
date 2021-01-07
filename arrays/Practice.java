package arrays;
import java.util.*;
import java.io.*;
public class Practice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int k = in.nextInt();
			int arr[] =  new int[n];
			for(int i =0; i<n; i++)
				arr[i] = in.nextInt();
			for(int i =0; i<=k; i++)
				rotate(arr, n);
			for (int i : arr) {
				System.out.print(i+" ");
			}
			 
		}
	}
	static void rotate(int[] arr, int n){
		int temp = arr[0];
		for(int i =0; i<n-1; i++){
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}
}
