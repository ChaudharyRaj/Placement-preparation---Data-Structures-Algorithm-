package graph;
import java.util.*;
public class WarZone {
	
	@SuppressWarnings("unchecked")
	static Vector<Integer> []adj = new Vector[100005];
	static int[] visited = new int[100005];
	static int ans = 0;
	static void addedge(int u, int v){
		adj[u].add(v);
		adj[v].add(u);
	}
	
	private static void dfs(int node, int count, int m, int[] arr, int k){
			
			visited[node] = 1;
			//System.out.println(arr[node]);
			if(arr[node] == k){
				count++;
			}else{
				count = 0;
			}
			
			if(count > m){
				System.out.println(arr[node]);
				return;
			}
			
			if(adj[node].size() == 1 && node != 0){
				ans++;
			}
			for(int x : adj[node]){
				if(visited[x] != 1){
					dfs(x, count, m, arr, k);
				}
			}
		}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n =  in.nextInt();
		int l = in.nextInt();
		int k = 1;
		int arr[] = new int[n];
		for(int i = 0; i<n; i++)
			arr[i] =  in.nextInt();
		
		for(int i = 0; i <adj.length; i++)
	        adj[i] = new Vector<Integer>();
		
		for(int i = 0; i<n-1; i++){
			int u = in.nextInt();
			int v = in.nextInt();
			addedge(u, v);
		}
		int count = 0;
		dfs(0,count,l,arr,k);
		System.out.println(ans);
	}
}
