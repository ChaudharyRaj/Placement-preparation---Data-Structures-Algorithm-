package recursion;
import java.util.*;
public class Permutation_with_Case_Change {
	private static void solve(String input, String out){
		if(input.length() == 0){
			System.out.println(out);
			return;
		}
		String opt1 = out+input.charAt(0);
		String opt2 = out+input.toUpperCase().charAt(0);
		solve(input.substring(1,input.length()),opt1);
		solve(input.substring(1,input.length()),opt2);
		return;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			String s = in.next();
			solve(s,"");
		}
	}

}
