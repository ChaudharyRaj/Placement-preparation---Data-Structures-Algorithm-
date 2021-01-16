package heap;
import java.util.*;

public class K_SortedArray {
	
	private static void sort(int[] arr, int  k, int n){
		
		PriorityQueue<Integer> minhep = new PriorityQueue<Integer>();

		for(int i = 0; i < k + 1; i++){
			minhep.add(arr[i]);
		}
		
		int index  = 0;
		for(int i = k + 1; i < n; i++){ 
            arr[index++] = minhep.poll();
            minhep.add(arr[i]); 
        } 
		
		Iterator<Integer> itr = minhep.iterator();
		while(itr.hasNext()){
			arr[index++] = minhep.poll();
		}
		
	}
	public static void main(String[] args){
	
		int arr[] = {6, 5, 3, 2, 8, 10, 9};
		int k = 3;
		int n = arr.length;
		sort(arr,k,n);
		for(int i = 0; i<n; i++)
			System.out.print(arr[i]+" ");
	}

}
