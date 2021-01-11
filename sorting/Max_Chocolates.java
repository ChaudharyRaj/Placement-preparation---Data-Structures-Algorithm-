package sorting;
import java.util.*;
public class Max_Chocolates {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t =  in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			Integer[] a = new Integer[n];
			for(int i =0 ; i<n; i++){
				a[i] = in.nextInt();
			}
			Arrays.sort(a,Collections.reverseOrder());
			int max = 0;
			for(int i = 0; i<n; i++){
				if(i%2 ==0){
					max += a[i];
				}
			}
			System.out.println(max);
		}
	}

}
