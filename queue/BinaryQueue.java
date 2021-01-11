package queue;
import java.util.*;
public class BinaryQueue {
	static private void generateBinary(int n){
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("1");
		while(n-->0){
			String s1 = queue.peek();
			queue.remove();
			System.out.print(s1+" ");
			
			String s2 = s1;
			queue.add(s1+"0");
			queue.add(s2+"1");
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			generateBinary(n);
			System.out.println();
		}
	}
}
