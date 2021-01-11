package linkedList;
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class SCLinkedList {
	
	Node head = null;
	
	boolean isEmpty(){
		return head == null;
	}
	
	/*Insert at begning or linkedList*/
	void addAtBegning(int data){
		
		Node newNode = new  Node(data);
		newNode.next  = head;
		if(head != null){
			Node temp = head;
			while(temp.next != head)
				temp = temp.next;
			temp.next = newNode;
		}else{
			newNode.next = newNode;
		}
		head = newNode;
	}
	/*Deletion from a Circular Linked List*/
	void deleteNode(int key)throws Exception{
		if(isEmpty()){
			throw new Exception("List is Empty !");
		}else{
			
			Node prev = null;
			Node curr = head;
			while(curr.data != key){
				if(curr.next == head){
					throw new Exception("Element not found");
				}
				prev = curr;
				curr = curr.next;
			}
			
			/* Check if node is only node*/
			if(curr == head && curr.next == head){
				head = null;
				return;
			}
			
			/*If more than one node, and check if it is first node*/
			if(curr == head){
				prev = head;
				while(prev.next != head)
					prev = prev.next;
				head = head.next;
				prev.next = head;
				
			}
			
			/* check if node is last node*/
			else if(curr.next == head){
				prev.next = head;
			}else{
				prev.next = curr.next;
			}
			return;
		}
	}
	
	/*print list*/
	void print()throws Exception{
		
		if(isEmpty()){
			throw new Exception("List is empty !");
		}else{
			Node current  = head;
			do{
				System.out.print(current.data+" ");
				current  = current.next;
			}while(current!= head);
		}
	}
	
}
