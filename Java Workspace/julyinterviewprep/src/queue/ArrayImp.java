package queue;
class MyQueue{
	final int size = 10;
	int arr[] = new int[size];
	int front = -1;
	int rear = -1;
	void enqueue(int data)
	{
		if(this.isEmpty())
		{
			front++;
//			rear++;
//			arr[rear] = data;
			arr[++rear]=data;
		}
		else if(rear==size-1) {
			System.out.println("Queue is already full. Cannot Enqueue!");
			return;
		}
		else {
//			rear++;
//			arr[rear]=data;
			arr[++rear]=data;
		}
	}
	int dequeue() //Remove and return the removed element
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is Empty! Nothing to Dequeue.");
			return -1;
		}
		if(front==rear) //If deleting the only one last element
		{
			int x = arr[front];
			front=-1;
			rear=-1;
			return x;
		}
//		int x = arr[front];
//		front++;
//		return x;
		return arr[front++];
	}
	boolean isEmpty()
	{
//		if(front==-1 && rear==-1) return true;
//		return false;
		return (front==-1 && rear==-1);
	}
	int peek()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is Empty!");
			return -1;
		}
		return arr[front];
	}
}
public class ArrayImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q = new MyQueue();
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.dequeue();
		q.dequeue();
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		System.out.println(q.peek());
		
		}

}
