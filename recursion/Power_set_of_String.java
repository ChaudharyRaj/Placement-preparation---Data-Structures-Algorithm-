package recursion;
import java.util.*;
import java.io.*;
public class Power_set_of_String {
	private static void powerSet(String s,String str,int index,int n){
		if(index == n){
			return;
		}
		if(str.length()>0){
			System.out.println();
		}
		for(int i = index+1; i<n; i++){
			str+= s.charAt(i);
			powerSet(s,str,i,n);
			str = str.substring(0, str.length()-1);
		}
		return;
	}
	public static void main(String[] args){
		Scanner in =  new Scanner(System.in);
		String s = in.next();
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		powerSet(new String(arr),"",-1,s.length());
	}
}
