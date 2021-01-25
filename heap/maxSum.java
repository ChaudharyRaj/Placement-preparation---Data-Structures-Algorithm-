package heap;
import java.util.*;

public class maxSum {
	
	private static int SubarraySum(int[] a, int n, int x) {
		
		int ans  = -Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) { 
	        for (int j = i; j < n; j++){ 
	            // Keep current ans as zero
	        	//System.out.print(j+" ");
	            int curans = 0; 
	            // To store the integers which are 
	            // not part of the sub-array 
	            // currently under consideration 
	            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	  
	            // To store elements which are 
	            // part of the sub-array 
	            // currently under consideration 
	            PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
	  
	            // Create two sets 
	            for(int k = 0; k < n; k++){
	            	
	                if (k >= i && k <= j) { 
	                    curans += a[k]; 
	                    pq2.add(a[k]); 
	                } 
	                else{
	                	pq.add(a[k]);
	                }
	                     
	            }
	            //System.out.println(pq.peek()+" "+pq2.peek());
	            ans = Math.max(ans, curans); 
	             
	            // Swap at most X elements 
	            for (int k = 1; k <= x; k++){ 
	                if (pq.isEmpty() || pq2.isEmpty() || pq2.peek() >= pq.peek()) 
	                    break; 
//	                System.out.println("i "+i+" "+"j "+j);
//	                System.out.println("curans"+" "+curans+" "+pq2.peek());
	                curans -= pq2.peek();
	               
	                pq2.poll(); 
	  
	                // Add maximum of the 
	                // discarded elements 
	                curans += pq.peek(); 
	                pq.poll(); 
	  
	                // Update the answer 
	                ans = Math.max(ans, curans); 
	            } 
	        }
	        //System.out.println();
	    }
		return ans; 
	}
	public static void main(String[] args){
		
		int a[] = {5, -1, 2, 3, 4, -2, 5};
		int x = 2;
		int n = a.length;
		System.out.println(n);
		int res = SubarraySum(a,n,x);
		System.out.println(res);
	}
}
