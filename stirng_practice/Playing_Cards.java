package stirng_practice;
import java.util.*;
import java.io.*;
public class Playing_Cards {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new  Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			String card = in.next();
			int flag =0;
			for(int i = 0; i<5; i++){
				String on_hand = in.next();
				if(card.charAt(0) == on_hand.charAt(0) || card.charAt(1) == on_hand.charAt(1)){
					flag = 1;
				}
			}
			if(flag == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
