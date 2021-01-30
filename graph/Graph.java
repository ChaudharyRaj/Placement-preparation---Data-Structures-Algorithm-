package graph;
public class Graph{
	private Node[] nodeList;
	private int[][] adjMatrixl;
	private int NumberNode;
	private QueueClass queue;
	
	public Graph(int size){
		int MaxNodes = size;
		this.nodeList = new Node[MaxNodes];
		this.adjMatrixl = new int[MaxNodes][MaxNodes];
		NumberNode = 0;
		queue = new QueueClass(MaxNodes);
	}
	
	/*function to add Node in Graph*/
	void addNode(int elemnt){
		nodeList[NumberNode++] = new Node(elemnt);
	}
	
	/*function to add adage between two node*/
	void addEdge(int start, int end){
		adjMatrixl[start][end] = 1;
		adjMatrixl[end][start] = 1;
	}
	
	private void printNode(int index){
		System.out.println(nodeList[index].data+" ");
	}
	
	private int getAdjVisitesNode(int node){
		for(int j = 0; j<NumberNode; j++){
			if(adjMatrixl[node][j] == 1 && nodeList[j].vidited == false){
				return j;
			}
		}
		return -1;
	}
	
	
	/*Method to traverse graph through BFS */
	void bfs(){
		nodeList[0].vidited = true;
		printNode(0);
		queue.enqueue(0);
		int node1;
		while(!queue.isEmpty()){
			int node2 = queue.dqueue();
			while((node1 = getAdjVisitesNode(node2)) != -1){
				nodeList[node1].vidited = true;
				printNode(node1);
				queue.enqueue(node1);
			}
		}
		
	}
	
	/*Method to traverse graph through DFS */
	void dfs(int n){
		nodeList[n].vidited = true;
		printNode(n);
		int node1;
		while( (node1 = getAdjVisitesNode(n))!= -1){
			dfs(node1);
		}
	}
	/*Methods to print all nodes through dfs*/
	void dft(int n){
		for(int i =0; i<NumberNode; i++){
			if(!nodeList[i].vidited){
				dfs(i);
			}
		}
	}	
}
