/*
 * swap elements in the linked list pairwise.
 * Author: Komal Soham Wadekar
 */
public class PairWiseSwapLinkedList {
	
	public void pairWiseSwap(LinkedList list){
		Node current = list.head;
		Node temp = null;
		Node previous = null;
		while(current!=null && current.next!=null){
			temp = current;
			current = current.next;
			temp.next = current.next;
			current.next = temp;
			
			if(current.next==list.head){
				list.head = current;
			}else{
				previous.next = current;
			}
			previous = current.next;
			current = current.next.next;
		}
	}

	public static void main(String args[]){
		PairWiseSwapLinkedList swap = new PairWiseSwapLinkedList();
		LinkedList list = new LinkedList();
		list.insertLast(10);
		list.insertLast(2);
		list.insertLast(20);
		list.insertLast(3);
		list.insertLast(30);
		list.insertLast(4);
		list.insertLast(40);
		//list.insertLast(5);
		list.printList(); //10 2 20 3 30 4 40 
		swap.pairWiseSwap(list);
		System.out.println();
		list.printList(); //2 10 3 20 4 30 40
	}
	
}
