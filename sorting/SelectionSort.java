package sorting;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int a[]= new int[n];
			for(int i =0; i<n; i++){
				a[i] = in.nextInt();
			}
			SelectonSort(a,n);
			for(int i : a)
				System.out.print(i+" ");
		}

	}

	private static void SelectonSort(int[] a, int n){
		int min = 0, temp = 0;
		for(int i =0; i<n-1; i++){
			min = i;
			for(int j =i+1; j<n; j++){
				if(a[j] < a[min])
					min = j;
			}
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}

}
