package recursion;
import java.util.*;

public class Delete_Mid_of_Stack {
	
	private static void DeleteMid(Stack<Character> s,int n,int index){
		if(s.empty() || n == index){
			return;
		}
		char temp = s.pop();
		DeleteMid(s, n, index+1);
		if(index != n/2)
			s.push(temp);
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Stack<Character> st =  new Stack<Character>();
		st.push('1'); 
        st.push('2'); 
        st.push('3'); 
        st.push('4'); 
        st.push('5'); 
        st.push('6'); 
        st.push('7');
        DeleteMid(st,st.size(),0);
        while(!st.isEmpty())
        	System.out.println(st.pop());
	}
}
