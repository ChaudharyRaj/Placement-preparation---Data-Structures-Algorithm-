package stirng_practice;
import java.util.*;
import java.io.*;
public class Noble_Vowel {
	
	public static boolean isVowel(char x){
		if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
			return true;
		return false;
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String s =br.readLine();
			int flag = 0;
			int len  = s.length();
			for(int i =0; i<s.length()-2; i++){
				if(s.charAt(i) == 'n' || isVowel(s.charAt(i))){
					continue;
				}else{
  					if(!isVowel(s.charAt(i+1))){
  						flag =1;
  						break;
  					}
  				}
			}
			if(!isVowel(s.charAt(len-1)) && s.charAt(len-1) !='n'){
				flag =1;
			}
			if(flag == 0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}

