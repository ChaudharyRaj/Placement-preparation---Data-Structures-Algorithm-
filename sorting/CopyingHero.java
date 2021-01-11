package sorting;
import java.util.*;
public class CopyingHero {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int[] arr = new int[n];
			int i;
			for(i =0; i<n;i++)
				arr[i] = in.nextInt();
			Arrays.sort(arr);
			int hero[] = new int[n];
			long result = 0;
			for(i =0; i<n;i++){
				result+= Math.abs(arr[i] - (i+1));
			}
			System.out.println(result);
		}
	}
}
