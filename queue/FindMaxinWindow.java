package queue;
import java.util.*;
public class FindMaxinWindow {
	private static void printMax(int[] arr, int n, int k){
	   
	   Deque<Integer> Q = new LinkedList<>();
	   int i;
	   for(i = 0; i<k; ++i){
		   
		   while(!Q.isEmpty() && arr[Q.peekLast()] <= arr[i])
			   Q.removeLast();
		   Q.addLast(i);
	   }					
	   for(; i<n; i++){
		   System.out.print(arr[Q.peek()]+" ");
		   
		   while((!Q.isEmpty()) && Q.peek() <= i-k){
			   Q.removeFirst();
		   }
		   while(!Q.isEmpty() && arr[i]>= arr[Q.peekLast()]){
			   Q.removeLast();
		   }
		   Q.addLast(i);
	   }
	   System.out.print(arr[Q.peek()]);
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = in.nextInt();
		}
		printMax(arr,n,k);
	}

}
