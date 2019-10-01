/*
 * Implementation of Queue using Array.
 * Author: Komal Soham Wadekar
 */
public class QueueUsingArray {

	int front, rear, size, arr[];

	public QueueUsingArray(int size) {
		this.size = size;
		front = rear = 0;
		arr = new int[size];
	}

	public void enqueue(int data) {
		if (isQueueFull())
			System.out.println("Queue is full.");
		else {
			arr[rear] = data;
			rear++;
		}
	}

	public int dequeue() {
		int item = Integer.MIN_VALUE;
		if (isQueueEmpty())
			System.out.println("Queue is empty.");
		else {
			item = arr[front];
			for (int i = front; i < rear - 1; i++) {
				arr[i] = arr[i + 1];
			}
			rear--;
		}
		return item;
	}

	public void printQueue() {
		for (int i = front; i < rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public boolean isQueueEmpty() {
		if (front == rear)
			return true;
		return false;
	}

	public boolean isQueueFull() {
		if (rear == size)
			return true;
		return false;
	}

	public static void main(String args[]) {
		QueueUsingArray queue = new QueueUsingArray(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(20);
		queue.enqueue(10);
		queue.enqueue(50);
		queue.printQueue();
		System.out.println("Removed item from queue is: " + queue.dequeue());
		queue.printQueue();
		queue.enqueue(50);
		queue.printQueue();

	}
}
