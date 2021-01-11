package stack;
import java.util.*;

public class MaximumAreaHistogram {
	static class Pair{
		long num;
		long index;
		public Pair(long arr, long index){
			this.num = arr;
			this.index = index;
		}
	}
	
	private static long[] left(long[] arr, long n){
		
		Stack<Pair> st = new Stack<>();
		int minIndex = -1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(long i = 0; i<n; i++){
			
			if(st.isEmpty()){
				
				list.add(minIndex);
				
			}else if(!st.isEmpty() && st.peek().num < arr[(int)i]){
				
				list.add((int) st.peek().index);
				
			}else if(!st.isEmpty() && st.peek().num >= arr[(int)i]){
				
				while(!st.isEmpty() && st.peek().num >= arr[(int)i])
					st.pop();
				
				if(st.isEmpty()){
					
					list.add(minIndex);
				}else{
					
					list.add((int) st.peek().index);
				}
			}
			st.push(new Pair(arr[(int)i],i));
		}
		
		long[] left = new long[(int) n];
		for(int i =0; i<n; i++)
			left[i] = list.get(i);
		return left;
	}
	
	private static long[] right(long[] arr, long n){
		
		Stack<Pair> st = new Stack<>();
		long maxIndex = n;
		ArrayList<Long> list = new ArrayList<Long>();
		
		for(long i = n-1; i>=0; i--){
			
			if(st.isEmpty()){
				
				list.add(maxIndex);
				
			}else if(!st.isEmpty() && st.peek().num < arr[(int) i]){
				
				list.add(st.peek().index);
				
			}else if(!st.isEmpty() && st.peek().num >= arr[(int) i]){
				
				while(!st.isEmpty() && st.peek().num >= arr[(int) i])
					st.pop();
				
				if(st.isEmpty()){
					
					list.add(maxIndex);
				}else{
					
					list.add(st.peek().index);
				}
			}
			st.push(new Pair(arr[(int) i],i));
		}
		long[] right = new long[(int) n];
		for(long i = n-1; i>=0; i--)
			right[(int) (n-1-i)] = list.get((int) i);
		return right;
	}
	
	public static void main(String[] args) {
		
		long hight[] = {7,2,8,9,1,3,6,5};
		long n = hight.length;
		long[] left = left(hight, n);
		long[] right = right(hight, n);
		long[] width = new long[(int) n];
		long maxArea = 0;
		for(int i =0; i<n; i++){
			width[i] = (right[i] - left[i])-1;
		}
		long[] area = new long[(int) n];
		for(int i =0; i<n; i++){
			area[i] = hight[i]*width[i];
		}
		for(long i : area)
			maxArea = Math.max(maxArea, i);
		System.out.println(maxArea);
				
	}

}
