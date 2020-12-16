import java.io.*;
import java.util.*;
class Linkedlist
{
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void printList()
	{
		Node n=head;
		while(n!=null)
			System.out.print(n.data+" ");
			n=n.next;
	}
	public static void main(String[] args)
	{
		Linkedlist llist=new Linkedlist();
		llist.head=new Node(1);
		llist second=new Node(2);
		llist third=new Node(3);

		llist.head.next=second;
		second.next=third;
		llist.printList();
	}
}