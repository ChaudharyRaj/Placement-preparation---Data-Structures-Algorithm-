package graph;
import java.util.*;
public class NearestCell {
	
	static class Node{
		int i;
		int j;
		int distance;
		public Node(int i ,  int j, int distance){
			this.i = i;
			this.j = j;
			this.distance = distance;
		}
	}
	
	static void fintDistance(int[][] matrix){
		
		Queue<Node> queue = new LinkedList<Node>();
		int visited[][] = new int[matrix.length][matrix[0].length];
		
		for(int i=0;i<matrix.length;i=i+1)
		{
			for(int j=0;j<matrix[0].length;j=j+1)
			{
				if(matrix[i][j]==1)
				{
					visited[i][j]=1;
					matrix[i][j]=0;
					queue.add(new Node(i,j,0));
				}
			}
		}
		
		while(!queue.isEmpty())
		{
			Node temp=queue.poll();
			
			//Down
			if(isLocationValid(temp.i+1,temp.j,matrix) && visited[temp.i+1][temp.j]!=1)
			{
				if(matrix[temp.i+1][temp.j]==0)
				{
					matrix[temp.i+1][temp.j]=temp.distance+1;
				}
				visited[temp.i+1][temp.j]=1;
				queue.add(new Node(temp.i+1,temp.j,matrix[temp.i+1][temp.j]));
			}
			
			//Up
			if(isLocationValid(temp.i-1,temp.j,matrix) && visited[temp.i-1][temp.j]!=1)
			{
				if(matrix[temp.i-1][temp.j]==0)
				{
					matrix[temp.i-1][temp.j]=temp.distance+1;
				}
				visited[temp.i-1][temp.j]=1;
				queue.add(new Node(temp.i-1,temp.j,matrix[temp.i-1][temp.j]));
			}
			
			//Left
			if(isLocationValid(temp.i,temp.j-1,matrix) && visited[temp.i][temp.j-1]!=1)
			{
				if(matrix[temp.i][temp.j-1]==0)
				{
					matrix[temp.i][temp.j-1]=temp.distance+1;
				}
				visited[temp.i][temp.j-1]=1;
				queue.add(new Node(temp.i,temp.j-1,matrix[temp.i][temp.j-1]));
			}
			
			//Right
			if(isLocationValid(temp.i,temp.j+1,matrix) && visited[temp.i][temp.j+1]!=1)
			{
				if(matrix[temp.i][temp.j+1]==0)
				{
					matrix[temp.i][temp.j+1]=temp.distance+1;
				}
				visited[temp.i][temp.j+1]=1;
				queue.add(new Node(temp.i,temp.j+1,matrix[temp.i][temp.j+1]));
			}
			
		}
	}
	
	static boolean isLocationValid(int i, int j, int[][] matrix){
		if(i>=0 && i< matrix.length && j>=0 && j<matrix[0].length)
			return true;
		return false;
	}
	
	
	static void printMatrix(int[][] mat){
		for(int i =0; i<mat.length; i++){
			for(int j = 0; j<mat[0].length; j++){
				System.out.print(mat[i][j]+" ");
			}
			//System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			
			int n = in.nextInt();
			int m = in.nextInt();
			int mat[][]= new int[n][m];
			for(int j=0;j<n;j=j+1)
			{
				for(int k=0;k<m;k=k+1)
				{
					mat[j][k]=in.nextInt();
				}
			}
			fintDistance(mat);
			printMatrix(mat);
			System.out.println();
		}
	}
}
