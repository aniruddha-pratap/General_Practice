package Trees;

public class BinarySearchTree {
	
	public int data;
	public BinarySearchTree left, right;
	
	public BinarySearchTree(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
	
	public void setBSTLeft(BinarySearchTree node){
		this.left = node;
	}
	
	public void setBSTRight(BinarySearchTree node){
		this.right = node;
	}
	
	public static BinarySearchTree searchBST(BinarySearchTree root, int data){
		if(root == null)
			return null;
		while(root!=null){
			if(data == root.data)
			{	
				return root;
			}
			else{
				if(data>root.data){
					System.out.println("Going right");
					root = root.right;
				}else{
					System.out.println("Going left");
					root = root.left;
				}
			}
		}
		return null;
	}
	
	public static BinarySearchTree findMinimum(BinarySearchTree root){
		if(root == null)
			return null;
		while(root.left!=null){
			root = root.left;
		}
		return root;
	}
	
	public static BinarySearchTree findMaximum(BinarySearchTree root){
		if(root == null)
			return null;
		while(root.right!=null){
			root = root.right;
		}
		return root;
	}
	
	public static void insertNode(BinarySearchTree root, int data){
		if(root == null)
			root = new BinarySearchTree(data);
		BinarySearchTree current = root;
		BinarySearchTree previous = null;
		while(current!=null){
			if(data>current.data){
				previous = current;
				current = current.right;
			}else{
				previous = current;
				current = current.left;
			}
		}
		System.out.println(previous.data);
		BinarySearchTree node = new BinarySearchTree(data);
		if(previous.data < data){
			if(previous.right == null){
				previous.right = node;
			}
			else{
				if(previous.right.data>data){
					node.right = previous.right;
				}else{
					node.left = previous.right;
				}			
				previous.right = node;				
			}
		}else{
			if(previous.left == null){
				previous.left = node;
			}else{
				if(previous.left.data>data){
					node.right = previous.left;
				}else{
					node.left = previous.left;
				}		
				previous.left = node;				
			}
		}
	}
	
	public static void main(String args[]){
		BinarySearchTree head = new BinarySearchTree(3);
		BinarySearchTree two = new BinarySearchTree(2);
		BinarySearchTree three = new BinarySearchTree(1);
		BinarySearchTree four = new BinarySearchTree(4);
		BinarySearchTree five = new BinarySearchTree(5);
		BinarySearchTree six = new BinarySearchTree(6);
		BinarySearchTree seven = new BinarySearchTree(7);
		head.setBSTLeft(two);
		head.setBSTRight(five);
		two.setBSTLeft(three);
		five.setBSTLeft(four);
		five.setBSTRight(six);
		six.setBSTRight(seven);
		System.out.println(BinarySearchTree.searchBST(head, 4).data);
		System.out.println(BinarySearchTree.findMinimum(head).data);
		System.out.println(BinarySearchTree.findMaximum(head).data);
		BinarySearchTree.insertNode(head, 4);
	}	
}
