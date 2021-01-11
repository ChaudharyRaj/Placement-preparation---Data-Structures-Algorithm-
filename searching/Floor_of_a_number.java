package searching;
import java.util.*;
public class Floor_of_a_number {
	private static int Search(int[] a, int low, int high, int x){
	      if(low>high){
	        return -1;
	      }
	      if(x >= a[high])
	    	  return high;
	      int mid = low + (high-low)/2;
	      if(a[mid] == x)
	    	  return mid;
	      if(mid > 0 && a[mid-1] <= x && x < a[mid])
	    	  return mid-1;
	      
	      if(a[mid] > x)
	    	  return Search(a,low,mid-1, x);
	    return Search(a,mid+1, high,x);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int x = in.nextInt();
			int a[] =  new int[n];
			for(int i =0; i<n; i++)
				a[i] = in.nextInt();
			int index = Search(a, 0, n-1, x);
			System.out.println(index);
		}
		in.close();
	}
}
