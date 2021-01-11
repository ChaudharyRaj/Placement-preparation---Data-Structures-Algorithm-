package stack;
import java.util.*;
import java.io.*;

public class RainWatertTrapping {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t = Integer.parseInt(br.readLine());
		 while(t-->0){
			 int n = Integer.parseInt(br.readLine());
			 String s[] = br.readLine().trim().split("\\s");
		     long[] arr = new long[n];
		     for(int i = 0; i<n; i++)
		    	 arr[i] = Long.parseLong(s[i]);
		     long[] left = new long[n];
			    long[] right =new long[n];
			    long sum = 0;
			    
			    right[n-1] = arr[n-1];
			    for(int  i = n-2; i>=0; i--){
				    right[i] = Math.max(right[i+1],arr[i]);
			    }
			    left[0] = arr[0];
	    		for(int i = 1; i<n; i++){
	    			left[i] = Math.max(left[i-1], arr[i]);
	    		}
	    		long[] water = new long[n];
	    		for(int i = 0; i<n; i++){
	    			water[i] = Math.min(left[i],right[i])-arr[i];
	    			sum += water[i];
	    		}
			    System.out.println(sum);   
		 }
	}

}
