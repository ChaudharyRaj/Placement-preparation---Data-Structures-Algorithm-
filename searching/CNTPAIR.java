package searching;
import java.util.*;
public class CNTPAIR {
	private static int findPair(int[] a, int k, int n){
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i = 0; i<n; i++){
			int x = a[i]; 
			hm.put(x,hm.getOrDefault(x,0)+1);
		}
		//System.out.println(hm);
		for(int i = 0; i<n; i++){
			int x1 = a[i]-k;
			System.out.println("x1: "+x1);
			if(hm.containsKey(x1)){
				count+= hm.get(x1);
				System.out.println("count "+count+" "+x1);
				
			}
		}
		
		return count;
	}
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
  		int k = in.nextInt();
  		int[] a = new int[n];
  		for(int i =0; i<n; i++){
  			a[i] = in.nextInt();
  		}
  		int count = findPair(a,k,n);
  		//System.out.println(count);
  		in.close();
	}
}
