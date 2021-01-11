package stack;
class Node{
	
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class StackLinkList {
	
	static Node head = null;
	
	/*push || insert elment into stack*/
	void push(int data){
		if(head == null){
			Node newNode = new Node(data);
			head = newNode;
		}else{
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
	}
	
	/*pop oe remove top element from stack*/
	int pop() throws Exception{
		
		if(isEmpty()){
			throw new Exception("Underflow !");
		}else{
			int element =  head.data;
			head = head.next;
			return element;
		}
	}
	
	int peek() throws Exception{
		if(isEmpty()){
			throw new Exception("Stack is Empty()");
		}
		return head.data;
	}
	boolean isEmpty(){
		return head == null;
	}
}
