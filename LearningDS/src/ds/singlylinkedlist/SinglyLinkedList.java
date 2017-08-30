package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.refNode = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.refNode;
		return first;
	}
	
	public void displayList() {
		System.out.println("List (first -> last)");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.refNode;
		}
	}
	
	public void insertLast(int value) {
		Node current = first;
		while(current.refNode != null)
			current = current.refNode;
		
		Node newNode = new Node();
		newNode.value = value;
		current = newNode;
	}
}
