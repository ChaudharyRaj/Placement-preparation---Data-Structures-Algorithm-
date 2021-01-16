package heap;
import java.util.*;

public class Sort_byf_requency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 1, 3, 2, 2, 4};
        int n = arr.length;
        int k = 2;
        FrequencySort(arr,k,n);
	}

	private static void FrequencySort(int[] arr, int k, int n){
		
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int  i =0; i<n; i++){
			mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
		}
		PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
				(a,b)->a.getValue().equals(b.getValue()) ?
						Integer.compare(b.getKey(),a.getKey()) :
						Integer.compare(b.getValue(), a.getValue())
				);
		for(Map.Entry<Integer,Integer> entry : mp.entrySet())
			pq.add(entry);
		
		while(pq.size() > 0){
			int key = pq.peek().getKey();
			int frq = pq.peek().getValue();
			while(frq -->0){
				System.out.print(key+" ");
			}
			pq.poll();	
		}
	}
}
