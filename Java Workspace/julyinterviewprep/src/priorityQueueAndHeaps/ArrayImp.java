package priorityQueueAndHeaps;
class PQArray
{
	final int size = 10;
	int arr[] = new int[size];
	int nItems = 0; //Number of items in the PQ at any particular time.
	void add(int data)
	{
		if(isEmpty())
		{
			arr[0]=data;
			nItems++;
			return;
		}
		int i;
		for(i= nItems-1;i>=0;i--)
		{
			if(data<arr[i]) //Toggle this to switch between Min and Max Priority Queue
			{
				arr[i+1]=arr[i];
			}
			else {
				break;
			}
		}
		arr[i+1] = data;
		nItems++;
	}
	int poll()
	{
		return arr[--nItems];
	}
	int peek()
	{
		return arr[nItems-1];
	}
	int size()
	{
		return nItems;
	}
	boolean isEmpty()
	{
		return nItems==0;
	}
}
public class ArrayImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PQArray pq = new PQArray();
		System.out.println(pq.isEmpty());
		System.out.println(pq.size());
		pq.add(5);
		pq.add(10);
		pq.add(1);
		System.out.println(pq.peek());
		System.out.println(pq.size());
		System.out.println(pq.poll());
		System.out.println(pq.size());
		System.out.println(pq.peek());
	}
}