package ds.singlylinkedlist;

public class Node {
	public int value;
	public Node refNode = null;
	
	public Node() {
		
	}
	
	public void displayNode() {
		System.out.println("{" + value + "}");
	}
}
