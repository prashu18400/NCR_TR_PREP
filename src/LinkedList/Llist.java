package LinkedList;
class Node{
	public int data;
	public Node next;
	public void displaynode() {
		System.out.print(data + "->");
	}
}
public class Llist {
	private Node head;
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	public void insertLast(int data) {
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	public void printLinkedList() {
		Node current = head;
		while(current != null) {
			current.displaynode();
			current = current.next;
		}
		System.out.print("null");
	}
	public void delete_begin() {
		if(isEmpty()) {
			System.out.println("Linked list is empty");
		}
		else {
			Node current = head;
			if(current.next != null) {
				current = current.next;
				head = current;
			}
			else
				head = null;
		}
		
	}
	public void delete_last() {
		if(isEmpty()) {
			System.out.println("Linked list is empty");
		}
		else {
			Node current = head;
			while(current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
		
	}
	public void insert_pos(int pos,int value){
		Node temp = new Node();
		Node curr = head;
		temp.data = value;
		temp.next = null;
		int i=0;
		for(i=0;curr != null;i++,curr = curr.next);
		if(pos == 0) {
			insertFirst(temp.data);
		}
		else if(pos == i)
			insertLast(temp.data);
		else {
			insert_pos1(pos,temp.data);
		}
	}
	public void delete_pos(int pos) {
		Node curr = head;
		int i=0;
		for(i=0;curr != null;i++,curr = curr.next);
		if(pos == 0) {
			delete_begin();
		}
		else if(pos == i)
			delete_last();
		else {
			delete_pos1(pos);
		}
	}
	private void delete_pos1(int pos) {
		// TODO Auto-generated method stub
		Node t1 = new Node();
		t1 = head;
		for(int i=0;i<pos-1;i++,t1 = t1.next);
		t1.next = t1.next.next;
	}
	private void insert_pos1(int pos, int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		Node t1 = new Node();
		t1 = head;
		for(int i=0;i<pos-1;i++,t1 = t1.next);
		newNode.next = t1.next;
		t1.next = newNode;
	}
	private boolean isEmpty() {
		Node current = head;
		if(current == null) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Llist obj = new Llist();
		obj.insertFirst(1);
		obj.insertLast(4);
		obj.insertFirst(3);
		obj.insert_pos(0, 10);
		obj.insert_pos(4, 20);
		obj.insert_pos(2, 10);
		obj.delete_pos(3);
//		obj.delete_last();
//		obj.delete_last();
//		obj.delete_begin();
		obj.printLinkedList();
	}

}
