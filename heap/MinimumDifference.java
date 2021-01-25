package heap;
import java.io.IOException;
import java.util.*;
public class MinimumDifference {
	private static class pair{
	      Integer key;
	      Integer value;
	      public pair(Integer key, Integer value){
	        this.key =  key;
	        this.value = value;
	      }
	      
	      Integer getKey(){
	        return key;
	      }
	      Integer getValue(){
	        return value;
	      }
	    }
	    private static void getClosest(int[]  arr, int Q, int x){
	      
	      PriorityQueue<pair> queue = new PriorityQueue<pair>(new Comparator<pair>(){
	        @Override
	          public int compare(pair o1, pair o2){
	            return o1.getValue().compareTo(o2.getValue());
	          }
	      });
	      
	      for(int i =0; i<Q; i++){
	        queue.add(new pair(arr[i], Math.abs(arr[i] - x)));
	      }
	      
	      for(int i = Q; i<arr.length; i++){
	        
	        int diff = Math.abs(arr[i]-x);
	        if(diff > queue.peek().getValue()) continue;
	        
	        queue.poll();
	        queue.add(new pair(arr[i],diff));
	      }
	      while(queue.size()>0){
	        System.out.print(queue.poll().getKey()+" ");
	      }
	    }
	    public static void main(String args[]) throws IOException{
	      //write your code here
	      Scanner in  = new Scanner(System.in);
	      int t = in.nextInt();
	      while(t-->0){
	        int n = in.nextInt();
	        int p =  in.nextInt();
	        int Q = in.nextInt();
	        int arr[] = new int[n];
	        for(int i = 0; i<n; i++){
	          arr[i] = in.nextInt();
	        }
	        getClosest(arr,Q,p);
	        System.out.println();
	      }
	    }
}
