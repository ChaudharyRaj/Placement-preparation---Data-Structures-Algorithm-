package linkedList;
import java.util.*;;

public class MainClass {  
	public static void main(String[] args)throws Exception{
		Scanner in  =  new Scanner(System.in);
		int n =  in.nextInt();
		//SCLinkedList list = new SCLinkedList();
		DoublyLinkedList list = new DoublyLinkedList();
		for(int i =0; i<n; i++){
			int element = in.nextInt();
			list.add(element);
		}
//		list.print();
//		System.out.println();
		list.findPair(7);
	}
}
