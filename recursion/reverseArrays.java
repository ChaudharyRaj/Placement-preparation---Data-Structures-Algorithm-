package recursion;
import java.util.*;
public class reverseArrays{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int arr[] = new int[n];
			for(int i =0; i<n; i++)
				arr[i] = i;
			
			reverseArray(arr,0,n-1);
			for(int i : arr)
				System.out.print(i);
			}
	}

	private static void reverseArray(int[] arr, int start, int end){
		// TODO Auto-generated method stub
		if(start == end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end]   = temp;
		reverseArray(arr, start+1, end-1);
	}

}
