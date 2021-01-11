package recursion;
import java.util.*;
public class SortStack {
	private static void insert(Stack<Integer> s, int x){
		if(s.isEmpty() || x > s.peek()){
			s.push(x);
			return;
		}
		int temp = s.pop();
		insert(s, x);
		s.push(temp);
	}
	private static void sortStack(Stack<Integer> s){
		if(!s.isEmpty()){
			int temp = s.pop();
			sortStack(s);
			insert(s,temp);
		}
	}
	private static void printStack(Stack<Integer> st){
		while(!st.isEmpty())
			System.out.println(st.pop());
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Stack<Integer> s = new Stack<Integer>();
		s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
        sortStack(s);
		printStack(s);
		in.close();
	}
}
