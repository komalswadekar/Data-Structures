/*
 * Singly Linked List implemented in Java
 * Operations: insert item to first, insert item to last, insert item at a given position,
 * delete first item, delete last item, print list
 * Author : Komal Soham Wadekar
 */
public class SinglyLinkedList {
	
	Node head;

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		Node node = null;
		
		list = list.insertLast(list,15);
		list = list.insertFirst(list, 10);		
		//list.printLinkedList(list);
		
		list = list.insertFirst(list, 20);
		list = list.insertLast(list, 30);
		list.insertAtGivenPosition(list, 50, 3);
		list.printLinkedList(list);
		node = list.deleteFirst(list);
		System.out.println("Deleted node:"+node.data);
		list.printLinkedList(list);
		node = list.deleteLast(list);
		System.out.println("Deleted node:"+node.data);
		list.printLinkedList(list);
		node = list.deleteLast(list);
		System.out.println("Deleted node:"+node.data);
		list.printLinkedList(list);
		System.out.println("List size: "+ list.getListSize(list));
	}
	
	public SinglyLinkedList insertLast(SinglyLinkedList list, int data){
		Node node = new Node(data);
		node.next = null;
		
		if(list.head==null){
			list.head = node;
		}else{
			Node newNode = list.head;
			while(newNode.next!=null){
				newNode = newNode.next;
			}
			newNode.next = node;
		}
		return list;
	}
	
	public SinglyLinkedList insertFirst(SinglyLinkedList list, int data){
		Node node = new Node(data);
		
		if(list.head==null){
			list.head = node;
			node.next= null;
		}else{
			node.next=list.head;
			list.head = node;
		}
		return list;
	}
	
	public void printLinkedList(SinglyLinkedList list){
		
		if(list.head!=null){
			Node node = list.head;
			while(node!=null){
				System.out.println(node.data);
				node=node.next;
			}
		}else{
			System.out.println("List is empty.");
		}
	}
	
	
	public SinglyLinkedList insertAtGivenPosition(SinglyLinkedList list, int data, int pos){
		//First position is 0th index
		Node dataNode = new Node(data);
		if(list.head==null){
			list.head = dataNode;
			dataNode.next = null;
		}else if(pos==0){
			insertFirst(list, data);
		}else if(pos==getListSize(list)){
			insertLast(list, data);
		}else if(pos>getListSize(list)){
			System.out.println("Pos is greater than list size");
		}else{
			Node node = list.head;
			for(int i=pos;i>1;i--){
				node = node.next;
			}
			dataNode.next = node.next;
			node.next = dataNode;			
		}
					
		return list;
	}
	
	public int getListSize(SinglyLinkedList list){
		int size = 0;
		if(list.head==null){
			size=0;
		}else{
			Node node = list.head;
			while(node!=null){
				size = size+1;
				node = node.next;
			}
		}
		return size;
	}
	
	public Node deleteFirst(SinglyLinkedList list){
		Node deletedNode = null;
		if(list.head==null){
			System.out.println("List is empty.");			
		}else{
			deletedNode = list.head;
			list.head = deletedNode.next;
			deletedNode.next = null;
		}
		return deletedNode;
	}

	public Node deleteLast(SinglyLinkedList list){
		Node deletedNode = null;
		if(list.head==null){
			System.out.println("List is empty.");			
		}else{
			Node currentNode = list.head;
			for(int i=0;i<getListSize(list)-2;i++){
				currentNode = currentNode.next;
			}
			deletedNode = currentNode.next;
			currentNode.next = null;
		}
		
		return deletedNode;
	}
}

class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		next = null;
	}
}
