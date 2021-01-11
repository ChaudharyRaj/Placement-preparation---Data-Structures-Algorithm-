package queue;
import java.util.*;
public class StoneNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			Queue<Integer> q =  new LinkedList<>();
			int n =in.nextInt();
	        for(int i =1; i<=n; i++){
	          q.add(i);
	        }
			for(int i = 0; i<n-1; i++){
				int x = q.poll();
				q.add(x);
				q.poll();
			}
			System.out.println(q.peek());
		}
	}

}
