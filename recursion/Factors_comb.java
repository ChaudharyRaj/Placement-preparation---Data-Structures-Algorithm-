package recursion;
import java.util.*;
import java.io.*;
public class Factors_comb {
	
	public static void fact(int n, int p,String sb){
		if(n == 1)
			System.out.println(sb);
		else
			for(int i = p; i<=n; i++){
				if(n%i == 0)
					fact(n/i,i, sb+" * "+i);
			}
	}
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int  n = in.nextInt();
			int p = 2;
			String sb = "1";
			fact(n, p, sb);
		}
	}

}
