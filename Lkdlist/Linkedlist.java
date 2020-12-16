import java.io.*;
import java.util.*;
class Linkedlist
{
	Node head;//head of list
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
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args)
	{
		Linkedlist llist=new Linkedlist();
		Scanner s=new Scanner(System.in);
		//Linkedlist llist=new Linkedlist();
		//llist.head=new Node(1);
		//Node second=new Node(2);
		//Node third=new Node(3);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=s.nextInt();
			llist.add(num);
		}
		//llist.head.next=second;
		//second.next=third;
		llist.printList();
	}
}