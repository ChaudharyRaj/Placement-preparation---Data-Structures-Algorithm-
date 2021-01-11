package queue;
import java.util.*;
public class EnqueueDequeue {
	static int queue[] = new int[100];
	static int front =-1;
	static int rear  = -1;
	
	
	static void enqueue(int item, int n){
		rear = (rear+1)%n;
		if(front == rear){
			return;
		}else{
			queue[rear] = item;
			if(front == -1)
				front = rear;
		}
	}
	
	static void dequeue(int n){
		
		int temp = queue[front];
		if(front == rear)
			front = rear = -1;
		front = (front+1)%n;
		return;	
	}
	static void printQueue(){
		int i=front;
		for(; i<=rear; i++){
		  System.out.print(queue[i]+" ");
		}
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++){
			int item = in.nextInt();
			enqueue(item, n);
			printQueue();
			System.out.println();
		}
		for(int i = 0; i<n-1; i++){
			dequeue(n);
			printQueue();
			System.out.println();
		}
	}
}
