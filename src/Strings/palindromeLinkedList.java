package Strings;

public class palindromeLinkedList {
	
	static int val;
	static palindromeLinkedList next;
	palindromeLinkedList(int x) { 
		val = x; 
	}
	
	static boolean palindromeList(palindromeLinkedList head){
	
		palindromeLinkedList temp = null;
		palindromeLinkedList nextNode = null;
		palindromeLinkedList current = head;
		String s ="", reverse="";
		while(current!=null){
			nextNode = current.next;
			current.next = temp;
			temp = current;
			current = nextNode;
			s=s+current.val;
		}
		System.out.println(s);
		return false;
	}
	
	public static void main(String[] args){
		
	}
}
