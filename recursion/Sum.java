package recursion;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int sum  = findSum(n);
			System.out.println(sum);
		}
	}

	private static int findSum(int n){
		// TODO Auto-generated method stub
		if(n<0)
			return 0;
		int sum = n+findSum(n-1);
		return sum;
	}

}
