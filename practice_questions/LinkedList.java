/*
*LinkedList class which is used by other classes in other files to perform basic LinkedList operations.
*Author: Komal Soham Wadekar
*/
public class LinkedList {

	Node head;

	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			newNode.next = null;
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertLast(int data){
		Node node = new Node(data);
		node.next = null;
		
		if(head==null){
			head = node;
		}else{
			Node newNode = head;
			while(newNode.next!=null){
				newNode = newNode.next;
			}
			newNode.next = node;
		}
	}

	public void printList() {
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
}

class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		next=null;
	}
}
