package sorting;
import java.util.*;
public class Quick_Sort {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t =  in.nextInt();
		while(t-->0){
			int n =  in.nextInt();
			int arr[] =  new int[n];
			for(int i =0; i<n;i++){
				arr[i] = in.nextInt();
			}
			QSort(arr,0,n-1);
			for(int e : arr)
				System.out.print(e+" ");
		}
		
	}

	private static void QSort(int[] arr,int start, int end){
		if(start>=end)
			return;
		int pivet = partition(arr,start,end);
		QSort(arr, start, pivet-1);
		QSort(arr, pivet+1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		int pivet  = arr[end];
		int i =(start-1);
		for(int j = start; j<=end-1; j++){
			if(arr[j] <= pivet){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,end);
		return i+1;
	}

	private static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
