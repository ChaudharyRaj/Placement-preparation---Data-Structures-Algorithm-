package searching;
import java.util.*;

public class MEDIAN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i<=n; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int mid = (n+1)/2;
		long cnt = 1;
		long moves = 0;
		while(moves <= k && mid <= n-1){
		
			long diff = a[mid+1] - a[mid];
			
			if(moves+diff*cnt <= k){
				moves += diff*cnt;
				//System.out.println(moves);
				cnt++;
				a[mid] = a[mid+1];
				mid++;
			}else{
				break;
			}
		}
		
		for(int i : a)
			System.out.print(i+" ");
		System.out.println();
		
		System.out.println("mid "+a[mid]);
		System.out.println("moves "+moves);
		System.out.println("count "+cnt);
		if(moves <= k){
			long left = k -moves;
			System.out.println("left "+left);
			a[mid]  += left/cnt;
		}
		System.out.println();
		System.out.println(a[mid]);
	}

}
