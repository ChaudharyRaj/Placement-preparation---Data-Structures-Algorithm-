package sorting;
import java.util.*;
public class BubleSort {
	private static void swap(int[]a, int i, int j){
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	private static void sort(int[]  a, int n){
		
		for(int i =  n; i>=0; i--){
			
			for(int j = 0; j<i; j++){
				if(a[j] > a[j+1])
					swap(a, j, j+1);
			}
		}
		
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
			sort(a,n-1);
			for(int i : a){
				System.out.print(i+" ");
			}
		}
	}

}
