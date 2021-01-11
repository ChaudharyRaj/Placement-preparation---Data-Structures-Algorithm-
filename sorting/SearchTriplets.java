package sorting;
import java.util.*;
public class SearchTriplets {

	public static void main(String[] args){
		Scanner in =  new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int[] arr = new int[n];
			int[] hash =  new int[9999999];
			for(int i =0; i<n; i++){
				arr[i] =  in.nextInt();
				hash[arr[i]] = 1; 
			}
			Arrays.sort(arr);
			int flag = 1;
			for(int i = n-1; i>=0; i--){
				for(int j = 0; j<n; j++){
					if(arr[i]-arr[j] >= 0 && hash[arr[i] - arr[j]] >0 && arr[i]-arr[j] != arr[j]){
						System.out.println(arr[i]+" "+arr[j]+" "+(arr[i]-arr[j]));
						flag = 0;
						break;
					}
				}
				if(flag == 0)
					break;
			}
			if(flag == 1)
				System.out.println(-1);
		}
	}
}
