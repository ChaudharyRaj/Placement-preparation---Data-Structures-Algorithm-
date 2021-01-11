package recursion;
import java.util.*;
import java.io.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int p = in.nextInt();
			System.out.println(findgcd(n,p));
		}
	}

	private static int findgcd(int a, int b){
		if(a==0)
			return b;
		if(b == 0)
			return a;
		if(a==b)
			return a;
		
		if(a>b)
			return findgcd(a-b, b);
		return findgcd(a, b-a);
	}

}
