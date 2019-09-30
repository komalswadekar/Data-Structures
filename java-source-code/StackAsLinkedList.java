/*
*Implement Stack as a LinkedList in Java
*Author: Komal Soham Wadekar
*/
public class StackAsLinkedList {

	StackNode top;
	
	public void push(int data){
		StackNode node = new StackNode(data);
		if(top==null){
			top=node;
		}else{
			StackNode currentNode = top;
			top = node;
			top.next = currentNode;
		}
	}
	
	public int pop(){
		Integer poppedItem = null;
		if(top==null){
			System.out.println("Stack is empty.");
		}else{
			StackNode node = top;
			top = node.next;
			node.next = null;
			poppedItem = node.data;
		}
		return poppedItem;
	}
	
	public int peek(){
		Integer item = null;
		if(top==null){
			System.out.println("Stack is empty.");
		}else{
			item = top.data;
		}
		
		
		return item;
	}
	
	void printStack(){
		
		if(top==null){
			System.out.println("Stack is empty.");
		}else{
			StackNode node = top;
			while(node!=null){
				System.out.println(node.data);
				node = node.next;
			}
		}
		
	}
	
	public static void main(String args[]){
		StackAsLinkedList stack = new StackAsLinkedList();
		int topItem=0;
		stack.push(10);
		stack.push(20);
		stack.printStack();
		topItem = stack.pop();
		System.out.println("Popped Item is : "+topItem);
		stack.push(30);
		stack.printStack();
		topItem = stack.peek();
		System.out.println("Peeked Item is : "+topItem);
		stack.printStack();
		
	}
}

class StackNode{
	int data;
	StackNode next;
	
	public StackNode(int data){
		this.data = data;
		this.next = null;
	}
}
