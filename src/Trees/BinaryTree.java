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
	
	public static String preOrderTraversal(BinaryTree head){
		if(head==null){
		    return null;
        }
	    StringBuilder sb = new StringBuilder();
		Stack<BinaryTree> s =  new Stack<BinaryTree>();
		s.push(head);
		while(!s.isEmpty()){
			BinaryTree temp = s.pop();
			sb.append(temp.data);
			if(temp.right != null){
				s.push(temp.right);
			}

			if(temp.left != null){
			    s.push(temp.left);
			}
		}
		return sb.toString();
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
	
	public static List<List<Integer>> levelOrder(BinaryTree head){
		Queue<BinaryTree> q = new LinkedList<BinaryTree>();
		List<List<Integer>> result = new ArrayList<>();
		q.add(head);
		while(!q.isEmpty()){
			int nodeCount = q.size();
			List<Integer> t = new ArrayList<>();
			while(nodeCount>0){
                BinaryTree temp = q.poll();
				t.add(temp.data);
				//System.out.print(temp.data);
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
				nodeCount--;
			}
			result.add(t);
		}
		return result;
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
        System.out.println(BinaryTree.preOrderTraversal(head));
        /**ArrayList<Integer> list = BinaryTree.inOrderTraversal(head);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}**/
		List<List<Integer>> t = BinaryTree.levelOrder(head);
		int i=0;
		while(i<t.size()){
            System.out.println(t.size());
            List<Integer> e = t.get(i);
            for(int j=0; j<e.size(); j++){
                System.out.println(e.get(j));
            }
            i++;
		}
		//System.out.println("Max element is " + BinaryTree.findMax(head));
		//System.out.println("Element present " + BinaryTree.findElement(head, 5));
		//System.out.println("Size of tree is " + BinaryTree.treeSize(head));
		//System.out.println("Height of tree is " + BinaryTree.treeHeight(head));
	}
		
}
