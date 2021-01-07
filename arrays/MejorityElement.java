package arrays;
import java.util.*;
public class MejorityElement {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int arr[] = {1,3,2,2,3,3};
		int n = arr.length;
		int count = 1;
		int mager = 0;
		for(int i =0; i<n; i++){
			
			if(arr[mager] == arr[i])
				count++;
			else 
				count--;
			if(count == 0){
				mager = i;
				count = 1;
			}
		}
		int feq = 1;
		for(int i =0; i<n; i++)
			if(arr[i] == arr[mager])
				feq++;
		if(feq >= n/2)
			System.out.println(arr[mager]);
		else 
			System.out.println("There is no Mejority Element !");
	}
}
