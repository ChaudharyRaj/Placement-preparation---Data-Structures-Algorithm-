/* Mathematics marks of N students are arranged in an array and two teachers are forming a team each for Maths Olympiad. 
They select students turn wise, in each turn, they select a student marks and removes it from the array. This goes on until only one mark is left in the array. Considering teacher1 takes the first turn, can you tell us which mark will be left in the array after 
N −1 turns. Initially, there are  N integers written on the board. Each turn a player selects one number and erases it from the board. This continues until there is only one number left on the board, i.e. 
N − 1 turns are made. The first player makes the first move, then players alternate turns.
The first player wants to minimize the last number that would be left on the board, while the second player wants to maximize it.
You want to know what number will be left on the board after N− 1
 turns if both players make optimal moves.*/

package sorting;
import java.util.*;
public class GAME1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
	      int t = in.nextInt();
	      while(t-->0){
	        int n = in.nextInt();
	        Integer[] arr = new Integer[n];
	        for(int i = 0; i<n; i++){
	        	arr[i] = in.nextInt();
	        }
	        Arrays.sort(arr);
	        if(n%2==0){
	        	System.out.println(arr[n/2-1]);
	        }else{
	        	System.out.println(arr[n/2]);
	        }
	      }
	}

}
