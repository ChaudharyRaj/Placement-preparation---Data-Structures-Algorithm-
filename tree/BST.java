package tree;
import java.util.*;
public class BST {

	public static void main(String[] args) {
		
		BSTMethods tree = new BSTMethods();
		tree.add(25);
		tree.add(12);
		tree.add(11);
		tree.add(13);
		tree.add(26);
		tree.add(15);
		tree.add(16);
		tree.add(27);
		tree.add(38);
		tree.add(20);
		tree.add(19);
		tree.preOrder(tree.root);
		System.out.println();
//		System.out.println(tree.fintMin(tree.root));
//		System.out.println(tree.findMax(tree.root));
		tree.deleteNode(16);
		tree.inOrder(tree.root);
	}

}
