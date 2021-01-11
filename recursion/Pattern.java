package recursion;
import java.util.*;
import java.io.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			printNum(n);
		}
	}

	private static void printNum(int n) {
		// TODO Auto-generated method stub
		System.out.print(n+" ");
		if(n<=0)
			return;
		printNum(n-5);
		System.out.print(n+" ");
	}

}
