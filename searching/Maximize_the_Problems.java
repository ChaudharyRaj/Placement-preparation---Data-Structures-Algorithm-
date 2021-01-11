package searching;
import java.util.*;
public class Maximize_the_Problems {
	static int ans = 0;
	private static int b_search(int low, int high, int n,int k){
		if(low>high)
			return ans;
		int mid = low+(high-low)/2;
		int t_time  = mid*(mid + 1)/2;
		t_time  = t_time*5;
		if(t_time<k){
			ans = mid;
			return b_search(mid+1,high, ans, k);
		}else
			return b_search(low, mid-1, ans, k);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k =  in.nextInt();
		k = 240 - k;
		int res = b_search(1, n, n, k);
		System.out.println(res);
//		int count = 0;
//		int sum = 0;
//		for(int i = 1; i<=n; i++){
//			int prob = 5*i;
//			if(sum + prob <= k){
//				sum+= prob;
//				count = count+1;
//			}else
//				break;
//				
//		}
//		System.out.println(count);
//		in.close();
	}

}
