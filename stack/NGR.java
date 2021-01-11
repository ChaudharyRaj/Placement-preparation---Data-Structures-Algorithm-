package stack;
import java.util.*;
public class NGR {
	
	private static long[] NGE(long[] arr, int n){
		
		Stack<Long> st = new Stack<>();
		ArrayList<Long>  list = new ArrayList<Long>();
		
		for(long i = n-1; i>=0; i--){
		            
            if(st.size() == 0){
                
                list.add((long) -1);
                
            }else if(st.size() > 0 && st.peek() > arr[(int) i]){
                
                list.add(st.peek());
                
            }else if(st.size() > 0 && st.peek() <= arr[(int) i]){
                
                while(st.size() != 0 && st.peek() <= arr[(int) i])
                    st.pop();
                    
                if(st.size() == 0){
                    
                    list.add((long) -1);
                    
                }else{
                    list.add(st.peek());
                }
            }
		    st.push(arr[(int) i]);
		}
		
		long[] res = new long[n];
        for(long i = n -1; i>=0; i--){
            res[(int) (n-i-1)] = list.get((int) i);
        }
        return res;
	}
	public static void main(String[] args)throws Exception{
			
			long[] a = {4, 5, 2, 25};
			int n = a.length;
			long[] res = NGE(a,n);
			for(long e : res)
				System.out.print(e+" ");
			
//		try {
//			int[] arr = {4, 5, 2, 25};
//			StackLinkList st = new StackLinkList();
//			Stack<Integer> s =  new Stack<Integer>();
//			int size = s.size();
//			System.out.println(size);
//			
//			ArrayList<Integer> res1 = new ArrayList<Integer>();
//			
//			for(int i = n-1; i>=0; i--){
//				
//				if(st.isEmpty()){
//					
//					res1.add(-1);
//					
//				}else if(!st.isEmpty() && st.peek() >  arr[i]){
//					
//					res1.add(st.peek());
//					
//				}else if(!st.isEmpty() && st.peek() <= arr[i]){
//					
//					while(!st.isEmpty() && st.peek() <= arr[i]){
//						st.pop();
//					}
//					
//					if(st.isEmpty()){
//						res1.add(-1);
//					}else{
//						res1.add(st.peek());
//					}
//				}
//				st.push(arr[i]);
//			}
//			
//			long[] result = new long[n];
//			for(int i = n-1; i>=0; i--){
//				result[n-i-1] = res1.get(i);
//			}
//			for(long e : result)
//				System.out.print(e+" ");
//			
//		}catch (Exception e) {
//			System.out.println(e);
//		}
	}
}
