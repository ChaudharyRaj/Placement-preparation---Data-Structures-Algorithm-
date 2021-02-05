package graph;
import java.util.*;
public class Homework {
	static class Graph{
		int v;
		List<Integer> adj[];
		public Graph(int v){
			this.v = v;
			adj = new ArrayList[v];
			for(int i = 0; i<v; i++){
				adj[i] = new ArrayList<Integer>();
			}
		}
		void addEdge(int s, int d){
			adj[s].add(d);
		}
		
		public void topologicalSort(){
			
			int[] indigree = new int[v];
			
			for(int i = 0; i<v; i++){
				ArrayList<Integer> temp = (ArrayList<Integer>)adj[i];
				for(int node :temp){
					indigree[node]++;
				}
			}
			Queue<Integer> queue = new LinkedList<Integer>();
			for(int i = 0; i<v; i++){
				if(indigree[i] == 0){
					queue.add(i);
				}
			}
			
			int count = 0;
			ArrayList<Integer> topOrder = new ArrayList<Integer>();
			while(!queue.isEmpty()){
				
				int u = queue.poll();
				topOrder.add(u);
				
				for(int node : adj[u]){
					if(--indigree[node] == 0){
						queue.add(node);
					}
				}
				count++;
			}
			
			if(count != v){
				System.out.println("Not Possible");
				return;
			}
			for(int i : topOrder){
				System.out.print(i+" ");
			}
		}
	}
	 
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int e = in.nextInt();
			Graph g = new Graph(n);
			while(e-->0){
				int u = in.nextInt();
				int v = in.nextInt();
				g.addEdge(u,v);
			}
			g.topologicalSort();
	}
}

