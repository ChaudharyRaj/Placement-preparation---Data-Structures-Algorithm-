package sorting;
import java.util.*;
public class MargeSort {
	
	private static void marge(int a[], int left, int mid, int right){
		
		int n1 = (mid - left)+1;
		int n2 = right - mid;
		int[] LeftArr = new int[n1];
		int[] RightArr = new int[n2];
		
		for(int i = 0; i<n1; i++)
			LeftArr[i] = a[left+i];
		
		for(int i =0; i<n2; i++)
			RightArr[i] = a[mid+1+i];
		
		int l = 0, j = 0, k = left;
		while(l<n1 && j <n2){
			if(LeftArr[l] <= RightArr[j])
				a[k++] = LeftArr[l++];
			else a[k++] = RightArr[j++];
		}
		while(l<n1){
			a[k++] = LeftArr[l++];
		}
		while(j<n2){
			a[k++] = RightArr[j++];
		}
	}
	
	private static void  MargSort(int[] a, int left,int right){
		if(left>=right)
			return;
		int mid = left+(right-left)/2;
		MargSort(a, left, mid);
		MargSort(a, mid+1, right);
		marge(a, left, mid, right);
		
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
			MargSort(a,0,n-1);
			for(int i : a){
				System.out.print(i+" ");
			}
		}
	}

}
