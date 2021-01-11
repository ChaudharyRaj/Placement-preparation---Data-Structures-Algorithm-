package stirng_practice;
import java.util.*;
public class First_Non_Repeating_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			
			String s = in.next();
			int frq[] = new int[26];
			int flag =0;
			for(int i=0; i<s.length(); i++){
				frq[s.charAt(i) - 97]++;
			}
			for(int i =0; i<s.length(); i++){
				if(frq[s.charAt(i) - 97]==1){
					System.out.println(s.charAt(i));
					flag =1;
					break;
				}
			}
			if(flag == 0)
				System.out.println(-1);
		}
		in.close();
	}
}
