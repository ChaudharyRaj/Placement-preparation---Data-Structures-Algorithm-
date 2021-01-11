package recursion;
import java.util.*;
import java.io.*;
public class StringReverse {
	
	public static void solve(String s){
		char arr[] = s.toCharArray();
		int n = arr.length;
		for(int i = 0; i< n/2; i++)
			swap(arr, i,n-i-1);
		for(char i : arr){
			System.out.print(i);
		}
	}
	
	public static void swap(char[] arr, int i, int j){
		// TODO Auto-generated method stub
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] =  temp;
	}
	@SuppressWarnings("unused")
	private static void reverseString(char []str, int i, int size){
		// TODO Auto-generated method stub
		swap(str, i, size-i-1);
		if(i == size/2)
			return;
		reverseString(str, i+1, size);
	} 
	private static void printReverse(String s, int i){
		// TODO Auto-generated method stub
		if(i<0)
			return;
		printReverse(s, i-1);
		System.out.print(s.charAt(i));
		printReverse(s, i-1);
	}
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String s = br.readLine();
			printReverse(s,s.length()-1);
			//solve(s);
//			int i = 0;
//			char[] str = s.toCharArray();
//			int size = str.length;
//			reverseString(str,i,size);
//			for(char i1 :str)
//				System.out.print(i1);
		}
	}

	
}
