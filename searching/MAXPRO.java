package searching;
import java.util.*;
public class MAXPRO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
	      int t = in.nextInt();
	      while(t-->0){
	        int n = in.nextInt();
	        long a[] = new long[n];
	        for(int i =0; i<n; i++){
	            a[i] = in.nextLong(); 
	        }
	        long result = 0;
	        for(int i = 1; i<n; i++){
	        	if(a[i] > a[i-1]){
	        		result += a[i] - a[i-1];
	        		
	        	}
	        }
	        System.out.println(result);
	    }
	}
}
