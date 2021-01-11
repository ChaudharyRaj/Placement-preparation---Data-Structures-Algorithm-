package queue;
import java.util.*;
public class FindTheDividingNumber {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long[] arr = new long[n];
		
		for(int i =0; i<n; i++)
			arr[i] = in.nextInt();
		
		int[] q = new int[m];
		
		for(int i = 0; i<m; i++)
			q[i] = in.nextInt();
		
		ArrayList<Long> res = new ArrayList<Long>();
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
		for(int i = 0; i<n; i++)
			pq.add(arr[i]);
		
		int count = 0;
		for(int i = 0; i<n; i++){
			
			while(!pq.isEmpty()){
				long temp = pq.poll();
				if(temp/2 > 0){
					pq.add(temp/2);
				}
				res.add(temp);
			}
		}
		for(int i = 0; i <m; i++){
			if(q[i]<res.size())
				System.out.println(res.get(q[i]-1));
		}
	}

}
