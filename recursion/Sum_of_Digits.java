package recursion;
import java.util.*;
public class Sum_of_Digits {
	private static int findSum(int n){
		if(n == 0){
			//System.out.println(sum);
			return 0;
		}
		int rem = n%10;
		return rem +findSum(n/10);
		
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			System.out.println(findSum(n));
		}
		in.close();
	}
}
