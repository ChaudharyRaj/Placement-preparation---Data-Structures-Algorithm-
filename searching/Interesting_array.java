package searching;
import java.util.*;
public class Interesting_array {
	
	private static int BinarySearch(int[] a, int low, int high, int x){
		
		if(low>high)
			return -1;
		int mid = low + (high -  low)/2;
		
		if(a[mid] == x){
			System.out.println(a[mid]);
			return mid;
		}
			
		if(x > a[mid])
			return BinarySearch(a, mid+1, high, x);
		
		return BinarySearch(a, low, mid-1, x);
	}
	private static int findCount(int[] a, int n, int k){ 
		
		int count = 0;
		Arrays.sort(a);
		for(int i= 0; i<n; i++){
			
			if(BinarySearch(a,i+1,n-1,a[i]+k) != -1)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++){
			a[i] = in.nextInt();
		}
		int count = findCount(a,n,k);
		System.out.println(count);
		
	}
}
