package graph;
import java.util.*;
public class EdgeDivide {
	static class pair{
		Integer u;
		Integer v;
		public pair(Integer u,Integer v) {
			this.u = u;
			this.v = v;
		}
		
		void setU(Integer u){
			this.u = u;
		}
		
		Integer getU(){
			return u;
		}
		
		void setV(Integer v){
			this.v =  v;
		}
		
		Integer getV(){
			return v;
		}
		
	}
	static class Graph{
		int v;
		LinkedList<Integer> adj[];
		int count = 0;
		int time = 0;
		static final int NIL = -1;
		PriorityQueue<pair> pq = new PriorityQueue<pair>(new Comparator<pair>(){
			@Override
			public int compare(pair o1, pair o2){
				return  o2.getV().compareTo(o1.getV());
			}
			
		});
//		PriorityQueue<pair> pq = new PriorityQueue<pair>();
		public Graph(int v){
			this.v = v;
			adj = new LinkedList[v];
			for(int i =0; i<v; i++){
				adj[i] = new LinkedList<Integer>();
			}
		}
		void addEdge(int u, int v){
			adj[u].add(v);
			adj[v].add(u);
		}
		
		void Bridge(){
			
			boolean[] visited = new boolean[v];
			int[] disc = new int[v];
			int[] low  = new int[v];
			int[] parent = new int[v];
			
			for(int i = 0; i<v; i++){
				parent[i] = NIL;
				visited[i] = false;
			}
			
			for(int i = 0; i<v; i++){
				if(!visited[i]){
					BridgeUtil(i,visited,disc,low,parent);
				}
			}
	
		}
		private void BridgeUtil(int u, boolean[] visited, int[] disc, int[] low, int[] parent){
			
			visited[u] = true;
			disc[u] = low[u] = ++time;
			for(int v : adj[u]){
				if(!visited[v]){
					
					parent[v] = u;
					BridgeUtil(v, visited, disc, low, parent);
					
					low[u] = Math.min(low[u],low[v]);
					
					if(low[v] > disc[u]){
						if(u < v ? pq.add(new pair(u, v)) : pq.add(new pair(v, u)));
					}
					
				}else if(parent[u] != v){
					low[u] = Math.min(low[u], disc[v]);
				}
			}
		}
		
		void print(){
			if(pq.size() == 0){
				System.out.println("No Edges");
			}else{
				System.out.println(pq.size());
				Stack<pair> st =  new Stack<pair>();
				while(!pq.isEmpty()){
					st.push(pq.peek());
					pq.poll();
				}
				while(!st.isEmpty()){
					System.out.println(st.peek().u+" "+st.peek().v);
					st.pop();
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int m =  in.nextInt();
			Graph g = new Graph(n);
			while(m-->0){
				int u = in.nextInt();
				int v = in.nextInt();
				g.addEdge(u, v);
			}
			g.Bridge();
			g.print();
		}
	}

}
