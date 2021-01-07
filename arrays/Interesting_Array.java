package arrays;
import java.util.*;
import java.io.*;
public class Interesting_Array {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	      int n =  in.nextInt();
	      int age[] = new int[n];
	  	  for(int i = 0; i<n; i++)
	  		age[i] = in.nextInt();
	  	  int count[] = new int[121];
	  	  for(int i=0; i<n; i++)
	  		count[age[i]]++;
	  	  int ans = 0;
		  for(int ageA = 0; ageA<=120; ageA++) {
			int countA = count[ageA];
			for(int ageB = 0; ageB <= 120; ageB++){
				int countB = count[ageB];
				if (ageA * 0.5 + 7 >= ageB) continue;
				if(ageA < ageB)continue;
				if(ageA < 100 && ageB > 100)continue;
				ans += countA*countB;
				if(ageA == ageB) ans -= countA;
			}
		}
		System.out.println(ans);
	}
}
