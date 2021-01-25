package heap;
import java.util.*;
public class Connect_n_ropes {

	public static void main(String[] args) {
		
		int len[] = { 4, 3, 2, 6 }; 
        int size = len.length;
        int res = soleve(len,size);
        System.out.println(res);
	}

	private static int soleve(int[] len, int size){
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i = 0; i<size; i++){
			queue.add(len[i]);
		}
		int cost = 0;
		while(queue.size() > 1){
			int first = queue.poll();
			int second = queue.poll();
			cost+= first+second;
			queue.add(first+second);
		}
		return cost;
	}

}
