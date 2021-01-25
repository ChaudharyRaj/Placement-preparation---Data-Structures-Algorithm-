package heap;

public class MaxHeap{

	int maxSize;
	int size;
	int Heap[];
	public MaxHeap(int maxSize){
		size = 0;
		this.maxSize = maxSize;
		Heap = new int[this.maxSize+1];
		Heap[0] = Integer.MAX_VALUE;
	}
	
	void insert(int element){
		Heap[++size] = element;
	}
	
	void buildheap(){
		
		int j = (int)Math.floor(size/2.0);
		for(int i = j; i >= 1; i--){
			maxHepify(Heap,i);
		}
	}

	private void maxHepify(int[] heap, int i){
		
		if(isleaf(i)){
			return;
		}
		int leftChild = 2*i;
		int rightChild = (2*i)+1;
		
		if(rightChild <= size){
			
			if(heap[i] >= heap[leftChild] && heap[i] >= heap[rightChild])
				return;
		}else{
			
			if(heap[i] >= heap[leftChild]) return;
		}
		
		int largest;
		if(leftChild<= size && heap[i] < heap[leftChild]){
			largest = leftChild;
		}else
			largest = i;
		 
		if(rightChild <= size && Heap[rightChild] > heap[largest])
			largest = rightChild;
		
		if(largest != i){
			swap(i,largest);
		}
		maxHepify(heap,largest);
	}

	private void swap(int i, int largest){
		int temp = Heap[largest];
		Heap[largest] = Heap[i];
		Heap[i] = temp;
	}

	private boolean isleaf(int pos){
		return (pos > (size/2) && (pos<=size));
	}
	
	void printHeap(){
		for(int i = 1; i<=size; i++){
			System.out.print(Heap[i]+" ");
		}
	}
	
	int extractMax(){
		
		if(size <1){
			System.out.println("heap  is Empty! ");
		}
		int max = Heap[1];
		Heap[1] = Heap[size];
		size--;
		maxHepify(Heap, 1);
		return max;
	}
	
	void Increase_Key(int i,int key){
		
		if(key < Heap[i]) return;
		Heap[i] = key;
		while( i >1 && Heap[i/2] < Heap[i]){
			swap(i/2,i);
			i = i/2;
		}
	}
}
