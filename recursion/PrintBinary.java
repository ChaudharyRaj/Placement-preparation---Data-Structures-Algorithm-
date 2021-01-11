package recursion;
import java.util.*;
import java.io.*;
public class PrintBinary {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int[] arr = new int[n];
			arr[0] = 0;
			binary(arr,1,n);
			arr[0] = 1;
			binary(arr,1,n);
		}
	}

	private static void binary(int[] arr, int k, int n){
		if(k == n){
			for(int i : arr)
				System.out.print(i+" ");
			System.out.println();
			return;
		}	
		if(arr[k-1] == 0){
			arr[k] = 0;
			binary(arr, k+1, n);
			arr[k] = 1;
			binary(arr, k+1, n);
		}else{
			arr[k] = 0;
			binary(arr, k+1, n);
		}
	}

}
