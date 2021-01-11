package recursion;

import java.util.Scanner;

public class Same_String {
	private static boolean recur(String s,int l,int h){
		if(l == h)
			return true;
		
		if(s.charAt(l) != s.charAt(h))
			return false;
		recur(s, l+1, h-1);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int t  = in.nextInt();
		while(t-->0){
			String s = in.next();
			int n = s.length();
			boolean flag = recur(s,0,n-1);
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
