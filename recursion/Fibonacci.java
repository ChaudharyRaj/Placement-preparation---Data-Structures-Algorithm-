package recursion;
import java.util.*;

public class Fibonacci {
	private static int fibonacci(int n) {
		if(n<=2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			System.out.println(fibonacci(n));
		}
	}
}
