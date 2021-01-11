package searching;

public class MaxSumSubarray {
	private static int BruteForce(int[] a, int n){
		int max = Integer.MIN_VALUE;
		for(int i =0; i<n; i++){
			int sum = 0;
			for(int j =i; j<n; j++){
				sum += a[j];
				max = Math.max(max, sum);
			}
		}
		return max;
	}
	private static int Kadanes(int[] a, int n){
		int max = a[0];
		int currmax = a[0];
		
		for(int i = 1; i<n; i++){
			currmax  = Math.max(a[i],currmax+a[i]);
			if(currmax>max)
				max = currmax;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,-20,35,40,10,-10,100,-50};
		int n = a.length;
//		int max = BruteForce(a, n);
//		System.out.println(max);
		System.out.println(Kadanes(a, n));
		
		
	}

}
