/*Arnab is given an array of integers of size N.
 *  His teacher asked Arnab to sort the array but as usual,
 *  Arnab did not do his task. So now the teacher will cut his marks for each misplaced element.
 *  Arnab wants to know how much marks he will lose.*/

package sorting;
import java.util.*;
public class misplaced {
	
	private static void merge(int[] arr, int left, int mid, int right){
		
		int n1 = mid - left+1;
		int n2 = right-mid;
		int L[] =  new int[n1];
		int R[] =  new int[n2];
		
		for(int i =0; i<n1; i++)
			L[i] = arr[left+i];
		for(int i = 0; i<n2; i++)
			R[i] = arr[mid+i+1];
		
		int i = 0;
		int j = 0;
		int k = left;
		while(i<n1 && j <n2){
			if(L[i] <= R[j])
				arr[k++] = L[i++];
			else if(L[i] > R[j])
				arr[k++] = R[j++];
		}
		while(i<n1){
			arr[k++] = L[i++];
		}
		while(j<n2){
			arr[k++] = R[j++];
		}
	}
	private static void sort(int[] arr, int left, int right){
		if(left == right)
			return;
		int mid = left +(right-left)/2;
		sort(arr, left, mid);
		sort(arr, mid+1, right);
		merge(arr,left,mid,right);
	}
	public static void main(String[] args){
		
		Scanner in  = new Scanner(System.in);
	      int t = in.nextInt();
	      while(t-->0){
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        int[] sorted = new int[n];
	        for(int i = 0; i<n; i++){
	        	arr[i] = in.nextInt();
	        	sorted[i] = arr[i];
	        }     
	       sort(arr, 0, n-1);
	        int count = 0;
	        for(int i=0; i<n; i++)
	            if(arr[i]!=sorted[i])
	              count++;
	        System.out.println(count);
	      }
	}
}
