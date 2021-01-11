package searching;
import java.util.*;
public class BinarySearchRecur {
	private static int B_Search(int[] arr, int low, int high, int data){
		if(low>high)
			return -1;
		int mid = low+(high -low)/2;
		if(arr[mid] == data)
			return mid;
		if(arr[mid]>data)
			return B_Search(arr, low, mid-1, data);
		else
			return B_Search(arr, mid+1, high, data);
	}
	public static void main(String[] args) {
		int[] arr = {2,3,4,6,8,9,10,15};
		int data = 10;
		int low = 0;
		int high = arr.length-1;
		int index = B_Search(arr, low, high, data);
		System.out.println(index);
	}

}
