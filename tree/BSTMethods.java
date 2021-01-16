package tree;

public class BSTMethods {

	Node root;
	public BSTMethods(){
		root = null;
	}
	
	/*function to insert item in Binary Search Tree*/
	void add(int key){
		root = addRecur(root,key);
	}
	
	Node addRecur(Node node, int key){
		
		if(node == null){
			node = new Node(key);
			return node;
		}else if(node.item > key){
			node.left = addRecur(node.left, key);
		}else if(node.item < key){
			node.right = addRecur(node.right, key);
		}
		return node;
	}
	
	/*function to print preOrder Traversal*/
	void preOrder(Node node){
		
		if(node == null){
			return;
		}else{
			System.out.print(node.item+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	/*inOrder */
	void inOrder(Node node){
		if(node ==null)return;
		inOrder(node.left);
		System.out.print(node.item+" ");
		inOrder(node.right);
	}
	/*Function to find minimum Element in BST*/
	int fintMin(Node node){
		if(node.left == null) 
			return node.item;
		else
			return fintMin(node.left);
	}
	
	/*Function to find Maximum Element in BST*/
	int findMax(Node node){
		if(node.right == null)
			return node.item;
		else
			return findMax(node.right);
	}
	
	
	/*function to delete node in binary tree*/
	void deleteNode(int key){
		root = deleteNodeRecur(root,key);
	}

	private Node deleteNodeRecur(Node node, int key){
		
		if(node  == null) return node;
		else if(node.item > key){
			node.left = deleteNodeRecur(node.left, key);
		}else if(node.item < key){
			node.right = deleteNodeRecur(node.right, key);
		}else{
			
			if(node.left == null)
				return node.right;
			else if(node.right == null)
				return node.left;
			
			node.item = inoderPresseror(node);
			node.right = deleteNodeRecur(node.right, node.item);
		}
		return node;
	}


	private int inoderPresseror(Node node){
		int min = node.item;
		while(node.left != null){
			min = node.left.item;
			node = node.left;
		}
		return min;
	}
}
