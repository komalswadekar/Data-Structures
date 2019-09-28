/*
 * Doubly Linked List implemented in Java
 * Operations: insert item to first, insert item to last,
 * delete first item, delete last item, print list
 * Author : Komal Soham Wadekar
 */

public class DoublyLinkedList {

	DoublyNode head;
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		DoublyNode deletedNode= null;
		list.insertLast(10);
		list.insertLast(20);
		//list.printList();
		list.insertFirst(40);		
		list.insertFirst(60);
		list.printList();
		deletedNode = list.deleteFirst();
		System.out.println("Deleted Node is: "+deletedNode.data);
		list.printList();
		
		deletedNode = list.deleteLast();
		System.out.println("Deleted Node is: "+deletedNode.data);
		list.printList();
		
	}
	
	public void printList(){
		if(isListEmpty()){
			System.out.println("Empty List.");
		}else{
			DoublyNode node = this.head;
			while(node!=null){
				System.out.println(node.data);
				node = node.next;
			}
		}
	}

	public void insertLast(int data){
		DoublyNode node = new DoublyNode(data);
		node.next = null;
		node.previous = null;
		if(isListEmpty()){
			this.head = node;
		}else{
			DoublyNode newNode = this.head;
			while(newNode.next!=null){
				newNode = newNode.next;
			}
			newNode.next = node;
			node.previous= newNode;
		}
	}
	
	public void insertFirst(int data){
		DoublyNode node = new DoublyNode(data);
		node.next = null;
		node.previous = null;
		if(isListEmpty()){
			this.head = node;
		}else{
			DoublyNode currentNode = this.head;
			currentNode.previous=node;
			node.next = currentNode;
			this.head = node;
		}
	}
	
	public boolean isListEmpty(){
		 
		if(this.head==null)
			return true;		
		return false;
	}

	public DoublyNode deleteFirst(){
		if(isListEmpty()){
			System.out.println("Empty List.");
			return null;
		}else{
			DoublyNode firstNode = this.head;
			this.head = firstNode.next;
			this.head.previous=null;
			firstNode.next=null;
			return firstNode;
		}
		
	}
	
	public DoublyNode deleteLast(){
		if(isListEmpty()){
			System.out.println("Empty List.");
			return null;
		}else{
			DoublyNode node = this.head;
			DoublyNode previousNode = null;
			while(node.next!=null){
				previousNode = node;
				node = node.next;
			}
			previousNode.next = null;
			node.previous = null;
			return node;
				
		}
	}
	
	
}

class DoublyNode{
	int data;
	DoublyNode next;
	DoublyNode previous;
	
	public DoublyNode(int data){
		this.data = data;
		next = null;
		previous = null;		
	}
}
