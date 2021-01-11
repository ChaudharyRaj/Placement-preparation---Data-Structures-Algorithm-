package linkedList;
public class DoublyLinkedList {

	DNode head = null;
	
	
	/*insert a new node at the beginning */
	void add(int data){
		DNode newnode = new DNode(data);
		
		if(isEmpty()){
			(head) =  newnode;
		}else{
			newnode.next = head;
			(head).prev = newnode;
			(head) = newnode;
		}
		return;
	}
	/*Find Pair in list*/
	void findPair(int value)throws Exception{
		if(isEmpty()){
			throw new Exception("List is Empty");
		}else{
			DNode first = head;
			DNode second  = head;
			while(second.next != null)
				second = second.next;

			boolean found = false;
			while (first != null && second != null && first != second && second.next != first){ 
			        // pair found 
			        if ((first.data + second.data) == value) { 
			            found = true; 
			            System.out.println( "(" + first.data + 
			                                ", "+ second.data + ")" ); 
			 
			            // move first in forward direction 
			            first = first.next; 
			 
			            // move second in backward direction 
			            second = second.prev; 
			        } 
			        else
			        { 
			            if ((first.data + second.data) < value) 
			                first = first.next; 
			            else
			                second = second.prev; 
			        } 
			} 
			if(found == false)
				System.out.println("Pair is not found !");
		}
	}
	
	
	/*print Doubly LinedList*/
	void print()throws Exception{
		if(isEmpty()){
			throw new Exception("List is Empty");
		}else{
			DNode current = head;
			while(current != null){
				System.out.print(current.data+" ");
				current = current.next;
			}
		}
	}
	
	
	/*chekc is empty*/
	boolean isEmpty(){
		return head == null;
	}
}
