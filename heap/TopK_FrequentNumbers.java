package heap;
import java.util.*;

public class TopK_FrequentNumbers {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 3, 2, 2, 4};
        int n = arr.length;
        int k = 2;
        print_Numbers(arr,k,n);
	}

	private static void print_Numbers(int[] arr, int k, int n){
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i =0; i<n; i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
				(a, b)->a.getValue().equals(b.getValue()) ?
						 Integer.compare(b.getKey(),a.getKey()):
						 Integer.compare(b.getValue(),a.getValue()));
		
		for(Map.Entry<Integer,Integer> entry : hm.entrySet())
			pq.add(entry);
		for(int i =0; i<k; i++)
			System.out.print(pq.poll().getKey()+" ");
		
	}

}
