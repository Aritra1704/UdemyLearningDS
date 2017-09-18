package ds.graph;

public class Node {
	public String value;
	public Node next = null;
	
	public void displayNode() {
		System.out.print("{" + value + "} ");
	}
}
