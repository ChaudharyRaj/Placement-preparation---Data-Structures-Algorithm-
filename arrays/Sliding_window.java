package arrays;
import java.util.*;

public class Sliding_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		
		for(int i =0; i<n; i++)
			arr[i] = in.nextInt();
		
		int current_sum = 0;
		int max = current_sum;
		
		for(int i=0; i<k; i++)
			current_sum += arr[i];
		
		for(int i = k; i<n; i++){
			current_sum += arr[i]- arr[i-k];
			max = Math.max(current_sum, max);
		}
		System.out.println(max);
	}

}
