package recursion;
import java.util.*;
public class Letter_Case_Permutation {
	private static void solve(String input,String out,List<String> list){
		if(input.length() == 0){
			list.add(out);
			return;
		}
		if(!Character.isDigit(input.charAt(0))){
			String opt1 = out+input.toLowerCase().charAt(0);
			String opt2 = out+input.toUpperCase().charAt(0);
			input =  input.substring(1,input.length());
			solve(input,opt1, list);
			solve(input,opt2,list);
		}else{
			String opt1 = out+input.charAt(0);
			input =  input.substring(1,input.length());
			solve(input, opt1, list);
		}
		return;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			String s = in.next();
			List<String> list = new ArrayList<String>();
			solve(s,"",list);
			for(String i : list){
				System.out.println(i);
			}
		}
		in.close();
	}
}
