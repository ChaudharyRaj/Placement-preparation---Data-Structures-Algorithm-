package queue;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		QueueArray q = new QueueArray(10);
		
		q.enqueue(10);
		q.enqueue(11);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
	}

}
