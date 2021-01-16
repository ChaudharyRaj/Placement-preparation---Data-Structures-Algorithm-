package tree;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Treetraversal{

	Node root;
	public Treetraversal(){
		root = null;
	}
	
	/*Function PreOder Traversal of tree*/
	public void preOrder(Node root){
		if(root == null)
			return;
		
		System.out.print(root.item+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	/*Function InOrder Traversal of tree*/
	public void inOrder(Node root){
		
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.item+" ");
		inOrder(root.right);
	}
	
	/*Post Order Traversal of tree*/
	public void postOrder(Node root){
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.item+" ");
	}
	
	/*function of return height of tree*/
	public int hight(Node root){
		
		if(root == null) return -1;
		int left = hight(root.left);
		int right = hight(root.right);
		int h = Math.max(left, right);
		return h+1;
	}
	
	
	/*Function of return size of tree*/
	public int sizeOftree(Node root){
		
		if(root == null)
			return 0;
		else{
			
			int left = sizeOftree(root.left);
			int right = sizeOftree(root.right);
			return left+right+1;
		}
	}
	
	/*Function of level order traversal*/
	public void lavelOrder(Node root){
		if(root == null) return;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			
			Node curr =  q.poll();
			System.out.print(curr.item+" ");
			if(curr.left != null)
				q.add(curr.left);
			
			if(curr.right != null)
				q.add(curr.right);
		}
	}
	/*function to check node if Leaf node or not*/
	boolean isLif(Node node){
	  if(node  == null)
	    return false;
	  if(node.left == null && node.right == null)
	    return true;
	  return false;
	}
	
	boolean checkSumTree(Node node){
	    //write your code here
	    
	    int ls;
	    int rs;
	    if(node == null || isLif(node) == true)
	      return true;
	      
	    if(checkSumTree(node.left) == false && checkSumTree(node.right) == false){
	      
	      if(node.left == null)
	        ls = 0;
	      else if(isLif(node.left))
	        ls = node.left.item;
	      else
	        ls = 2*(node.left.item);
	        
	      if(node.right == null)
	        rs = 0;
	      else if(isLif(node.right))
	        rs = node.right.item;
	      else
	        rs = 2*(node.right.item);
	        
	      if((node.item == ls+rs))
	        return true;
	      else 
	        return false;
	    }
	    return false;
	}
	
	/*function to fined maximum distinct element in  path*/
	int findDistinct(Node node){
		HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
		return findD(node,set);
	}
	
	int findD(Node node , HashMap<Integer,Integer>m){
		
		if(node == null)
			return m.size();
		
		if(m.containsKey(node.item)){
			m.put(node.item,m.get(node.item)+1);
		}else{
			m.put(node.item,1);
		}
		int max_path = Math.max(findD(node.left,m),findD(node.right,m));
	
		if(m.containsKey(node.item))
			m.put(node.item, m.get(node.item)-1);
		if(m.get(node.item) == 0)
			m.remove(node.item);
		return max_path;
	} 
	
	
	/*Function to find Maximum number of turn in path of  tree*/
	int findTurnCount(Node node){
	    //write your code here
	    if(node == null)
	      return 0;
	    
	    int len = 0;
	    int turn = 0; 
	    int max_turn = -1;
	    
	    if(node.left != null){
	      helper(node.left,'l',turn,max_turn,1,len);
	    }
	    
	    if(node.right!= null){
	      helper(node.right,'r',turn,max_turn,1,len);
	    }
	    len++;
	    return len;
	}
	
	void helper(Node node,char dir,int turn,int max_turn, int soFar, int len){
	    
	    if(node == null) return;
	    
	    if(node.left == null && node.right == null){
	      if(turn > max_turn){
	        max_turn = turn;
	        len = soFar;
	        //System.out.print(len+" ");
	      }
	    }else{
	    	
	        if(dir == 'l'){
	          helper(node.left,dir,turn,max_turn,soFar+1,len);
	          helper(node.right,'r',turn+1,max_turn,soFar+1,len);
	          
	        }else{
	        	
	          helper(node.right,dir,turn,max_turn,soFar+1,len);
	          helper(node.left,'l',turn+1,max_turn,soFar+1,len);
	        }
	    }
	}
}
