/*
 * Reverse a given LinkedList in Java
 * Author: Komal Soham Wadekar
 */
public class ReverseLinkedList {

	Node head;
	
	public void insertFirst(int data){
		Node newNode = new Node(data);
		if(head == null){
			newNode.next = null;
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void reverseList(){
		if(head==null){
			System.out.println("List is empty.");
		}else{
			
			Node current = head;
			Node previous =null;
			Node next =null;
			while(current!=null){
				next = current.next;
				current.next = previous;
				previous = current;
				current=next;
			}
			head = previous;
		}
	}
	
	public void printList(){
		if(head==null){
			System.out.println("List is empty.");
		}else{
			Node node = head;
			while(node!=null){
				System.out.print(node.data+" ");
				node = node.next;
			}
		}
	}
	
	public static void main(String args[]){
		ReverseLinkedList list = new ReverseLinkedList();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertFirst(50);
		list.printList();
		list.reverseList();
		System.out.println();
		list.printList();
	}
}

class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}
}
