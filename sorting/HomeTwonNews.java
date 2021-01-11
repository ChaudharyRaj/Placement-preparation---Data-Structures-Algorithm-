package sorting;
import java.util.*;
public class HomeTwonNews {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			String news[]  = new String[n];
			int[] popularityHome  = new int[999999];
			int[] popularityAwey =  new int[999999];
			int[] indexing = new  int[999999];
			int home = 0 , awey = 0;
			for(int i = 0; i<n;i++){
				news[i] =  in.next();
				int temp =  in.nextInt();
				int val  =  in.nextInt();
				if(val == 1){
					popularityHome[home++] = temp;
				}else{
					popularityAwey[awey++] = temp;
				}
				indexing[temp] = i;
				//System.out.println(indexing[temp]);
			}
			
			if(awey>0){
				Arrays.sort(popularityAwey,0,awey-1);
			}else if(home>0){
				Arrays.sort(popularityHome, 0, home-1);
			}
			if(home>0){
				for(int i = home-1; i>=0; i--){
					System.out.println(news[indexing[popularityHome[i]]]);
				}
			}
			if(awey>0){
				for(int i = awey-1; i>=0; i--){
					System.out.println(news[indexing[popularityAwey[i]]]);
				}
			}
		}
	}

}
