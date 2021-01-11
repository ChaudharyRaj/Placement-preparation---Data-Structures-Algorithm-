package linkedList;
//class Node{
//	int data;
//	Node next;
//	public Node(int data){
//		this.data = data;
//		this.next = null;
//	}
//
//}
public class MyLinkedList {
	
	Node head = null;

	//Insert at begning of LinkedList
	public void InsertAtBigning(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head =  newNode;
	}
	/* move to first */
	public void movetoFirst(){
		Node SecoundLast = null;
		Node last = head;
		while(last.next != null){
			SecoundLast = last;
			last = last.next;
		}
		SecoundLast.next = null;
		last.next =  head;
		head = last;
	}
	
	
	public void EvenOdd(){
		if(isEmpty())
			return;
		
		Node evenStart = null;
		Node evenEnd   = null;
		Node oddStart  = null;
		Node oddEnd    = null;
		Node current = head;
		while(current != null){
			
			int element = current.data;
			
			if(element%2 == 0){
				if(evenStart == null){
					evenStart = current;
					evenEnd = evenStart;
				}else{
					Node newnode = new Node(element);
					newnode.next = evenStart;
					evenStart = newnode;
				}
			}else{
				
				if(oddStart == null){
					oddStart = current;
					oddEnd = oddStart;
				}else{
					oddEnd.next = current;
					oddEnd = oddEnd.next;
				}
			}
			current = current.next;
		}
		if(evenStart == null || oddStart == null)
			return;
		
		System.out.println(evenStart.data);
		oddEnd.next = evenStart;
		evenEnd.next = null;
		head = oddStart;
	}
	 // add at end
	public void addAtEnd(int data) {
		
		if(isEmpty()){
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next != null)
			current = current.next;
		Node newNode = new Node(data);
		current.next = newNode;
	}
	
	//printList Elements
	public void print(){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public void lastElementFirst(){
		Node current = head;
		Node prev = null;
		while(current.next != null){
			prev = current;
			current =  current.next;
		}
		prev.next = null;
		current.next = head;
		head = current;
		
	}
	public void removeDuplicat(){
		if(head == null || head.next == null)
			return;
		Node current =  head;
		Node next_node= null;
		
		while(current.next != null){
			
			if(current.data == current.next.data){
				next_node = current.next.next;
				current.next = next_node;
			}else
				current = current.next;
		}
	}
	public void insertValue(int data){
		
		Node newNode =  new Node(data);
		if(head == null || head.data >= newNode.data){
			 newNode.next =  head;
			 head =  newNode;
			 return;
		}else{
			Node current  = head;
			while(current != null && current.next.data < newNode.data)
				current = current.next;
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	// mid Element
	public void mid(){
		if(isEmpty()){
			System.out.println("List is Empty");
		}
		Node slow = head;
		Node fast = head;
		while(fast!= null && fast.next != null){
			slow = slow.next;
			fast =  fast.next.next;
		}
		System.out.println(slow.data);
	} 
	
	/* reverse*/
	public void reverse(){
		if(isEmpty())
			return;
		Node current = head;
		Node prev = null;
		Node next =  null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	//check is Empty
	public boolean isEmpty(){
		return head == null ? true :false;
	}
	
}

