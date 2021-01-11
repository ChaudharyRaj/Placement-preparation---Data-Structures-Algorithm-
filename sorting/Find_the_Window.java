/*You are given an array that is not completely sorted but sorting a window in this array can make the whole array sorted. That window could be a complete array as well.
So, out of several such parts, you have to find the one with minimum length.*/
package sorting;
import java.util.*;
public class Find_the_Window {
	private static void find_window(int[] a, int n){
		
		int start, end;
		//finding start point
		for(start = 0; start<n-1;start++){
			if(a[start] > a[start+1])
				break;
		}
		// finding end point
		for(end = n-1; end>0; end--){
			if(a[end] < a[end-1])
				break;
		}
		
		//finding min and max between start and end
		int min  = Integer.MAX_VALUE ,max = Integer.MIN_VALUE;
		
		for(int i = start; i<=end; i ++){
			if(a[i]<min)
				min = a[i];
			if(a[i] > max)
				max = a[i];
		}
		
		// finding min and max between 0 to start and end to  n-1
		for(int i =0; i<start; i++){
			if(a[i]>min)
				start = i;
		}
		for(int i=end; i<n; i++)
			if(a[i] < max)
				end = i;
		System.out.println(start+" "+end);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		while(t-->0){ 
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i =0; i<n; i++){	
				a[i] =  in.nextInt();
			}
			find_window(a,n);
		}
	}

}
