package stack;
import java.util.*;
public class StockSpanProblem {
	static class Pair{
		int num;
		int index;
		public Pair(int num, int index){
			this.num = num;
			this.index = index;
		}
	}
	public static void main(String[] args) throws Exception{
		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int[] price = new int[n];
			for(int i=0; i<n; i++)
				price[i] = in.nextInt();
			
			int[] span = new int[n];
			//calculatespan(price,n,span);
			//calculatespanUsingStack(price,n,span);
			//System.out.println(Arrays.toString(span));
			solution2(price,n);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	

	/*Btuth force solution*/
	private static void calculatespan(int[] price, int n,int[] spna){
		
		for(int i =0; i<n; i++){
			spna[i] = 1;
			for(int j = i-1; j>= 0; j--){
				
				if(price[j] <= price[i]){
					spna[i]++;
				}else
					break;
			}
		}
	}
	
	/*optimize solution 1*/
	private static void calculatespanUsingStack(int[] price, int n, int[] span)throws Exception{
		StackLinkList st = new StackLinkList();
		st.push(0);
		span[0] = 1;
		for(int i = 1; i<n; i++){
			
			while(!st.isEmpty() && price[st.peek()] <= price[i])
				st.pop();
			
			span[i] = (st.isEmpty()) ? (i+1) :(i - st.peek());
			st.push(i);
		}
	}
	
	private static void solution2(int[] arr, int n){
		
		Stack<Pair> st = new Stack<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i =0; i<n; i++){
			
			if(st.size() == 0){
				
				list.add(-1);
				
			}else if(st.size() > 0 && st.peek().num > arr[i]){
				
				list.add(st.peek().index);
				
			}else if(st.size() > 0 && st.peek().num <= arr[i]){
				
				while(st.size() > 0 && st.peek().num <= arr[i])
					st.pop();
				
				if(st.size() == 0){
					
					list.add(-1);
					
				}else{
					
					list.add(st.peek().index);
				}
			}
			st.push(new Pair(arr[i],i));
		}
		
		int[] res = new int[n];
		for(int i =0; i<n; i++){
			res[i] = (i - list.get(i));
		}
		for(int e :  res){
			System.out.print(e+" ");
		}
	}
}	

