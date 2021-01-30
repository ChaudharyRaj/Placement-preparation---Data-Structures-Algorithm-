package graph;

public class MainClass {

	public static void main(String[] args) {
	
		Graph g = new Graph(8);
		g.addNode(50);
		g.addNode(10);
		g.addNode(200);
		g.addNode(20);
		g.addNode(15);
		g.addNode(30);
		g.addNode(5);
		g.addNode(300);
		/*now add edge*/
		g.addEdge(0,1);
		g.addEdge(0,2);
//		g.addEdge(1,4);
//		g.addEdge(1,5);
		g.addEdge(2,3);
		g.addEdge(4,5);
		g.addEdge(4,6);
		g.addEdge(5,7);
		
		System.out.println("Visted node are :");
		//g.bfs();
		System.out.println();
		g.dft(0);
	}
}
