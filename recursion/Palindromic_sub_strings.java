package recursion;
import java.util.*;
public class Palindromic_sub_strings {
	private static boolean ispallindrom(String s){
		for(int i =0;i<s.length()/2;i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1))
				return false;
		}
		return true;
	}
	private static void subString(String s,String sub){
		if(s.length() == 0){
			System.out.println(sub);
			return;
		}
		for(int i =0; i<s.length();i++){
			if(ispallindrom(s.substring(0,i+1))){
				sub = s.substring(0,i+1);
				subString(s.substring(i+1),sub);
				sub = s.substring(0,i);
			}
		}
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			String s = in.next();
			subString(s,"");
		}
	}

}
