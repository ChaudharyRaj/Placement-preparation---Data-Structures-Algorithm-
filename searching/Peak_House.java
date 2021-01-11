package searching;
import java.util.*;
public class Peak_House {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int[] a = new int[n];
			for(int i =0; i<n; i++)
				a[i] = in.nextInt();
			int index =0 ;;
			int max = Integer.MIN_VALUE;
			for(int i =0; i<n; i++){
				if(a[i] > max){
					max = a[i];
					index = i;
				}
			}
			System.out.println(index);
		}
	}

}
