package heap;
import java.util.*;

class  Pair{
	int a[] = new int[2];
	int dis;
	public Pair(int x, int y, int dis){
		a[0] = x;
		a[1] = y;
		this.dis = dis;
	}
}
public class KclosestPoints {
	
	private static void findPoints(int[][] points, int k, int n) {
		
		 PriorityQueue<Pair> queue =  new PriorityQueue<Pair>(new Comparator<Pair>(){
			 @Override
			 public int compare(Pair first, Pair second){
				 return second.dis - first.dis;
			 }
		});
		 
		 for(int i = 0; i<n; i++){
			 int x = points[i][0];
             int y = points[i][1];
             
             int dis =(int)(Math.pow(x,2)+Math.pow(y,2));
             queue.add(new Pair(x,y,dis));
             if(queue.size()>k){
            	 queue.poll();
             }
		 }
		 while(queue.size() > 0){
			 Pair pair = queue.poll();
			 System.out.print(pair.a[0] +","+pair.a[1]+"  ");
		 }
	}
	public static void main(String[] args){
		 int points[][] = { { 3, 3 }, 
                 { 5, -1 },
                 { -2, 4 } };
		 int k =2;
		 int n = points.length;
		 findPoints(points,k,n);
	}
}
