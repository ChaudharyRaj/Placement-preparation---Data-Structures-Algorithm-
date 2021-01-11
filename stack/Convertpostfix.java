package stack;
import java.util.*;
public class Convertpostfix {
	private static int prec(char ch){
		switch(ch){
			case '+':
				return 1;
			case '-':
				return 2;
			case '*':
				return 3;
			case '/':
				return 4;
			case '^':
				return 5;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			
			String exp = in.next();
			int n = exp.length();
			String res ="";
			Stack<Character> st = new Stack<>();
			for(int i =0; i<n; i++){
				char c = exp.charAt(i);
				
				if(Character.isLetterOrDigit(c)){
					res+= c;
					
				}else if(c == '('){
					st.push(c);
					
				}else if(c == ')'){
					while(!st.isEmpty() && st.peek() != '('){
						res+= st.pop();
					}
					st.pop();
				}else{
					while(!st.isEmpty() && prec(c) <= prec(st.peek())){
						res += st.pop();
					}
					st.push(c);
				}
			}
			
			while(!st.isEmpty()){
				res+= st.pop();
			}
			System.out.println(res);
		}
	}
}
