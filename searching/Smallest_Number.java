package searching;
import java.util.*;
public class Smallest_Number {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++)
			a[i] =  in.nextInt();
		int k = in.nextInt();
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i<n; i++){
			if(hm.containsKey(a[i])){
				hm.put(i,hm.get(a[i])+1);
			}
			else
				hm.put(a[i],1);
		}
		int res =  Integer.MAX_VALUE;

		for(int i : hm.keySet()){
			if(hm.get(i) == k)
				res =  Math.min(res, i);
		}
		if(res != Integer.MAX_VALUE)
			System.out.println(res);
	}

}
