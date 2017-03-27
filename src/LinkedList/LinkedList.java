package LinkedList;

public class LinkedList {
	int val;
	LinkedList next;
	LinkedList(int x){
		val = x;
	}
	
	public static void twoSmallest(LinkedList head){
		LinkedList a=head,b=head;;
		a.val=Integer.MAX_VALUE;
		b.val=Integer.MAX_VALUE;
		LinkedList temp=head;
		while(temp!=null){
			if(temp.val<a.val){
				b=a;
				a = temp;
		//Checking that both values don't point to the same value.For example the linked list has two nodes with value 1.		
			}else if(a.val == b.val || (temp.val < b.val && temp.val != a.val)){
				b = temp;
			}
			temp=temp.next;
		}
		System.out.println("First Smallest "+ a.val + " second smallest "+ b.val);
	}
	
	public static void main(String args[]){
		LinkedList head  = new LinkedList(10);
		LinkedList one  = new LinkedList(5);
		LinkedList two  = new LinkedList(6);
		LinkedList three  = new LinkedList(4);
		LinkedList four  = new LinkedList(1);
		LinkedList five  = new LinkedList(8);
		head.next = one;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		LinkedList.twoSmallest(head);
	}
}


