package queue;

public class QueueArray {
	
	int queue[];
	int front , rear, max;
	public QueueArray(int max){
		front = rear = 0;
		this.max= max;
		queue = new int[max];
	}
	
	void enqueue(int data){
		if(max == rear){
			System.out.println("Queue if full");
		}else{
			queue[rear++] = data;
		}
		return;
	}
	
	int dequeue(){
		if(front == rear){
			System.out.println("Queue is Empty !");
			return -1;
		}else{
			return queue[front++];
		}
	}
}
