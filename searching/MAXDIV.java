package searching;
import java.util.*;
public class MAXDIV {
	private static int gcd(int a, int b){
		
		while(a!= 0 && b != 0){
			if(b%a == 0)
				return a;
			int temp = a;
			a = b%a;
			b = temp;
		}
		return a;
	}
	private static int lowerbound(int a[], int start, int end, int key){
		
		if(start > end)
			return end;
		
		int mid = (start + end)/2;
		if(a[mid] == key)
			return mid;
		else if(a[mid] > key)
			return lowerbound(a,start, mid-1, key);
		else return lowerbound(a, mid+1, end, key);
		
	}
	private static int uperbound(int a[], int start, int end, int key){
		
		if(start > end)
			return start;
		
		int mid = (start + end)/2;
		if(a[mid] == key)
			return uperbound(a,mid+1, end, key);
		else if(a[mid] > key)
			return uperbound(a,start, mid-1, key);
		else 
			return uperbound(a,mid+1, end, key);
	}
	
	public static void main(String[] args) {
		
		Scanner in =  new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt();
		
		int g = (a<b)?gcd(a,b):gcd(b,a);
		int[] divisior = new int[9999999];
		int count = 0;
		for(int i = 1; i<=g; i++){
			if(g%i == 0)
				divisior[count++] = i;
		}
		int q = in.nextInt();
		while(q-->0){
			
			int low =  in.nextInt() , high = in.nextInt();
			
			int d1 = lowerbound(divisior,0,count-1,low);
			int d2 = uperbound(divisior,0,count-1,high);
			for (int i : divisior){
				if(i!=0)
					System.out.print(i+" ");
			}
			System.out.println();
			System.out.println(d1+"  "+d2);
			if(count == 0 || low > divisior[d1])
				d1++;
			
			int diff = d2 - d1;
			if(diff == 0)
				System.out.println("-1");
			else
				System.out.println(divisior[d2-1]);
		}
	}
}
