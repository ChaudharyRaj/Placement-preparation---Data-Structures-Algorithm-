package recursion;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			System.out.println(findFact(n));
//			for(int i = 1; i<=n; i++){
//				fact = fact*i;
//			}
//			System.out.println(fact);
		}
		in.close();
	}

	private static long findFact(int n){
		if(n == 0)
			return 1;
		return n*findFact(n-1);
	}

}
