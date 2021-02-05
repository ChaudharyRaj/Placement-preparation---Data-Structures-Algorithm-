package graph;
import java.util.*;

public class WarZone1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N =  in.nextInt();
		int m = in.nextInt();
		int k = 1;
		Graph g = new Graph(N);
		for(int i =0; i<N; i++){
			g.addNode(in.nextInt());
		}
		for(int i =0; i<N-1; i++){
			g.addEdge(in.nextInt(),in.nextInt());
		}
		g.bfs();
	}

}
