package stirng_practice;
import java.util.*;
import java.io.*;
public class Star_Character {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			int n = Integer.parseInt(br.readLine());
			int arr[][] =  new int[n][26];
			String coll[] = new String[n];
			int frq[] = new int[26];
			//Arrays.fill(frq, 1);
			for(int i=0; i<n; i++)
				coll[i]= br.readLine();
			for(int i =0; i<n; i++){
				String str = coll[i];
				for(int j=0; j<26; j++){
					char ch = (char)(j+'a');
					for(int k = 0; k < str.length(); k++){
						if(ch == str.charAt(k)){
							arr[i][j]++;
						}
					}
				}
			}
			for(int i =0;i<n; i++){
				for(int j = 0; j<26; j++){
					if(arr[i][j]>0){
						frq[j]++;
					}
				}
			}
			int count =0;
			for (int i : frq){
				if(i==n)count++;
			}
			System.out.println(count);
		}
	}

}
