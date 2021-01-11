package searching;
public class BinarySearch {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,4,6,8,9,10,15};
		int data = 11;
		int low = 0;
		int high = arr.length-1;
		int flag = 0;
		while(low<high){
			int mid = low+(high - low)/2;
			if(arr[mid] == data){
				flag  = 1;
				System.out.println(mid);
				break;
			}else if(arr[mid] > data){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}
		if(flag == 0 )
			System.out.println("not found !");
	}
}
