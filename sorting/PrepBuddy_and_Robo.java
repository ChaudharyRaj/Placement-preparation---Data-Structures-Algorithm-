/*
PrepBuddy has built a robot called ROBO. We give an unordered set of digits 
N(for example 
(4321))to ROBO and ask if it is possible to arrange those digits in ordered fashion 
(1234),but the catch is digits can be arranged in this fashion only if digits are continuous.
Given a set of digits print 'YES' if the arrangement is possible else print 'NO'.
*/  
package sorting;
import java.util.*;
public class PrepBuddy_and_Robo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			long num = in.nextLong();
			long n = num;
			int size = 0;
			while(n != 0){ size++; n = n/10;}
			long[] arr =  new long[size];
			int i = 0;
			while(num != 0){
				long digit = num%10;
				arr[i++] = digit;
				num = num/10;
			}
			Arrays.sort(arr);
			boolean flag = true;
			for(i = 0; i<size-1; i++){
				if(arr[i]+1 != arr[i+1]){
					flag = false;
					break;
				}
					
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
