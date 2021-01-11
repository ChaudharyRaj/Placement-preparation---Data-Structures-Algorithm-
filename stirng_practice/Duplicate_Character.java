package stirng_practice;
import java.util.*;
import java.io.*;
public class Duplicate_Character {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String s = br.readLine();
			int frq[] = new int[26];
			boolean flag = false;
			for(int i =0; i<s.length(); i++){
				char ch = s.charAt(i);
				frq[ch-97]++;
			}
			for(int i =0; i<26; i++){
				if(frq[i]>1){
					flag = true;
					System.out.print((char)(i+97)+"="+frq[i]+" ");
				}
			}
			if(!flag)System.out.println(-1);
		}
	}

}
