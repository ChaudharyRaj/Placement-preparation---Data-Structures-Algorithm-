package graph;

public class QueueClass {
	int[] queue;
	int maxsize;
	int front,rear;
	public QueueClass(int maxsize){
		queue = new int[maxsize];
		this.maxsize = maxsize;
		front = rear=0;
	}
	/*function to enqueue data into queue*/
	void enqueue(int data){
		if(maxsize ==   rear)return;
		queue[rear++] = data; 
	}
	
	/*function to dequeue data  from queue*/
	int dqueue(){
		if(front ==  rear) return -1;
		return queue[front++];
	}
	
	/*function to check queue is full or not*/
	boolean isEmpty(){
		return front==rear;
	}
	
	/*function to check queue is Empty or not*/
	boolean isFull(){
		return maxsize==rear;
	}
}
