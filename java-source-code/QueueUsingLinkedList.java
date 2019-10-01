/*
 * Implementation of queue using LinkedList.
 * Author: Komal Soham Wadekar
 */
public class QueueUsingLinkedList {
	QNode front,rear;
	
	public void enqueue(int data){
		QNode node = new QNode(data);
		if(isQueueEmpty()){
			this.front = this.rear = node;
		}else{
			this.rear.next = node;
			this.rear = node;
		}
	}
	
	public int dequeue(){
		int key = Integer.MIN_VALUE;
		if(isQueueEmpty()){
			System.out.println("Queue is empty.");
		}else{
			key = this.front.data;
			this.front = this.front.next;
		}
		if(this.front==null){
			this.rear=null;
		}
		return key;
	}
	
	public boolean isQueueEmpty(){
		if(this.front==null && this.rear== null)
			return true;
		return false;
		
	}
	
	public void printQueue(){
		if(isQueueEmpty()){
			System.out.println("Queue is empty.");			
		}else{
			QNode node = this.front;
			while(node!=null){
				System.out.print(node.data+" ");
				node = node.next;
			}
		}
	}
		
	class QNode{
		int data;
		QNode next;
		
		public QNode(int data){
			this.data = data;
		}
	}
	
	public static void main(String args[]){
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.dequeue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.printQueue();
		System.out.println();
		System.out.println("Dequeued element is:"+queue.dequeue());
		queue.printQueue();
	}
}
