package graph;
import java.util.*;
public class DetectCycle {
	int V;
	ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
	public DetectCycle(int V){
		this.V = V;
		for(int i =0; i<V; i++){
			adjList.add(i, new ArrayList<Integer>());
		}
	}
	void addEdage(int u, int v){
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	private boolean DFSUtil(ArrayList<ArrayList<Integer>> adjList, int src, boolean[] visited, int parent){
		visited[src] = true;
		for(int v : adjList.get(src)){
			if(!visited[v]){
				if(DFSUtil(adjList,v,visited,src))
					return true;
			}
			else if(v!= parent){
				return true;
			}
		}
		return false;
	}
	boolean isCycleUtill(ArrayList<ArrayList<Integer>> adjList, int V){
		boolean[] visited = new  boolean[V];
		for(int v =0; v<V; v++){
			if(!visited[v]){
				if(DFSUtil(adjList,v,visited,-1))
					return true;
			}
		}
		return false;
	}
	private boolean isCycle(){
		return isCycleUtill(adjList, V);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		DetectCycle G = new DetectCycle(N);
		while(M-->0){
			G.addEdage(in.nextInt(),in.nextInt());
		}
		if(G.isCycle()==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
