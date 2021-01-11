package queue;
import java.util.*;
public class ReverseQueue {
	static Queue<Integer> reverse(Queue<Integer> q){
	      
      Queue<Integer> ans = new LinkedList<>();
      int n = q.size();
      for(int i = 0; i<n; i++){
        for(int j =0; j<q.size()-1; j++){
          int x = q.peek();
          q.remove();
          q.add(x);
        }
        ans.add(q.peek());
        q.remove();
      }
      return ans;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int t = in.nextInt();
	      while(t-->0){
	        Queue<Integer> q = new LinkedList<>();
	        int n =in.nextInt();
	        for(int i =0; i<n; i++){
	          q.add(in.nextInt());
	        }
	        q = reverse(q);
	        while(!q.isEmpty()){
	          System.out.print(q.peek()+" ");
	          q.remove();
	        }
	    }
	}

}
