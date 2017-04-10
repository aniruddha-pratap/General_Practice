package LinkedList;

public class ReverseListII {
	
	public static LinkedList reverseListII(LinkedList head, int i, int k){
		LinkedList current = head,temp=null, next=null;
		for(int j=1;j<i;j++){
			current = current.next;
		}
		for(int l=i;l<=k;l++){
			next = current.next;
			current.next = temp;
			temp = current;
			current = next;
		}
		head.next = temp;
		return head;
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
		head = ReverseListII.reverseListII(head,2,4);
		while(head!=null){
			System.out.print(head.val);
			head = head.next;
		}

	}

}
