package graph;
import java.awt.Color;
import java.util.*;
public class ClanWar {
	enum color{
		WHITE, RED, GREEN
	}
	static class Graph{
		int v;
		LinkedList<Integer>[] adj;
		public Graph(int v){
			this.v = v;
			adj = new LinkedList[v];
			for(int i = 0; i<v; i++){
				adj[i] = new LinkedList<Integer>();
			}
		}
		void addEdge(int s, int d){
			adj[s].add(d);
			adj[d].add(s);
		}	
		public boolean isBipartite(Graph graph){
			
			if(graph.v == 0)
				return true;
			Color colors[] = new Color[v];
			
			for(int i = 0; i<colors.length; i++){
				colors[i] = Color.WHITE;
			}
			
			Queue<Integer> queue = new LinkedList<>();
			
			for(int sourse =0; sourse < v; sourse++){
				
				if(colors[sourse] == Color.WHITE){
					colors[sourse] = Color.RED;
					queue.add(sourse);
					
					while(!queue.isEmpty()){
						
						int v = queue.poll();
						for(int i =0; i<adj[v].size(); i++){
						int dest = adj[v].get(i);
                        if (colors[dest] == Color.WHITE) {
                            if (colors[v] == Color.RED) {                     
                            	colors[dest] = Color.GREEN;
                            } 
                            else if (colors[v] == Color.GREEN)
                            {
                            	colors[dest] = Color.RED;
                            }
                            queue.add(dest);
                        } 
                        else if (colors[v] == colors[dest]) {
		                    return false;
		                 }
					}
				}
			}	
		}
			return true;
	}
	}
	public static void main(String[] args) {
		
		Scanner in =  new Scanner(System.in);
		int t =  in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int m = in.nextInt();
			Graph g =  new Graph(n);
			while(m-->0){
				int u = in.nextInt();
				int v = in.nextInt();
				g.addEdge(u,v);
			}
			boolean result = g.isBipartite(g);
			if(result){
				System.out.println("YES");
			}else{
				System.out.println("NO");
		}
		}
	}

}
