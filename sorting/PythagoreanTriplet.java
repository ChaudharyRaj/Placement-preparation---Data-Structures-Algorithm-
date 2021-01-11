package sorting;
import java.util.*;
public class PythagoreanTriplet {

	private static boolean  isTriplet(long[] arr, int n){
		Arrays.sort(arr);
		
		for(int i = n-1; i >=2; i--){
			int l = 0;
			int r = i-1;
			while(l<r){
				if(arr[l] + arr[r] == arr[i]){
					return true;
				}
				if(arr[l] + arr[r] < arr[i])
					l++;
				else
					r--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t =  in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			long[] arr = new long[n];
			for(int i = 0; i<n;i++){
				arr[i] = in.nextLong();
				arr[i] = arr[i]*arr[i];
			}
			if(isTriplet(arr,n)){
				 System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

}
