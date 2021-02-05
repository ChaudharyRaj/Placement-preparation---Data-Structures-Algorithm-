package graph;
import java.util.*;
public class GraphTree {
	int v;
	private LinkedList<Integer> adj[];
	
	public GraphTree(int V){
		this.v = V;
		adj = new LinkedList[v]; 
		for(int i =0; i<v; i++){
			adj[i] = new LinkedList<Integer>(); 
		}
	}
	void addEdge(int u, int v){
		adj[u].add(v);
		adj[v].add(u);
	}
	
	boolean isCyclicUtil(int v ,boolean visited[], int parent){
		visited[v] = true;
		Integer i;
		Iterator<Integer> itr = adj[v].iterator();
		while(itr.hasNext()){
			i = itr.next();
			if(!visited[i]){
				if(isCyclicUtil(i, visited, v))
					return true;
			}else if(i != parent)
				return true;
		}
		return false;
	}
	
	boolean isTree(){
		
		boolean[] visited = new boolean[v];
		for(int i =0; i<v; i++)
			visited[i] = false;
		
		if(isCyclicUtil(0, visited,-1))
			return false;
		
		for(int u = 0; u<v; u++){
			if(!visited[u])
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int e = in.nextInt();
			GraphTree g = new GraphTree(n);
			
			while(e-->0){
				g.addEdge(in.nextInt(), in.nextInt());
			}
			if(g.isTree()){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
