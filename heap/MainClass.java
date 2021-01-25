package heap;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		MaxHeap maxheap = new MaxHeap(n);
//		
//		for(int i = 1; i<=n; i++){
//			int element = in.nextInt();
//			maxheap.insert(element);
//		}
//		maxheap.buildheap();
//		System.out.println();
//		maxheap.printHeap();
//		System.out.println();
//		//System.out.println(maxheap.extractMax());
//		//maxheap.printHeap();
//		maxheap.Increase_Key(5, 400);
//		System.out.println();
//		maxheap.printHeap();
		
		MinHeap minHeap = new MinHeap(n);
		for(int i =1; i<=n; i++){
			minHeap.insert(in.nextInt());
		}
//		System.out.println("Beffor");
//		minHeap.printheap();
		minHeap.buildHeap();
		System.out.println();
		System.out.print(minHeap.remove()+" ");
		minHeap.printheap();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	10
//	1 17 10 3 8 15 9 2 13 6
}
