// Implement Stack using LinkedList

import java.io.*;
import java.util.*;

class stackusingll{
	Node top;
	// Constructor.
	stackusingll(){
	this.top=null;
	}
	// Node class.
	class Node{
		Node next;
		int data;
	}
	
	// inserting element into the stack.
	
	public void push(int x){
		// creating temporary node.
		Node tmp=new Node();
		
		// checking either stack is full or not.
		if(tmp==null){
			System.out.println("Stack is Full!");
		}
		
		tmp.data=x;
		tmp.next=top;
		top=tmp;
	}
	
	// Auxiliary function to check either stack is empty or not.
	
	public boolean isEmpty(){
		return top==null;
	}
	
	public void pop(){
		if(top==null){
			System.out.println("Stack underflow!");
			return;
		}
		top=top.next;
	}
	
	public int  peek(){
		if(!isEmpty()){
			return top.data;
		}
		else{
			System.out.println("Stack is Empty!");
			return -1;
			
		}
	}
	
	public void display(){
		if(top==null){
			System.out.println("Stack underflow");
		}
		else{
			Node tmp=top;
			while(top!=null){
				System.out.print(top.data+" ");
				top=top.next;
			}
		}
	}
}
class Main{
	public static void main(String[]args){
		stackusingll llist=new stackusingll();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(5);
		llist.display();
		//llist.peek();
		System.out.println(llist.peek());

		// llist.pop();
		// llist.pop();
		// llist.pop();
		llist.peek();
	}
}