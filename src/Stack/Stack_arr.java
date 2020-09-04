package Stack;
import java.util.*;
@SuppressWarnings("unused")
class Node{
	public int data;
	public Node next;
	public void display() {
		System.out.print(data + "->");
	}
}
public class Stack_arr {
	private Node head; 
	public void push(int a) {
		Node n = new Node();
		n.data = a;
		n.next = head;
		head = n;
	}
	public void pop() {
		if(head==null) {
			System.out.println("stack is empty");
		}
		else if(head.next==null) {
			System.out.println("Removed element is "+head.data);
			head = null;
		}
		else {
			System.out.println("Removed element is "+head.data);
			head = head.next;
		}
	}
	public void display() {
		Node curr = head;
		while(curr != null) {
			curr.display();
			curr = curr.next;
		}
		System.out.print("null");
	}
	public static void main(String[] args) {
		Stack_arr s = new Stack_arr();
		s.push(2);
		s.push(10);
		s.pop();
		s.display();
	}
}
