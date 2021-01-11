package stirng_practice;
import java.util.*;
import java.io.*;
public class Fake_Password {
	public static void reverse(char[] arr,int start, int end){
		
		while(start<end){
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static String LeftRotate(String s){
		char arr[] = new char[s.length()];
		for(int i=0; i<s.length();i++)
			arr[i] = s.charAt(i);
		int d = 2;
		reverse(arr, 0,d-1);
		reverse(arr, d,s.length()-1);
		reverse(arr, 0, s.length()-1);
		String res = String.valueOf(arr);
		return res;
	}
	public static String RightRotate(String s){
		char arr[] = new char[s.length()];
		for(int i=0; i<s.length();i++)
			arr[i] = s.charAt(i);
		int d = 2;
		int len = s.length();
		reverse(arr,len-d,len-1);
		reverse(arr,0,len-d-1);
		reverse(arr, 0,len-1);
		String res = String.valueOf(arr);
		return res;
	}
	
	
	
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String O = br.readLine();
			String F = br.readLine();
			String pswdl = LeftRotate(F).toLowerCase();
			String pswdr = RightRotate(F).toLowerCase();
			boolean flip = false;
			boolean flag = (O.equals(pswdr) ||O.equals(pswdl));
			if(flag)
				System.out.println("YES");
			else 
				System.out.println("No");
		}
	}
}
