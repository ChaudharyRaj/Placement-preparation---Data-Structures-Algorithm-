package recursion;
import java.util.*;
public class Permutation_with_spaces {
	private static void permutation(String inp,String op){
		 if(inp.length() == 0){
			 System.out.println(op);
			 return;
		 }
		 
		 String op1 = op;
		 String op2 = op;
		 op1 =op+" "+inp.charAt(0);
		 op2 = op2+inp.charAt(0);
		 inp = inp.substring(1,inp.length());
		 permutation(inp, op1);
		 permutation(inp, op2);
		 return;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t= in.nextInt();
		while(t-->0){
			String s = in.next();
			int n = s.length();
			String out = s.substring(0,1);
			s = s.substring(1,n);
			permutation(s,out);
		}
		in.close();
	}
}
