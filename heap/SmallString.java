package heap;
import java.util.*;

public class SmallString {
	
	private static String smallPossible(String str, int q){
		String res="";
		PriorityQueue<Character> minheap = new PriorityQueue<Character>();
		int i,n=str.length();
		q = Math.min(q,n);
		for(i =0; i<q; i++){
			minheap.add(str.charAt(i));
		}
		while(minheap.size()>0){
			res+= minheap.poll();
			if(i<n){
				minheap.add(str.charAt(i));
			}
			i++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "trnqf";
		int q = 3;
		String res= "";
		PriorityQueue<Character> minheap = new PriorityQueue<Character>();
		System.out.println(smallPossible(str,q));
	}

}
