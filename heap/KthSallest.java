package heap;
import java.util.*;

public class KthSallest {

	private static int KthSmallest(int arr[], int k){
		
		PriorityQueue<Integer> pq =  new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int  i = 0; i<arr.length; i++){
			pq.add(arr[i]);
			if(pq.size() > k){
				pq.remove();
			}
		}
		return pq.poll();
	}
	public static void main(String[] args){
		Scanner in =  new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i<n; i++){
				arr[i] = in.nextInt();
			}
			int k = in.nextInt();
			System.out.println(KthSmallest(arr, k));
		}
	}
}
