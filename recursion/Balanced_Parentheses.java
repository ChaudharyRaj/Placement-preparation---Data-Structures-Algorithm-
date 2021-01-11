package recursion;
import java.util.*;
public class Balanced_Parentheses {
	private static void solve(int open, int close,String out,Set<String> set){
		if(open == 0 && close ==0){
			set.add(out);
			return;
		}
		if(open != 0){
			String op1 = out+"(";
			solve(open-1,close,op1,set);
		}
		if(close > open){
			String op2 = out+")";
			solve(open, close-1, op2, set);
		}
		return;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int open  = n;
			int close = n;
			Set<String> set =  new HashSet<String>();
			solve(open,close,"",set);
			for(String i : set){
				System.out.println(i);
			}
		}
	}
}
