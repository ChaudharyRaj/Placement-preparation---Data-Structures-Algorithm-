package recursion;
import java.util.*;
public class Josephus_Problem {
	 private static  void solve(int index, int k,ArrayList<Integer> list){
        
		 if(list.size() == 1){
        	System.out.println(list.get(0));
        	return;
		}
		index =  (index+k)%list.size();
		list.remove(index);
		solve(index, k, list);
		return;    
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t-->0){
	        int n =  in.nextInt();
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for(int i= 1; i<=n; i++){
	            list.add(i);
	        }
	        int k =  in.nextInt();
	        k = k-1; 
	        solve(0,k,list);
	    }
	}

}
