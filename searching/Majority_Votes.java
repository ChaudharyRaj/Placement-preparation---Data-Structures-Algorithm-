package searching;
import java.util.*;
public class Majority_Votes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i =0; i<n; i++){
				a[i] =  in.nextInt();
			}
			HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
			for(int i :a){
				if(hm.containsKey(i)){
					hm.put(i,hm.get(i)+1);
				}else
					hm.put(i,1);
			}
			boolean flag = false;
			Set<Integer> s = hm.keySet();
			for(int item : s){
				if(hm.get(item) > n/2){
					System.out.println(item);
					flag = true;
					break;
				}
			}
			if(!flag)
				System.out.println(-1);
		}
		in.close();
	}

}
