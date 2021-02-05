package graph;
import java.util.*;
public class LongestPath {
	static class clan{
		int blue;
		int red;
		public clan(int blue, int red) {
			this.red = red;
			this.blue = blue;
		}
	}	
	static class pair<T,V>{
		T first;
		V secound;
		public pair(T first, V secound){
			this.first = first;
			this.secound = secound;
		}
	}
	
	static class Graph{
		int v;
		LinkedList<Integer> adj[];
		
		public Graph(int v) {
			this.v = v;
			adj = new LinkedList[v];
			for(int i =0; i<v; i++){
				adj[i] = new LinkedList<Integer>();
			}
		}
		
		void addEdge(int u , int v){
			 adj[u].add(v);
			 adj[v].add(u);
		 }
		
		pair<Integer, Integer> bfs(int u){
			 
			 int dis[] = new int[v];
			 
			 Arrays.fill(dis,-1);
			 Queue<Integer> q = new LinkedList<>();
			 q.add(u);
			 dis[u] = 0;
			 while(!q.isEmpty()){
				 
				 int t = q.poll();
				 for(int i =0; i< adj[t].size(); i++){
					 int v = adj[t].get(i);
					 if(dis[v] == -1){
						 q.add(v);
						 dis[v] = dis[t]+1;
					 }
				 } 
			 }
			 
			 int maxDis = 0;
			 int nodeIndx = 0;
			 for(int i =0; i<v; i++){
				 if(dis[i] > maxDis){
					 maxDis = dis[i];
					 nodeIndx = i;
				 }
			 }
			return new pair<Integer, Integer>(nodeIndx,maxDis);
		 }
		 void longestPathLenght(){
			 pair<Integer,Integer> t1,t2;
			 t1 = bfs(0);
			 t2 = bfs(t1.first);
			 System.out.println(t2.secound);
		 }
	}	 
	
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int m = in.nextInt();
			Graph g = new Graph(n);
			while(m-->0){
				g.addEdge(in.nextInt(),in.nextInt());
			}
			g.longestPathLenght();
		}
	}

}
