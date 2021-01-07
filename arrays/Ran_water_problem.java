package arrays;
import java.util.*;
public class Ran_water_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 0, 2, 0, 4};
		int water = 0;
		int n =  arr.length;
		int leftHight  = arr[0];
		for(int i=1; i<n; i++){
			
			for(int j = i ; j>=0; j--)
				leftHight = Math.max(arr[j], leftHight);
			
			int rightHight = arr[i];
			for(int j = i+1; j<n; j++)
				rightHight = Math.max(arr[j], rightHight);				
			
			water += Math.min(rightHight, leftHight) - arr[i];
			//System.out.println(i+"->"+water);
		}
		System.out.println(water);
	}
}
