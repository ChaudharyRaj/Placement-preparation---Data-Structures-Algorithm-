package stack;
import java.util.*;
public class Mass_of_molecules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //write your code here
	      Scanner in =  new Scanner(System.in);
	      String str = in.next();
	      int n = str.length();
	      Stack<Integer> s = new Stack<>();
	      
	      for(int i = 0; i<n; i++){
	        
	        char ch = str.charAt(i);
	        
	        if(ch == '('){
	          
	          s.push(-1);
	          
	        }else if(ch == ')'){
	          
	            int var = 0;
	            while(!s.isEmpty() && s.peek() != -1){
	              var += s.pop();
	            }
	            s.pop();
	            s.push(var);
	            
	        }else if(Character.isDigit(ch)){
	            int a = s.pop();
	            s.push(a*(ch-'0'));
	            
	        }else if(Character.isAlphabetic(ch)){
	            
	            if(ch == 'C'){
	              s.push(12);
	              
	            }else if(ch == 'O'){
	              s.push(16);
	              
	            }else if(ch == 'H'){
	            	
	              s.push(1);
	            }
	        }
	      }
	      int sum = 0;
	      while(!s.isEmpty()){
	    	  
	    	System.out.println(s.pop());
	    	sum+= s.pop();
	      }
	     System.out.println(sum);
	}

}
