package recursion;
import java.util.*;

public class Prefix_with_One {
	
	private static void printString(String s, int ones, int remaing){
		
		if(0 == remaing){
			System.out.print(s+" ");
			return;
		}
		printString(s+"1", ones+1, remaing-1);
		if(0<ones)
			printString(s+"0", ones-1, remaing-1);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			String s ="";
			printString(s,0,n);
		}
	}
}
