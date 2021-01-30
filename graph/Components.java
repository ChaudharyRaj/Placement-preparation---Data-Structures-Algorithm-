package graph;
import java.util.*;

public class Components {
	int V;
	ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
	
	public Components(int V){
		this.V = V;
		adjList = new ArrayList<ArrayList<Integer>>();	
		for(int i = 0; i<V; i++){
			adjList.add(i,new ArrayList<Integer>());
		}
	}
	
	private void addEdage(int s, int d){
		adjList.get(s).add(d);
		adjList.get(d).add(s);
	}
	
	private void DFS(int v, boolean[] visited) {
		
		visited[v] = true;
		for(int x : adjList.get(v)){
			if(!visited[x]){
				DFS(x, visited);
			}
		}
	}
	
	int countCompenent(){
		boolean[] visited = new boolean[V]; 
		int count = 0;
		for(int v = 0; v<V; v++){
			if(!visited[v]){
				DFS(v,visited);
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int N = in.nextInt();
			int E = in.nextInt();
			Components C = new Components(N);
			while(E-->0){
				int s = in.nextInt();
				int d = in.nextInt();
				C.addEdage(s, d);
			}
			System.out.println(C.countCompenent());
		}
	}

}
