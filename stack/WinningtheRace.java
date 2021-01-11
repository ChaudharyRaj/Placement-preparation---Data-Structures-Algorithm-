package stack;
import java.util.*;
public class WinningtheRace {
	
	private static int[] winning(int[] arr, int n){
		
		Stack<Integer> st = new Stack<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i =0; i<n; i++){
			
			if(st.isEmpty()){
				
				list.add(-1);
				
			}else if(!st.isEmpty() && st.peek() < arr[i]){
				
				list.add(st.peek());
			}else{
				
				while(!st.isEmpty() && st.peek() >= arr[i]){
					st.pop();
				}
				if(st.isEmpty()){
					
					list.add(-1);
				}else
					list.add(st.peek());
			}
			st.push(arr[i]);
		}
		int[] res = new int[n];
		for(int i =0; i<n; i++){
			res[i] = list.get(i);
		}
		return res;
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = in.nextInt();
		}
		int[] res = winning(arr,n);
		for(int i : res)
			System.out.print(i+" ");
		System.out.println();
	}

}
