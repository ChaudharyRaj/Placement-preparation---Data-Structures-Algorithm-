package searching;
import java.util.*;
public class BOXES {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int q = in.nextInt();
		while(q-->0){
			int f_a = in.nextInt();
			int f_b = in.nextInt();
			int f_c = in.nextInt();
			if(Math.min(f_a, f_b) < f_c){
				System.out.println(Math.min(f_a,f_b));
			}else{
				int sum = (f_a+f_b+f_c)/3;
				System.out.println(Math.min(sum,Math.min(f_a, f_b)));
			}
		}
		in.close();
	}

}
