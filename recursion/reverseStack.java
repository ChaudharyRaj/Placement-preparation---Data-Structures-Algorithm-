package recursion;
import java.util.*;
public class reverseStack {
	private static void insertBack(Stack<Character> s, char item){
		if(s.size() == 0){
			s.push(item);
		}
		char temp = s.pop();
		insertBack(s, item);
		s.push(temp);
	}
	private static void reverse(Stack<Character> s){
		if(s.size() > 0)
			return;
		char item = s.pop();
		reverse(s);
		insertBack(s,item);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st =  new Stack<Character>();
		st.push('1');  
        st.push('2');  
        st.push('3');  
        st.push('4');   
        reverse(st);
        while(!st.isEmpty())
        	System.out.print(st.pop()+" ");
	}

}
