package searching;
import java.util.*;

public class NUMCHOC {
	
	private static int binarySearch(int[] a, int low, int high,int x,int count){
		
		if(low>high){
			return count;
		}
		int mid = low+(high - low)/2;
		if(x >= a[mid])
			count = mid+1;
		
		if(x < a[mid])
			return binarySearch(a,low, mid-1,x,count);
		
		return binarySearch(a, mid+1, high, x,count);
	}
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int q = in.nextInt();
		for(int i = 0; i<q; i++){
			int x = in.nextInt();
			int count = binarySearch(a,0,n-1,x,0);
			System.out.println(count);
		}
	}

}
