package arrays;

public class roateArray_reverce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int d = 2;
		int n = arr.length-1;
		d = d%n;
		rervers(arr, 0, n);
		rervers(arr, 0,d-1);
		rervers(arr, d,n);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	static void rervers(int[] arr,int start, int end){
	 
		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
