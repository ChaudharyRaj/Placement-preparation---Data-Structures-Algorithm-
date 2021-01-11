package stack;
import java.util.*;
public class StackMainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
//			StackArray s =  new StackArray();
			StackLinkList s = new StackLinkList();
			s.push(10);
			System.out.println(s.isEmpty());
			System.out.println(s.pop());
			System.out.println(s.peek());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
