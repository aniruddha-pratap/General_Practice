package Trees;
import java.util.*;

public class BinaryTree {

	public int data;
	public BinaryTree left, right;
	
	public BinaryTree(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
	
	public void setBinaryTreeLeft(BinaryTree node){
		this.left = node;
	}
	
	public void setBinaryTreeRight(BinaryTree node){
		this.right = node;
	}
	
	public static ArrayList<Integer> preOrderTraversal(BinaryTree head){
		ArrayList<Integer> list =  new ArrayList<Integer>();
		Stack<BinaryTree> s =  new Stack<BinaryTree>();
		s.push(head);
		while(!s.isEmpty()){
			BinaryTree temp = s.pop();
			list.add(temp.data);
			if(temp.right != null){
				s.push(temp.right);
			}
			if(temp.left != null){
				s.push(temp.left);
			}
		}
		return list;
	}
	
	public static ArrayList<Integer> inOrderTraversal(BinaryTree head){
		ArrayList<Integer> list =  new ArrayList<Integer>();
		Stack<BinaryTree> s =  new Stack<BinaryTree>();
		BinaryTree currentNode = head;
		while(!s.isEmpty() || currentNode != null){
			if(currentNode != null){
				s.push(currentNode);
				currentNode = currentNode.left;
			}else{
				currentNode = s.pop();
				list.add(currentNode.data);
				currentNode = currentNode.right;
			}
		}
		return list;
	}
	
	public static void levelOrder(BinaryTree head){
		Queue<BinaryTree> q = new LinkedList<BinaryTree>();
		q.add(head);
		while(!q.isEmpty()){
			int nodeCount = q.size();
			if(nodeCount == 0)
				break;
			while(nodeCount>0){
				BinaryTree temp = q.poll();
				System.out.print(temp.data);
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
				nodeCount--;
			}
			System.out.println();
		}
	
	}
	
	public static int findMax(BinaryTree head){
		int max=Integer.MIN_VALUE;
		Queue<BinaryTree> q = new LinkedList<BinaryTree>();
		q.add(head);
		while(!q.isEmpty()){
			BinaryTree temp = q.poll();
			if(temp.data  > max){
				max = temp.data;
			}
			if(temp.left!=null){
				q.add(temp.left);
			}
			if(temp.right!=null){
				q.add(temp.right);
			}
		}
		return max;
	}
	
	public static boolean findElement(BinaryTree head, int data){
		Queue<BinaryTree> q = new LinkedList<BinaryTree>();
		q.add(head);
		while(!q.isEmpty()){
			BinaryTree temp = q.poll();
			if(temp.data == data){
				return true;
			}
			if(temp.left!=null){
				q.add(temp.left);
			}
			if(temp.right!=null){
				q.add(temp.right);
			}
		}
		return false;
	}
	
	public static int treeSize(BinaryTree head){
		Queue<BinaryTree> q = new LinkedList<BinaryTree>();
		q.add(head);
		int count =0;
		while(!q.isEmpty()){
			BinaryTree temp = q.poll();
			count++;
			if(temp.left!=null){
				q.add(temp.left);
			}
			if(temp.right!=null){
				q.add(temp.right);
			}
		}
		return count;
	}
	
	public static int treeHeight(BinaryTree head){
		Queue<BinaryTree> q  =  new LinkedList<BinaryTree>();
		q.add(head);
		int height =0;
		while(!q.isEmpty()){
			int nodeCount = q.size();
			if(nodeCount == 0){
				return height;
			}
			height++;
			while(nodeCount>0){
				BinaryTree temp = q.poll();
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
				nodeCount--;
			}
		}
		return height;
	}
	
	public static void main(String args[]){
		BinaryTree head = new BinaryTree(1);
		BinaryTree two = new BinaryTree(2);
		BinaryTree three = new BinaryTree(3);
		BinaryTree four = new BinaryTree(4);
		BinaryTree five = new BinaryTree(5);
		BinaryTree six = new BinaryTree(6);
		BinaryTree seven = new BinaryTree(7);
		head.setBinaryTreeLeft(two);
		head.setBinaryTreeRight(three);
		two.setBinaryTreeLeft(four);
		two.setBinaryTreeRight(five);
		three.setBinaryTreeLeft(six);
		three.setBinaryTreeRight(seven);
		/**ArrayList<Integer> list = BinaryTree.preOrderTraversal(head);
		ArrayList<Integer> list = BinaryTree.inOrderTraversal(head);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}**/
		BinaryTree.levelOrder(head);
		//System.out.println("Max element is " + BinaryTree.findMax(head));
		//System.out.println("Element present " + BinaryTree.findElement(head, 5));
		//System.out.println("Size of tree is " + BinaryTree.treeSize(head));
		System.out.println("Height of tree is " + BinaryTree.treeHeight(head));
	}
		
}
