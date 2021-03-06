package DoublyLL;

class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
		this.data = data;
		//Prev && Next null by default
	}
}
public class DoublyLL {
	static Node insertAtHead(Node head, int data)
	{
		Node temp = new Node(data);
		temp.next = head;
		if(head!=null)
		{
			head.prev = temp;
		}
		return temp;
	}
	static Node insertAtEnd(Node head, int data)
	{
		Node temp = new Node(data); //Create a Node
		Node last = head;
		if(head == null) //If empty initially
		{
			return temp;
		}
		while(last.next!=null)
		{
			last = last.next;
		}
		last.next = temp;
		temp.prev = last;
		return head;
	}
	static void reversePrint(Node head) {
		while(head.next!=null)
		{
			head = head.next;
		}
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.prev;
		}
	}
	static void print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = insertAtHead(head,3);
		head = insertAtHead(head,2);
		head = insertAtHead(head,1);
		print(head);
		head = insertAtEnd(head,4);
		print(head);
		reversePrint(head);
	}

}
