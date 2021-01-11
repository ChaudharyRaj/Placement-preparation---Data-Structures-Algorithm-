package queue;
import java.util.*;
public class TruckCircularRoute {
	static class petrolPump{
		long petrol;
		long distance;
		public petrolPump(long petrol , long distance){
			this.petrol  = petrol;
			this.distance = distance;
		}
	}
	
	private static int initialTour(petrolPump[] arr, int n){
		
		int start = 0;
		int end = 1;
		long curr_petr = arr[start].petrol - arr[start].distance;
		
		while(start != end || curr_petr < 0 ){
			
			while(curr_petr < 0 && start != end){
				
				curr_petr-= arr[start].petrol - arr[start].distance;
				start = (start+1)%n;
				if(start == 0)
					return-1;
			}
			
			curr_petr += arr[end].petrol-arr[end].distance;
			end = (end+1)%n;		
		}
		
		return start;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		petrolPump[] arr = new petrolPump[n];
		long[] gas = new long[n];
		long[] cost = new long[n];
		
		for(int i = 0; i<n; i++)
			gas[i] = in.nextLong();
		
		for(int i = 0; i<n; i++)
			cost[i] = in.nextLong();
		
		for(int i =0; i<n; i++){
			arr[i] = (new petrolPump(gas[i],cost[i]));
		}
		
		int start = initialTour(arr,arr.length);
		System.out.println(start);
	}
}
