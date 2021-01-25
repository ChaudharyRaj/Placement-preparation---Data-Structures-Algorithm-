package heap;
import java.util.*;
public class FascinatingMultiple {
	
	static boolean isLeaf(int i,int size){
		if(i>size/2 && i <=size)
			return true;
		return false;
	}
	
	static void max_heap(long[] arr,int i,int size){
		
		if(isLeaf(i,size)) return;
        int right=i*2+1;
        int left=i*2;
        if(right<=size){
            if(arr[i]>=arr[right]&&arr[i]>=arr[left]) return;
        }
        else{
            if(left<=size&&arr[i]>=arr[left]) return;
        }
        int largest=i;
        if(left<=size&&arr[largest]<arr[left]) largest=left;
        if(right<=size&&arr[largest]<arr[right]) largest=right;
        if(largest!=i)
        	swap(arr,largest,i);
        max_heap(arr,largest,size);
	}
	
	static void swap(long[] arr,int i, int j){
		long temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void build(long[] arr,int size){
		
		for(int i = (size/2); i>=1; i--){
			max_heap(arr,i,size);
		}
	}
	static void insert(long[] arr, int i, long value){
		arr[i] = value;
		int current = i;
		while(current> 1 && arr[current] > arr[current/2]){
			swap(arr,current,current/2);
			current = current/2;
		}
	}
	
	static long extract(long[] arr, int size){
		long temp = arr[1];
		arr[1] = arr[size];
		size--;
		max_heap(arr,1,size);
		return temp;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int mod=1000000007;
		int t =  in.nextInt();
		while(t-->0){
			int size =  in.nextInt();
			long[] arr = new long[size+1];
			arr[0] = Integer.MIN_VALUE;
			
			for(int i = 1; i<=size; i++){
				int element  = in.nextInt();
				insert(arr,i,element);
			}
			build(arr, size);
			
			while(size >1){
				if(size == 2){
					long p = arr[1];
					long Q = arr[2];
					long ans=((p*3)%mod-(Q*2)%mod)%mod;
					arr[1] = ans;
					size--;
				}else{
					long  p = extract(arr,size--);
                    long  Q = extract(arr,size--);
                    long ans=((p*3)%mod-(Q*2)%mod)%mod;
                    insert(arr,++size,ans);
				}
			}
			System.out.println(arr[1]);
			
		}
	}
}
