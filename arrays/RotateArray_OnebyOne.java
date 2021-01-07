package arrays;
import java.util.*;
import java.io.*;
public class RotateArray_OnebyOne {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int d = 2;
		for(int i=0; i<d; i++){
			roateOnebyOne(arr);
		}
		for(int i:arr)
			System.out.println(i);
		 
	}
	static void roateOnebyOne(int arr[]){
		int n = arr.length;
		int temp  = arr[0];
		for(int i =0; i<n-1; i++)
			arr[i] = arr[i+1];
		arr[n-1] = temp;
	}
}
