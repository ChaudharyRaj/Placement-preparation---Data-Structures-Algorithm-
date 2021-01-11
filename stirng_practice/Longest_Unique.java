package stirng_practice;
import java.util.*;
import java.io.*;
public class Longest_Unique {
	public static boolean areDistinct(String s, int i, int j){
		boolean visited[] = new boolean[26];
		for(int k = i; k<=j; k++){
			if(visited[s.charAt(k) - 'a'] ==true)
				return false;
			else
				visited[s.charAt(k) - 'a'] = true;
		}
		return true;
	}
	public static int longestUniqueSubsttr(String s){
		int n = s.length();
		int res = 0;
		for(int i =0; i<n; i++){
			boolean[] visited = new boolean[256]; 
			for(int j = i; j<n; j++){
				if(visited[s.charAt(j)] ==  true)
					break;
				else{
					res =  Math.max(res, j-i+1);
					visited[s.charAt(j)] = true;
				}
			}
			visited[s.charAt(i)] = false;
		}
		return res;
	}
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String s =  br.readLine();
			System.out.println(longestUniqueSubsttr(s));
		}
	}

}
