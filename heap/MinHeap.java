package heap;

public class MinHeap {
	int[] Heap;
	int maxSize;
	int size;
	private static final int FRONT = 1;
	public MinHeap(int maxSize){
		this.maxSize = maxSize;
		this.size = 0;
		Heap = new int[this.maxSize+1];
		Heap[0] = Integer.MIN_VALUE;
	}
	
	private int parent(int pos){
		return pos/2;
	}
	
	private int leftChild(int pos){
		return (2*pos);
	}
	
	private int rightChild(int pos){
		return (pos*2)+1;
	}
	
	boolean isLeaf(int pos){
		if(pos >= (size/2) && size >= pos)
			return true;
		return false;
	}
	
	private void swap(int current, int parent){
		
		int temp = Heap[current];
		Heap[current] = Heap[parent];
		Heap[parent] = temp;
	}
	
	public void insert(int element){
		
		if(size >= maxSize) return;
		Heap[++size] =  element;
		int current = size;
		while(Heap[current] < Heap[parent(current)]){
			swap(current,parent(current));
			current = parent(current);
		}
	}
	
	private void minHepify(int[] heap, int pos){
		
		
		int left = leftChild(pos);
		int right = rightChild(pos);
		int largest  = pos;
		if(left <= size && heap[left] < heap[largest]){
			largest = left;
		}
		if(right <= size && heap[right] < heap[largest])
			largest = right;
		if(largest != pos){
			swap(pos, largest);
			minHepify(heap, largest);
		}
		
//		if(!isLeaf(pos)){
//			if(heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)]){
//				if(heap[leftChild(pos)] < heap[rightChild(pos)]){
//					swap(pos, leftChild(pos));
//					minHepify(heap, leftChild(pos));
//				}else{
//					swap(pos, rightChild(pos));
//					minHepify(heap, rightChild(pos));
//				}
//			}
//		}
	}
	
	public void buildHeap(){
		
		//int j = (int)Math.floor(size/2.0);
		
		for(int i = (size/2); i >= 1; i--){
			minHepify(Heap,i);
		}
	}
	
	public int remove()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size];
        size=size-1;
        minHepify(Heap,FRONT);
        return popped;
    }
	
	public void printheap(){
		for(int i = 1; i<=size; i++)
			System.out.print(Heap[i]+" ");
	}
}
