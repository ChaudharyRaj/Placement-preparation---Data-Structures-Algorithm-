package stirng_practice;
import java.util.*;
import java.io.*;

public class Chaturs_Exam_Paper {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String s = br.readLine();
			int i =0;
			int j = s.length()-1;
			int step = 0;
			while(i<j){
				step += Math.abs(s.charAt(i) - s.charAt(j));
				i++;
				j--;
			}
			System.out.println(step);
		}
	}
}
