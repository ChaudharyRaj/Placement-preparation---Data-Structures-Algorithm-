package recursion;
import java.util.*;
public class more_one_than_zero {
	private static void solve(int one, int zero,String out, int n){
		if(n == 0){
			System.out.println(out);
			return;
		}
		solve(one+1, zero, out+"1", n-1);
		if(one > zero){
			solve(one, zero+1, out+"0", n-1);
		}
		return;
	}
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int t =  in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			solve(0,0,"",n);
		}
	}
}
