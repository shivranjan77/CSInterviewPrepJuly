package SinglyLL;

class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		//this.next = null;
	}
}
public class MyLL {
	static void reversePrint(Node head)
	{
		if(head==null) return;
		reversePrint(head.next); //Recursive Call
		System.out.print(head.data+" ");
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
	static Node insertAtHead(Node head, int data)
	{
		Node temp = new Node(data); // Create new Node
		temp.next = head;
		head = temp;
		return head;
	}
	static Node insertAtEnd(Node head, int data)
	{
		if(head == null)
		{
//			Node temp = new Node(data);
//			head = temp;
//			return head;
//			Node temp = new Node(data);
//			return temp; //Head will change hence return type Node
			return new Node(data);
		}
		Node temp = new Node(data);
		Node last = head;
		while(last.next!=null)
		{
			last = last.next;
		}
		//Last node found
		last.next = temp;
		return head; //  No change but return required because of return type.
	}
	static Node insertAtPos(Node head, int data, int pos)
	{
		if(pos==1)
		{
			Node newNode = new Node(data);
			newNode.next = head;
//			head = newNode;
//			return head;
			return newNode;
		}
		Node newNode = new Node(data);
		Node temp = head;
		for(int i = 0;i<pos-2;i++)
		{
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}
	static Node deleteLL()
	{
		return null;
	}
	static Node deleteFromHead(Node head)
	{
		if(head.next == null) //Only 1 element present
		{
			return null;
		}
		head = head.next;
		return head;
	}
	static void findMiddleOld(Node head)
	{
		Node temp = head;
		int count = 0;
		while(temp!=null)
		{
			temp = temp.next;
			count++;
		}
		temp = head;
		for(int i=0;i<count/2;i++)
		{
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	static void findMiddleNew(Node head)
	{
		Node sptr = head;
		Node fptr = head;
		while(fptr!=null && fptr.next!=null) //If any one null then stop
		{
			fptr = fptr.next.next;
			sptr = sptr.next;
		}
		System.out.println(sptr.data);
	}
	static Node reverse(Node head)
	{
		Node curr = head;
		Node prev = null;
		Node next = null;
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			//Move previous ahead
			prev = curr;
			//Move current ahead
			curr = next;
		}
		//Last node is called prev at this point of time
		return prev; //Returning prev as head
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = insertAtEnd(head,1);
		head = insertAtEnd(head,2);
		head = insertAtEnd(head,3);
		//Traversing the LL
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		print(head);
		head = insertAtHead(head,4);// Update head to the new head;
		print(head);
		head = insertAtEnd(head,5);
		print(head);
		head = insertAtPos(head,6,4);// Add 6 at position 4
		print(head);
		head = insertAtPos(head,7,1);// Add 7 at position 1;
		print(head);
//		head = insertAtPos(head,8,10);// Add 7 at position 1; Handle this case yourself.
//		print(head);
		head = deleteFromHead(head);
		print(head);
		findMiddleNew(head);
		head = reverse(head);
		print(head);
		reversePrint(head);
	}

}
