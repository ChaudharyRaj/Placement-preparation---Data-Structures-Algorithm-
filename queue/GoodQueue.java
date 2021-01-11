package queue;
import java.util.*;
public class GoodQueue {
	
	static boolean isValid(String x){
		
	HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
	  
	    for (int i = 0; i < x.length(); i++){
	    	
	        if (mp.containsKey(x.charAt(i) - '0')){ 
	            return false; 
	        } 
	  	    else if (x.charAt(i) - '0' > 5){ 
	            return false; 
	        }
	       	else{ 
	            mp.put(x.charAt(i) - '0', 1); 
	        } 
	    } 
	    return true; 
	}
	 static void genrate(ArrayList<String> ans){
		 
		    Queue<String> q = new LinkedList<String>();
		    
		    for(int i =1; i<=5; i++){
		    	q.add(String.valueOf(i));
		    }
		    ans.add("0");
		  
		    while (!q.isEmpty()){ 
		    	
		        String x = q.peek();
		        q.remove();  
		        if (isValid(x)){ 
		            ans.add(x); 
		        } 
		
		        if (x.length() == 6)
		            continue; 
		  
		        for (int i = 0; i <= 5; i++){ 
		            String z = String.valueOf(i); 
		         
		            String temp = x + z; 
		           
		            q.add(temp); 
		        } 
		    } 
	 }
	 
	 static boolean compString(String a, String b){
		 
		 if (a.length()== b.length()){ 
		        int i = a.compareTo(b); 
		        return i < 0 ? true : false; 
		    } 
		    else
		        return a.length() < b.length(); 
	 }
	
	 static int fingCount(String l, String r){
		 
		 ArrayList<String> ans = new ArrayList<String>();
		
		    genrate(ans); 
		    
		    int count = 0; 
		   
		    for (int i = 0; i <ans.size(); i++){ 
		  
		        String x = ans.get(i);
		        
		        if (compString(l, x) && compString(x, r)){ 
		            count++; 
		        }
		        else if (x.equals(l) || x.equals(r)){ 
		            count++; 
		        } 
		    } 
		    return count; 
	 }
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			String L = in.next();
			String R  = in.next();
			System.out.println(fingCount(L,R));
			
		}
	}
}
