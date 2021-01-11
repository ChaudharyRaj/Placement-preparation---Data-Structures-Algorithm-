package sorting;
import java.util.*;

public class CountingSort {
	private static void sort(int[] a, int n, int k){
		
		int[] c = new int[k+1];
		int[] b = new int[n]; 
		for(int i =0; i<n;i++)
			c[a[i]] = c[a[i]]+1;
		
		for(int i= 1; i<=k;i++)
			c[i] = c[i]+c[i-1];
		
		for(int i = n-1; i>=0; i--){
			b[c[a[i]]-1] = a[i];
			c[a[i]]--;
		}	
		for(int i =0; i<n;i++)
			a[i] = b[i];
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int[] a = new int[n];
			int k = 0;
			for(int i =0; i<n; i++){
				a[i] =  in.nextInt();
				if(a[i] > k)
					k = a[i];
			}
			sort(a,n,k);
			for(int i : a)
				System.out.print(i+" ");
		}

	}

}
