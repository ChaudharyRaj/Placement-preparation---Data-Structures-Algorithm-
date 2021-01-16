package heap;
import java.util.*;

class pair {
	 Integer key;
	 Integer value;
	public pair(Integer key,Integer value){
		this.key = key;
		this.value = value;
	}
	
	void setKey(Integer key){
		this.key = key;
	}
	
	Integer getKey(){
		return key;
	}
	
	void setValue(Integer value){
		this.value =  value;
	}
	
	Integer getValue(){
		return value;
	}
}
public class k_closest_elements {
	
	private static void sort(int[] arr, int k, int x){
		
		PriorityQueue<pair> maxh =  new PriorityQueue<pair>(new Comparator<pair>(){
			@Override
			public int compare(pair o1, pair o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for(int i = 0; i<k; i++){
			maxh.add(new pair(arr[i],Math.abs(arr[i] - x)));
		}
		
		for(int i =k; i<arr.length; i++){
			
			int diff = Math.abs(arr[i] - x);
			if(diff > maxh.peek().getValue()) continue;
			maxh.poll();
			maxh.add(new pair(arr[i],diff));
			
		}
		while(!maxh.isEmpty()){
			System.out.print(maxh.peek().getKey()+" ");
			maxh.poll();
		}
	}
	
	public static void main(String[] args){

		int k = 3;
		int x = 5;
		int[] arr = {10, 2, 14, 4, 7, 6};
		sort(arr,k,x);	
	}
}
