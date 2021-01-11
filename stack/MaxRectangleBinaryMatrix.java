package stack;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Stack;

public class MaxRectangleBinaryMatrix {
	static class Pair{
		int num;
		int index;
		public Pair(int num, int index){
			this.num = num;
			this.index = index;
		}
	}
	
	private static int[] left(int[] arr, int n) {
		
		int minIndex = -1;
		Stack<Pair> st = new Stack<Pair>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++){
			
			if(st.isEmpty()){
				
				list.add(minIndex);
				
			}else if(!st.isEmpty() && st.peek().num < arr[i]){
				
				list.add(st.peek().index);
				
			}else if(!st.isEmpty() && st.peek().num >= arr[i]){
				
				while(!st.isEmpty()&& st.peek().num >= arr[i])
					st.pop();
				if(st.isEmpty()){
					
					list.add(minIndex);
					
				}else{
					
					list.add(st.peek().index);
				}
			}
			st.push(new Pair(arr[i],i));
			
		}
		
		int res[] = new int[n];
		for(int i = 0; i<n; i++)
			res[i] = list.get(i);
		return res;
	}
	
	private static int[] right(int[] arr, int n) {
		
		int minIndex = n;
		Stack<Pair> st = new Stack<Pair>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = n-1; i>=0; i--){
			
			if(st.isEmpty()){
				
				list.add(minIndex);
				
			}else if(!st.isEmpty() && st.peek().num < arr[i]){
				
				list.add(st.peek().index);
				
			}else if(!st.isEmpty() && st.peek().num >= arr[i]){
				
				while(!st.isEmpty()&& st.peek().num >= arr[i])
					st.pop();
				if(st.isEmpty()){
					
					list.add(minIndex);
					
				}else{
					
					list.add(st.peek().index);
				}
			}
			st.push(new Pair(arr[i],i));
		}
		
		int res[] = new int[n];
		for(int i = n-1; i>=0; i--)
			res[n-i-1] = list.get(i);
		
		return res;
	}
	private static int MAH(int[] hight, int n){
		
		int[]  left = left(hight,n);
		int[] right = right(hight,n);
		int[] width = new int[n];
		int area[] =  new int[n];
		int maxrea = 0;
		for(int i = 0; i<n; i++){
			width[i] = (right[i] - left[i])-1;
		}
		for(int i =0; i<n; i++){
			area[i] = hight[i]*width[i];
		}
		for(int i =0; i<n; i++)
			maxrea = Math.max(maxrea, area[i]);
		
		return maxrea;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int mat[][] = {
	            { 0, 1, 1, 0 },
	            { 1, 1, 1, 1 },
	            { 1, 1, 1, 1 },
	            { 1, 1, 0, 0 },
	        };
		int n = mat[0].length;
		int m = mat.length;
		int maxArea = MAH(mat[0], n);
		for(int i = 1; i<n; i++){
			for(int j = 0; j<m; j++){
				if(mat[i][j] == 1){
					mat[i][j] += mat[i-1][j];
				}
				
				maxArea = Math.max(maxArea, MAH(mat[i], n));
			}
		}
		System.out.println(maxArea);
	}

}
