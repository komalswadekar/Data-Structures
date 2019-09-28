/*
 * Stack implementation in Java using array
 * Author: Komal Soham Wadekar
 */
public class Stack {

	int maxSize;
	int top;
	int stackArray[];
	
	public Stack(int maxSize){
		this.maxSize = maxSize;
		stackArray = new int[this.maxSize];
		top = 0;
	}
	
	public static void main(String args[]){
		Stack stack = new Stack(100);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		int poppedItem = stack.pop();
		System.out.println("Popped Item is:" + poppedItem);
		stack.printStackItems();
		
		int peekedItem =  stack.peek();
		System.out.println("Top Item in stack is:" + peekedItem);
		stack.printStackItems();
		
		stack.push(30);
		System.out.println();
		stack.printStackItems();
	}
	
	public boolean isStackFull(){
		if(top==maxSize)
			return true;
		return false;
	}
	
	public boolean isStackEmpty(){
		if(top==0)
			return true;
		return false;
	}
	
	void push(int item){
		if(isStackFull()){
			System.out.println("Stack is full. Can not insert item to stack");
		}else{
			stackArray[top] = item;
			this.top++;
		}
	}
	
	int pop(){
		int item =0;
		if(isStackEmpty()){
			System.out.println("Stack is empty.");
		}else{
			top--;
			item = stackArray[top];
					}
		return item;
	}
	
	int peek(){
		int item =0;
		if(isStackEmpty()){
			System.out.println("Stack is empty.");
		}else{
			item = stackArray[top];
		}
		return item;
	}
	
	void printStackItems(){
		for(int i=0;i<top;i++){
			System.out.println(stackArray[i]);
		}
	}
	
}
