package heap;
import java.util.*;

public class K_Largest_Numbers {
	private static int[] K_numberss(int[] arr, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i<arr.length; i++){
			pq.add(arr[i]);
			
			if(pq.size() > k)
				pq.remove();
		}
		int[] res = new int[k];
		int i =0;
		while(!pq.isEmpty()){
			res[i++] = pq.poll();
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i<n; i++){
				arr[i] = in.nextInt();
			}
			int k = in.nextInt();
			int[] res = K_numberss(arr,k);
			for(int  i : res)
				System.out.print(i+" ");
		}
	}
}
