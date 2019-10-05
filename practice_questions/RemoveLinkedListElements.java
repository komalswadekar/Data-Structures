/*
 * Remove elements from LinkedList that has same value as the given value.
 * Author: Komal Soham Wadekar
 */
public class RemoveLinkedListElements {

	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.insertFirst(10);
		list.insertFirst(30);
		list.insertFirst(20);
		list.insertFirst(10);
		list.insertFirst(40);
		list.insertFirst(20);
		list.insertFirst(10);
		list.printList();
		System.out.println();
		list.removeElement(10);
		list.printList();		
	}
}

class LinkedList{
	Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next=null;
		}
	}
	
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
	
	public void removeElement(int element){
		Node current = head;
		Node previous=null;
		while(current!=null){
			if(current.data==element){
				if(current==head){
					head = current.next;
					current.next =null;
					current = head;
				}else{
					previous.next = current.next;
					current = previous.next;
				}
				
			}else{
				previous = current;
				current = current.next;
			}
		}
	}
	
}

