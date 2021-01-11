package sorting;
import java.util.*;
public class PowerSet {
	
	private static void powerSet(String str, int index, int n, String res){
		if(index == n)
			return;
		
		if(res.length()>0)
			System.out.println(res);
		
		for(int i = index+1; i<n; i++){
			res += str.charAt(i);
			powerSet(str, i, n, res);
			res = res.substring(0,res.length()-1);
		}
		return;
	}
	public static void main(String[] args) {
		
		Scanner in =  new Scanner(System.in);
		String str =  in.next();
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		powerSet(new String(arr),-1,str.length(),"");
	}

}
