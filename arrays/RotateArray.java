package arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int n  = arr.length;
		int d = 2;
		int[] temp = new int[n];
		for(int i =0; i<d; i++)
			temp[i] =arr[i];
		
		for(int i =0; i<n-d; i++)
			arr[i] = arr[i+d];
		
		for(int i =0; i<d; i++){
			arr[n-i-1] =  temp[i];
		}
		for(int i : arr)
			System.out.print(i+" ");
			
	}

}
