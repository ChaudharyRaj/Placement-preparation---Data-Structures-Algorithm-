package recursion;
import java.util.*;
import java.io.*;
public class crack_password {
	private static void recur(int n,int l,String out){
		if(l==0){
			System.out.println(out);
			return;
		}
		for(int i =1; i<10; i++){
			recur(n+1,l-1,out+i);
		}
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int t  = in.nextInt();
		while(t-->0){
			int l = in.nextInt();
			String pwsd ="";
			recur(1,l,"");
		}
	}
}
