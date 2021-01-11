package stirng_practice;
import java.util.*;
import java.io.*;
public class Minus_Minus_is_Plus {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String s = br.readLine();
			String t = br.readLine();
			int flag = 0;
			int diff = 0;
			if(s.length() ==0 && t.length() == 0 || s.length() < t.length()){
				flag = 0;
			}else{
				for(int i =0; (i-diff)<t.length(); i++){
					if(t.charAt(i-diff) == '+'&& s.charAt(i) == '-' && s.charAt(i+1) == '-'){
						i++;
						diff++;
					}else if(t.charAt(i-diff) == '+' && s.charAt(i) == '+' || t.charAt(i-diff) == '-' && s.charAt(i) == '-'){
						flag = 0;
					}else{
						flag = 1;
						break;
					}
				}
			}
			if(s.length() - diff != t.length())
				flag = 1;
			
			if(flag ==  1){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
	}

}
