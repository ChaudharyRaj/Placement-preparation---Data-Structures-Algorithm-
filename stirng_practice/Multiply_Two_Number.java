package stirng_practice;
import java.util.*;
import java.io.*;
import java.math.*;
public class Multiply_Two_Number {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String s[] =  br.readLine().trim().split("\\s");
			BigInteger a = new BigInteger(s[0]);
			BigInteger b = new BigInteger(s[1]);
			BigInteger mul;
			mul = a.multiply(b);
			System.out.println(mul.toString());
		}
	}

}
