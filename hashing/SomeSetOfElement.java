package hashing;
import java.util.*;
public class SomeSetOfElement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =  in.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++){
			a[i] = in.nextInt();
		}
		int[] b = new int[n];
		
		for(int i =0; i<n; i++){
			b[i] = in.nextInt();
		}
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<n; i++){
			
			if(hm.get(a[i]) == null){
				
				hm.put(a[i],1);
				
			}else{
				hm.put(a[i],hm.get(a[i])+1);
			}
		}
		
		boolean flag = true;
		
		for(int i = 0; i<n; i++){
			
			if(!hm.containsKey(b[i])){
				flag = false;
				break;
			}
			if(hm.get(b[i]) == 0){
				flag = false;
				break;
			}
			hm.put(b[i],hm.get(b[i])-1);
		}
		
		if(flag == true){
			System.out.println("Both array have same data ");
		}else{
			System.out.println("Both array have Diffent data");
		}
	}

}
