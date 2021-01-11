package sorting;
import java.util.*;
	
public class QuickSort{
	private static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	private static int partiton(int a[], int low, int high){
		int pivet = a[high];
		int i = (low -1);
		for(int j = 0; j<high-1; j++){
			if(a[j] <= pivet){
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,high);
		return (i+1);
	}
		
	private static void QuickSort(int[] a, int low, int high){
		if(low>high)
			return;
		int pivet = partiton(a, low, high);
		QuickSort(a, low, pivet-1);
		QuickSort(a, pivet+1, high);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i =0; i<n; i++){
				a[i] =  in.nextInt();
			}
			
		}
	}

}
