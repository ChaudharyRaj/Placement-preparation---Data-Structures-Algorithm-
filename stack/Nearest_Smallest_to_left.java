package stack;
import java.util.*;

public class Nearest_Smallest_to_left {
	
	private static void immediateSmaller(int arr[], int n){
        
        // code here
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i = n-1; i >= 0; i--){
        	
            if(st.size() == 0){
                arr[i] = -1;
                
            }else if(st.size() > 0 && st.peek() < arr[i]){
                
            	arr[i] = st.peek();
                
            }else if(st.size() > 0 && st.peek() >= arr[i]){
                
                
                while(st.size() > 0 && st.peek() >= arr[i])
                    st.pop();
                    
                if(st.size() == 0){
                    
                    arr[i] = -1;
                    
                }else{
                    
                    arr[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        for(int i : arr)
        	System.out.print(i+" ");
        
    }
	private static void NSL(int[] arr, int n){
		
		Stack<Integer> st = new Stack<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<n; i++){
			
			if(st.size() == 0){
				list.add(-1);
				
			}else if(st.size() > 0 && st.peek() < arr[i]){
				
				list.add(st.peek());
				
			}else if(st.size() > 0 && st.peek() > arr[i]){
				
				while(st.size() > 0 && st.peek() >= arr[i])
					st.pop();
				if(st.size() ==0){
					list.add(-1);
				}else{
					list.add(st.peek());
				}
			}
			st.push(arr[i]);
		}
		
		Iterator <Integer> iter = list.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
	}
	public static void main(String[] args) {
		
		int arr [] = {4, 2, 1, 5, 3};
		int n = arr.length;
		immediateSmaller(arr,n);
		//NSL(arr,n);
	}
}
