package searching;
import java.util.*;
public class Books_Left {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int i =0; i<n; i++){
			a[i] =  in.nextInt(); 
		}
		int count = 0;
		for(int i = 0; i<n; i++){
			if(a[i] < k)
				count++;
			else
				break;
		}
		for(int i= n-1; i>=0; i--){
			if(a[i] < k)
				count++;
			else
				break;
		}
		System.out.println(n - count);
	}
}
