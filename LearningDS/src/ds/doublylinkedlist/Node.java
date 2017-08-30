package ds.doublylinkedlist;

public class Node {
	public int value;
	public Node next = null;
	public Node previous = null;
	
	public void displayNode() {
		System.out.print("{" + value + "} ");
	}
}
