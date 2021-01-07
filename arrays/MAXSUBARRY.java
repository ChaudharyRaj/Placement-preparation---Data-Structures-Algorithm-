package arrays;
import java.util.*;
public class MAXSUBARRY {
	private static int find_brute_forse(int[] a, int n){
		int max = Integer.MIN_VALUE;
		for(int i =0; i<n; i++){
			int sum = 0;
			for(int j = i ; j<n; j++){
				sum +=a[j];
				max = Math.max(sum, max);
			}
		}
		return max;
	}
	
	private static int fint_max_opt(int[]a, int n){
		
		int currmax = a[0];
		int max = a[0];
		for(int i =1; i<n; i++){
			max = Math.max(a[i], max + a[i]);
			if(max > currmax)
				currmax = max;
			
		}
		return currmax;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[] = {10,-20,35,40,10,-10,100,-50};
		int n = a.length;
		System.out.println(find_brute_forse(a,n));
		System.out.println(fint_max_opt(a,n));
		

	}

}
