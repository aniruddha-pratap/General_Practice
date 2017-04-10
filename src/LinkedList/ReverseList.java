package LinkedList;

public class ReverseList {
	
	public static LinkedList reverseList(LinkedList head){
		LinkedList current= head, temp=null, next=null;
		while(current!=null){
			next = current.next;
			current.next  = temp;
			temp = current;
			current = next;
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList head  = new LinkedList(1);
		LinkedList one  = new LinkedList(2);
		LinkedList two  = new LinkedList(3);
		LinkedList three  = new LinkedList(4);
		LinkedList four  = new LinkedList(5);
		LinkedList five  = new LinkedList(6);
		head.next = one;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		head = ReverseList.reverseList(head);
		while(head!=null){
			System.out.print(head.val);
			head = head.next;
		}
		
		
	}

}
