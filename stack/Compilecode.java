package stack;
import java.util.*;
public class Compilecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	      int t = in.nextInt();
	      while(t-->0){
	        int n = in.nextInt();
	        String code = in.next();
	        int op = 0;
	        int cp = 0;
	        int res = 0;
	        Stack<Character> st = new Stack<>();
	        for(int i = 0; i<n; i++){
	          char ch = code.charAt(i);
	          if(ch == '<'){
	        	  st.push(ch);
	        	  op++;
	        	  //System.out.println(ch);
	          }else if(ch == '>'){
	        	  
	    		  if(!st.isEmpty() && st.peek() == '<'){
	    			  cp++;
	    			  st.pop();
	    			  
	    		  }else{
	    			  break;
	    		  }
	          }
	          if(op==cp){
	        	  res = op+cp;
	          }
	      }
	      System.out.println(res);
	    }
	}
}
