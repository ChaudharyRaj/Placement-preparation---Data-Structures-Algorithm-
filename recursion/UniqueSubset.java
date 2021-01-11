package recursion;
import java.util.*;
public class UniqueSubset {
	private static void subsequnce(String s, String out,int index, int n,Set<String> set) {
		if(n == 0){
			if(out.length()>0)
				set.add(out);
			return;
		}
		subsequnce(s,out,index+1,n-1,set);
		subsequnce(s,out+s.charAt(index), index+1,n-1,set);
	}
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		Set<String> set = new HashSet<String>();
		while(t-->0){
			String s =  in.next();
			subsequnce(s,"",0,s.length(),set);
			for(String i: set){
				System.out.println(i);
			}
		}
	}

}
