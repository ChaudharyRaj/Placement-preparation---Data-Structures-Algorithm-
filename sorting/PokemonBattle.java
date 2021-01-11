package sorting;
import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			
			int n =  in.nextInt();
			int[] A = new int[n];
			for(int i = 0; i<n; i++){
				A[i] = in.nextInt();
			}
			int[] D = new int[n];
			for(int j = 0; j<n; j++){
				D[j] = in.nextInt();
			}
			Arrays.sort(A);
			Arrays.sort(D);
			int i = 0,j =0;
			int res = 0;
			while(i<n && j<n){
				if(A[i] > D[j]){
					res++;
					i++;
					j++;
					
				}else
					i++;
			}
			System.out.println(res);
		}
	}

}
