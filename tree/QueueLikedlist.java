package tree;
public class QueueLikedlist {
	class Node <E>{
		E data;
		Node next;
		public Node(E data){
			this.data = data;
			this.next = null;
		}
	}
	Node front,rear;
	
	/*function of enqueue*/
	public void enqueue(int data){
		Node newnode = new Node(data);
		if(rear == null){
			newnode.next = rear;
			rear = newnode;
			front = rear;
			return;
		}else{
			rear.next = newnode;
			rear = newnode;
		}
	}
	
	/*function of dequeue*/
	public void dequeue(){
		if(front  == null)
			return;
		else{
			Node temp = front;
			front = front.next;
		}
		if(front == null)
			rear = null;
	}
}
