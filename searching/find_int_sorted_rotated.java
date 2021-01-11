package searching;
import java.util.*;
public class find_int_sorted_rotated {
	private static int BinarySearch(int[] a, int low, int high,int data){
		if(low>high)
			return -1;
		int mid = low+(high - low)/2;
		if(a[mid] == data)
			return mid;
		if(a[mid]>data)
			return BinarySearch(a, low, mid-1,data);
		return BinarySearch(a,mid+1,high, data);
	}
	
	private static int findPivet(int[] a, int start, int end){
		if(start>end)
			return -1;
		int mid = start+(end - start)/2;
		
		if(mid < end && a[mid] > a[mid+1])
			return mid+1;
		if(mid > start && a[mid-1]>a[mid])
			return mid;
		if(a[mid]<a[start])
			return findPivet(a,start,mid-1);
		else
			return findPivet(a,mid+1,end);
	}
	
	private static int findKey(int[] a,int n, int key){
		
		int pivot = findPivet(a,0,n-1);
		
		if(pivot == -1)
			return BinarySearch(a,0,n-1, key);
		if(a[pivot] == key)
			return pivot;
		if(a[0]<=key)
			return BinarySearch(a, 0, pivot-1, key);
		else
			return BinarySearch(a, pivot+1, n-1, key);	
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t =  in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int[] a = new int[n];
			for(int i=0; i<n; i++)
				a[i] =  in.nextInt();
			int key =  in.nextInt();
			int index = findKey(a,n, key);
			System.out.println(index);
		}
	}
}
