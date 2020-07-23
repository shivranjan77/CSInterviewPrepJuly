package stack;
class MyStack{
	final int size = 10;
	int arr[] = new int[size];
	int top = -1;
	boolean isEmpty()
	{
		if(top==-1) return true;
		return false;
	}
	int peek() //Only Printing the topmost value
	{
		if(this.isEmpty())  
		{
			System.out.println("Empty Stack!");
			return -1; //Error Code
		}
		return arr[top];
	}
	void push(int data)
	{
		if(top>=size-1) //Top will be the max index -> size-1
		{
			System.out.println("Stack Overflow! Unable to Push");
			return;
		}
//		top=top+1;
//		arr[top]=data;
		arr[++top]=data;
	}
	int pop() //Deleting and Returning the deleted value
	{
		if(this.isEmpty())  
		{
			System.out.println("Empty Stack! Nothing to Pop");
			return -1; //Error Code
		}
//		int x = arr[top];
//		top--;
//		return x;
		return arr[top--];//First it will return then it will decrement top.
	}
}
public class ArrayImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s = new MyStack();
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);
		s.push(10);
		s.push(11);
		s.push(12);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
