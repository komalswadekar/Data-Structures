/*
 * Modify the linked list such that all even numbers appear before all the odd numbers 
 * in the modified linked list. Also, keep the order of even and odd numbers same.
 * Author: Komal Soham Wadekar
 */
public class SegregateEvenOddNodesLinkedList {

	public void segregateOddEvenNodes(LinkedList list) {
		Node odd = null;
		Node currentOdd = null;
		Node current = list.head;
		Node previous = null;
		while (current != null) {
			if (current.data % 2 != 0) {

				if (odd == null) {
					odd = current;
					currentOdd = odd;
				} else {
					currentOdd.next = current;
					currentOdd = currentOdd.next;
				}
				if (current == list.head) {
					previous = current;
					list.head = current.next;
				} else {
					previous.next = current.next;
				}

			} else {
				previous = current;
			}
			current = previous.next;
		}
		currentOdd.next = null;
		previous.next = odd;
	}

	public void printList(Node head) {
		if (head == null) {
			System.out.println("List is empty.");
		} else {
			Node node = head;
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		}
	}

	public static void main(String args[]) {
		SegregateEvenOddNodesLinkedList seg = new SegregateEvenOddNodesLinkedList();
		LinkedList list = new LinkedList();
		list.insertLast(11);
		list.insertLast(18);
		list.insertLast(8);
		list.insertLast(15);
		list.insertLast(17);
		list.insertLast(13);
		list.printList(); //11 18 8 15 17 13 
		seg.segregateOddEvenNodes(list);
		System.out.println(); //18 8 11 15 17 13 
		list.printList();
	}
}
