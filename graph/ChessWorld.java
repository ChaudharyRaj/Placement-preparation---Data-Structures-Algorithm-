package graph;
import java.util.*;
public class ChessWorld{
	
	static class coordinate{
		int x;
		int y;
		public coordinate(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	static boolean isValid(int x, int y, int n, int m){
		if (x <= 0 || y <= 0 || x > n || y > m) {
            return false;
        }
        return true;
	}
	
	private static int KnightMoves(int n, int m, int x1, int y1, int x2, int y2){
		
		int[] dx = {-1, -2, -1, -2, 1, 2, 1, 2};
        int[] dy = {-2, -1, 2, 1, -2, -1, 2, 1};
		boolean visited[][] = new boolean[n+1][m+1];
		Queue<coordinate> queue = new LinkedList<coordinate>();
		queue.add(new coordinate(x1, y1));
		visited[x1][y1] = true;
		int  moveCount = 0;
		while(!queue.isEmpty()){
			int nodeAtCurrentBreath = queue.size();
			for(int count =0; count<nodeAtCurrentBreath; count++){
				coordinate current = queue.remove();
				if(current.x == x2 && current.y == y2){
					return moveCount;
				}
				for(int i = 0; i<8; i++){
					if(isValid(current.x + dx[i], current.y + dy[i],n,m) && 
							visited[current.x + dx[i]][current.y + dy[i]] == false){
						queue.add(new coordinate(current.x + dx[i], current.y + dy[i]));
						visited[current.x+ dx[i]][current.y + dy[i]] = true;
					}
				}
			}
			moveCount++;
		}
		return -1;
	}
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = 1000;
			int m = 1000;
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = 1;
			int y2 = 1;
			int res = KnightMoves(n,m,x1,y1,x2,y2);
			System.out.println(res);
		}
	}

}
