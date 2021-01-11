package stirng_practice;
import java.util.*;
import java.io.*;
import java.math.*;
public class Sum_ArrayBig {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			BigInteger sum, a;
			sum = BigInteger.valueOf(0);
		    for(int i=0;i<n;i++){
		      a = in.nextBigInteger();
		      sum = sum.add(a);
		    }
		    System.out.println(sum); 
		}
	}
}
