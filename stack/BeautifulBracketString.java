package stack;
import java.util.*;
public class BeautifulBracketString {
	
	private static int Beautiful(String exp){
		
		int len = exp.length();
		if(len%2 != 0)
			return -1;
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i<len; i++){
			
			char ch = exp.charAt(i);
			if(ch == '}'&& !st.isEmpty()){
				
				if(st.peek() == '{')
					st.pop();
				else
					st.push(ch);
			}else{
				st.push(ch);
			}
		}
		int newlen = st.size();
		int n = 0;
		
		while(!st.isEmpty() && st.peek() == '{'){
			st.pop();
			n++;
		}
		return (newlen/2+n%2);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = 1;
		while(in.hasNext()){
			String exp = in.next();
			if(exp.charAt(0) == '-')break;
			
			int res = Beautiful(exp);
			System.out.println(count++ +"."+res);
		}
	}

}
