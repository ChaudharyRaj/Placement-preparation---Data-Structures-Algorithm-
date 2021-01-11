package stack;
import java.util.*;

public class NGL {
	private static ArrayList<Integer> NGE(int[]  arr, int n){
		
		Stack<Integer> st = new Stack<Integer>();
		ArrayList<Integer> list =  new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++){
			
			if(st.size() == 0){
				
				list.add(-1);
				
			}else if(st.size() > 0 && st.peek() > arr[i]){
				
				list.add(st.peek());
				
			}else if(st.size() > 0 & st.peek() <= arr[i]){
				
				while(st.size() > 0 && st.peek() <= arr[i])
					st.pop();
				
				if(st.size() == 0){
					list.add(-1);
				}else{
					list.add(st.peek());
				}
				
			}
			st.push(arr[i]);
		}
		return list;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2,4};
		int n = arr.length;
		ArrayList<Integer> res = NGE(arr, n);
		Iterator<Integer> iter = res.iterator();
		while(iter.hasNext())
			System.out.print(iter.next()+" ");
	}

}
