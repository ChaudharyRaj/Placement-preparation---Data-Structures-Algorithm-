package recursion;
import java.util.*;

public class Solution_of_Equation {
	
	private static int sumEquation(int n, int z){
		int total  = 0;
		if(n==1 && z >= 0)
			return 1;
		//System.out.println("n "+n);
		for(int i= 0; i<=z; i++){
			System.out.print("z "+z+" ");
			total += sumEquation(n-1, z-i);
		}
		System.out.println();
		return total;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int z =  in.nextInt();
			sumEquation(n, z);
			//System.out.println(sumEquation(n, z));
		}
	}	
}
