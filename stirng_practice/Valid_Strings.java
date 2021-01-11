package stirng_practice;
import java.util.*;
import java.io.*;
public class Valid_Strings {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t =  in.nextInt();
		while(t-->0){
			String s =  in.next();
			int count = 0;
			int step  = 0;
			int flag  = 0;
			if(s.length() %2 == 1){
				System.out.println("No");
			}else{
				for(char c : s.toCharArray()){
					if(c == '(')
						count++;
					else
						count--;
					
					if(count<0)
						step++;
					flag =1;
				}
			}
			if(flag ==1){
				if(step <=1)
					System.out.println("Yes");
				else 
					System.out.println("No");
			}
		}
		in.close();
	}

}
