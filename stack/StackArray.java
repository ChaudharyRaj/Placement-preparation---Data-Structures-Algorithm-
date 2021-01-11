package stack;

public class StackArray {
	static int max = 1000;
	static int arr[] = new int[max];
	static int i = -1;
	
	/*insert data into stack*/
	static void push(int data)throws Exception{
		if(i == max-1){
			throw new Exception("Stack Overflow !");
		}else
			arr[++i] = data;
	}
	
	/*pop or remove data from stack*/
	static int pop()throws Exception{
		if(i <0){
			throw new Exception("Stack Underflow!");
		}else
			return arr[i--];
	}
	
	/*return top element from stack*/
	static int peek()throws Exception{
		if(i <0){
			 throw new Exception("Stack is Empty()");
		}else
			return arr[i];
	}
	
	/*check is stack empty or not*/
	static boolean isEmpty(){
		return i<0;
	}
	/*check is stack full not */
	static boolean isFull(){
		return i == max-1;
	}
	
}
