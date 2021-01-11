package stirng_practice;
import java.util.*;
public class non_repeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find first non_repeting charectar
		String s = "bcadbcae";
		int flag = 0;
		int n = s.length();
		for(int i=0; i<n-1; i++){
			char ch = s.charAt(i);
			flag = 0;
			for(int j = i+1; j<n; j++){
				if(s.charAt(j) ==  ch){
					flag = 1;
					break;
				}
			}
			if(flag != 1){
				System.out.println(ch);
				break;
			}
		}
	}

}
