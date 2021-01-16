package tree;

public class MainClass {

	public static void main(String[] args) {
		
		Treetraversal tree =  new Treetraversal();
		
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.left.left = new Node(5);
		tree.root.left.left.right = new Node(7);
		tree.root.left.left.right.right = new  Node(3);
		
		tree.root.left.right = new Node(3);
		tree.root.left.right.left = new Node(2);
		tree.root.left.right.right = new  Node(2);
		
		tree.root.right = new Node(3);
		tree.root.right.right = new Node(2);
		
		//tree.preOrder(tree.root);
		//tree.inOrder(tree.root);
		//tree.postOrder(tree.root);
		//System.out.println(tree.hight(tree.root));
		//System.out.println(tree.sizeOftree(tree.root));
		//tree.lavelOrder(tree.root);
		System.out.println();
		System.out.println(tree.findTurnCount(tree.root));
	}

}
