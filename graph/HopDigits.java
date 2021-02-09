package graph;
import java.util.*;
public class HopDigits {
	
	private static int getMinimumHop(int[] arr, int n){
		
		boolean visited[] = new boolean[n];
		int distance[]   = new int[n];
		
		Vector<Integer> disit[] = new Vector[10];
		
		for(int i = 0; i<10; i++){
			disit[i] = new Vector<Integer>();
		}
		
		for(int i =0; i<n; i++){
			visited[i] = false;
		}
		
		for(int i = 1; i<n; i++){
			disit[arr[i]].add(i);
		}
		
		distance[0] = 0;
		visited[0] = true;
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		
		while(!q.isEmpty()){
			
			int idx = q.peek();
			q.remove();
			
			if(idx == n-1){
				break;
			}
			
			int d = arr[idx];
			
			for(int i = 0; i<disit[d].size(); i++){
				
				int nextindex = disit[d].get(i);
				
				if(!visited[nextindex]){
					
					visited[nextindex] = true;
					q.add(nextindex);
					distance[nextindex] = distance[idx]+1;
				}
			}
			
			disit[d].clear();
			
			if(idx - 1 >= 0 && !visited[idx-1]){
				visited[idx-1] = true;
				q.add(idx - 1);
				distance[idx -1] = distance[idx]+1;
			}
			
			if(idx+1 < n && !visited[idx+1]){
				visited[idx+1] = true;
				q.add(idx+1);
				distance[idx+1] = distance[idx]+1;
			}
		}
		return distance[n-1];
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str =  in.nextLine();
		int n = str.length();
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++){
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		int ans  = getMinimumHop(arr,n);
		System.out.println(ans);
	}
}
