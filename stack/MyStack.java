package stack;
import java.util.*;

public class MyStack<T>{
	
	public class StackNode<T>{
		private T data;
		private StackNode<T> next;
		public StackNode(T data){
			this.data = data;
		}
	}
	
	private StackNode<T> top;
	
	
	/*removing item from top of stack */
	public T pop(){
		if(top ==null) throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
	}
	
	/*adding new item on top of stack*/
	public void push(T item){
		StackNode<T> newnode = new StackNode<>(item);
		newnode.next = top;
		top =  newnode;
	}
	
	/*returig item top of stack*/
	public T peek(){
		if(top == null) throw new EmptyStackException();
		return top.data;
	}
	
	/*is Empty or not*/
	public boolean isEmpty(){
		return top == null;
	}	
}
