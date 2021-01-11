package sorting;
import java.util.*;
public class Sort_Uniqueway {
	
	private static int Uniqueway(int[] arr, int start, int end){
		
		if(start+1 == end)
			return 1;
		int mid = (start+end)/2;
		int h1  = Uniqueway(arr, start,mid);
		int h2  = Uniqueway(arr, mid,end);
		
		if(h1 == h2 &&  arr[mid-1] <= arr[mid]){
			return h1+h2;
		}
		if(h1>h2)
			return h1;
		else 
			return h2;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int i =0; i<n; i++){
				arr[i] =  in.nextInt();
			}
			int res = Uniqueway(arr,0,n);
			System.out.println(res);
		}
	}	
}
