package ds.circulalinkedlist;

import ds.singlylinkedlist.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int value) {
		Node newNode = new Node();
		newNode.value = value;
		
		if(isEmpty()) {
			last = newNode;
		}
		
		newNode.refNode = first;
		first = newNode;
	}
	
	public void insertLast(int value) {
		Node newNode = new Node();
		newNode.value = value;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.refNode = newNode;
			last = newNode;
		}
	}
	
	public int deleteFirst() {
		int temp = first.value;
		
		if(first.refNode == null)
			last = null;
		
		first = first.refNode;
		
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first -> last)");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.refNode;
		}
	}
}
