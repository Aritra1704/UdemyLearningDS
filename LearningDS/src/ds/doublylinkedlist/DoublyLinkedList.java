package ds.doublylinkedlist;

import ds.doublylinkedlist.Node;


public class DoublyLinkedList {

	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
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
		} else {
			first.previous = newNode;
		}
		
		newNode.next = first;
		first = newNode;
	}
	
	public void insertlast(int value) {
		Node newNode = new Node();
		newNode.value = value;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.previous = last;
		}
		
		last = newNode;
	}
	
	public Node deleteFirst() {
		Node deleteNode = first;
		
		if(first.next == null)
			last = null;
		else 
			first.next.previous = null;
		
		first = first.next;
		
		return deleteNode;
	}
	
	public Node deleteLast() {
		Node deleteNode = last;
		
		if(first.next == null)
			first = null;
		else {
			last.previous.next = null;
		}
		
		last = last.previous;
		
		return deleteNode;
	}
	
	public boolean insertAfter(int key, int value) {
		boolean isSuccess = false;
		
		Node current = first;
		while(current.value != key) {
			current = current.next;
			if(current == null) {
				isSuccess = false;
				return isSuccess;
			}
		}
		
		Node newNode = new Node();
		newNode.value = value;
		
		if(current == last) {
			current.next = null;
			last = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;	
		}
			
		newNode.previous = current;
		current.next = newNode;
		isSuccess = true;
		
		return isSuccess;
	}
	
	public Node deleteKey(int key) {
		
		Node current = first;
		while(current.value != key) {
			current = current.next;
			if(current == null)
				return null;
		}

		if(current == first) 
			first = current.next; 
		else 
			current.previous.next = current.next;
		
		if(current == last) 
			last = current.previous;
		else 
			current.next.previous = current.previous;
		
		return current;
	}
	
	public void displayForward() {
		System.out.print("List (first -> last)");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.print("List (last -> first)");
		Node current = last;
		while(current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
}
