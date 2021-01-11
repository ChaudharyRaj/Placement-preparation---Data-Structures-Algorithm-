package stack;
import java.io.*;
import java.util.*;
public class Evaluation_of_Postfix {

	public static void main(String[] args)throws Exception{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		int a = Integer.parseInt(in.readLine());
		String str[] = in.readLine().trim().split("\\s");
		int n = str.length;
		Stack<Long> st = new Stack<Long>();
		
		for(int i = 0 ; i<n; i++){
			
			String s  = str[i];
			
			if(s.equals("+")|| s.equals("-") || s.equals("*") || s.equals("/")){
				if(!st.isEmpty()){
					
					long val1 = st.pop();
					long val2 = st.pop();
					
					switch(s){
					case "+":
						st.push(val2+val1);
						break;
					case "-":
						st.push(val2-val1);
						break;
					case "*":
						st.push(val2*val1);
						break;
					case "/":
						st.push(val2/val1);
						break;
						default:
					}
				}
			}else{
				
				long val = Long.parseLong(s);
				st.push(val);
			}
			
		}
		System.out.println(st.pop());
	}

}
